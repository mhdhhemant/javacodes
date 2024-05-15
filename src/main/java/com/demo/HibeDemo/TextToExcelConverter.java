package com.demo.HibeDemo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TextToExcelConverter {
	public static void main(String[] args) {
		String inputFilePath = "C:\\Users\\HP\\Desktop\\react.txt"; // Change this to your input text file path
        String outputFilePath = "C:\\Users\\HP\\Desktop\\output.xlsx"; // Change this to your desired output Excel file path

	        List<String[]> dataList = new ArrayList<>();

	        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
	            String line;
	            String[] data = new String[6];

	            while ((line = br.readLine()) != null) {
	                if (line.startsWith("Scenario:")) {
	                    data[0] = line.substring(10).trim(); // Scenario
	                    System.out.println(data[0]);

	                    for (int i = 1; i <= 5; i++) {
	                        line = br.readLine();
	                        if (line != null) {
	                            data[i] = line.substring(3).trim(); // A, B, C, D, Answer
	                            System.out.println(data[i]);
	                        } else {
	                            System.err.println("Error: Incomplete data.");
	                            break;
	                        }
	                    }

	                    // Add data to your list or perform operations with data array
	                    // Example: dataList.add(data);

	                    // Clear the data array for the next set of information
	                    data = new String[6];
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

}
