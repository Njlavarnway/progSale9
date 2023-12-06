package salerecordpack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class program9 {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Please provide the CSV file path as an argument.");
			return;
		}

		String csvFilePath = args[0];

		// Experiment 1
		performExperiment(csvFilePath, "CustomerLastName", "JavaStringHash");

		// Experiment 2
		performExperiment(csvFilePath, "SalespersonLastName", "JavaStringHash");

		// Experiment 3
		performExperiment(csvFilePath, "CustomerLastName", "SummationHash");

		// Experiment 4
		performExperiment(csvFilePath, "SalespersonLastName", "SummationHash");
	}

	private static void performExperiment(String csvFilePath, String keyType, String hashFunction) {
		long startTime = System.currentTimeMillis();

		// Initialize HashMap and ArrayList
		HashMap<String, SaleRecord> hashMap = new HashMap<>(16);
		ArrayList<SaleRecord> recordList = new ArrayList<>();

		// Read CSV file and populate HashMap and ArrayList
		readCSVAndPopulateData(csvFilePath, hashMap, recordList, keyType, hashFunction);

		// Calculate average number of comparisons
		double averageComparisons = calculateAverageComparisons(hashMap, recordList);

		// Print results
		System.out.println("Experiment " + getExperimentNumber(keyType, hashFunction) + ":");
		System.out.println((System.currentTimeMillis() - startTime) + " milliseconds to build the HashMap");
		System.out.println("Average number of comparisons: " + averageComparisons +
				" - Table size: " + hashMap.size());
	}

	private static void readCSVAndPopulateData(String csvFilePath, HashMap<String, SaleRecord> hashMap,
			ArrayList<SaleRecord> recordList, String keyType, String hashFunction) {
		// Implement CSV reading and data population logic here
		// Use keyType and hashFunction to determine which key and hash function to use
	}

	private static double calculateAverageComparisons(HashMap<String, SaleRecord> hashMap, ArrayList<SaleRecord> recordList) {
		// Implement logic to calculate average number of comparisons
		return 0.0; // Placeholder, replace with actual calculation
	}

	private static int getExperimentNumber(String keyType, String hashFunction) {
		// Implement logic to determine experiment number based on keyType and hashFunction
		return 0; // Placeholder, replace with actual determination
	}

	// SaleRecord class definition
	private static class SaleRecord {
		// Define SaleRecord attributes
	}
}



