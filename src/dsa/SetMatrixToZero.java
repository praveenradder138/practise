package dsa;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMatrixToZero {

	/**
	 * Problem Statement: Given a matrix if an element in the matrix is 0 then you
	 * will have to set its entire column and row to 0 and then return the matrix.
	 */

	public static void main(String[] args) {

		bruteForce();
		System.out.println();
		betterApproach();
		System.out.println();
		bestApproach();

	}

	private static void bestApproach() {

		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(0, 1, 1)));
		matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
		matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

		int rows = matrix.size();
		int cols = matrix.get(0).size();
		int col0 = 1;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {

				if (matrix.get(i).get(j) == 0) {

					matrix.get(i).set(0, 0);
					if (j == 0) {
						col0 = 0;
					} else {
						matrix.get(0).set(j, 0);
					}

				}
			}

		}

		for (int i = 1; i < rows; i++) {
			for (int j = 1; j < cols; j++) {
				if (matrix.get(i).get(j) != 0) {
					if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
						matrix.get(i).set(j, 0);
					}
				}

			}

		}

		if (matrix.get(0).get(0) == 0) {
			for (int j = 0; j < cols; j++) {
				matrix.get(0).set(j, 0);
			}
		}

		if (col0 == 0) {
			for (int i = 0; i < rows; i++) {
				matrix.get(i).set(0, 0);
			}
		}

		print(matrix, rows, cols);

	}

	private static void betterApproach() {

		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
		matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
		matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

		int rows = matrix.size();
		int cols = matrix.get(0).size();

		int[] rowsArray = new int[rows];
		int[] colsArray = new int[cols];

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (matrix.get(i).get(j) == 0) {

					rowsArray[i] = -1;
					colsArray[j] = -1;
				}
			}
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (rowsArray[i] == -1 || colsArray[j] == -1) {

					matrix.get(i).set(j, 0);
				}
			}
		}

		print(matrix, rows, cols);

	}

	private static void bruteForce() {
		ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
		matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));
		matrix.add(new ArrayList<>(Arrays.asList(1, 0, 1)));
		matrix.add(new ArrayList<>(Arrays.asList(1, 1, 1)));

		int rows = matrix.size();
		int cols = matrix.get(0).size();
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				if (matrix.get(i).get(j) == 0) {
					markColumn(matrix, j, rows);
					markRows(matrix, i, cols);
				}
			}
		}

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				if (matrix.get(i).get(j) == -1) {
					matrix.get(i).set(j, 0);
				}
			}
		}

		print(matrix, rows, cols);
	}

	private static void print(ArrayList<ArrayList<Integer>> matrix, int rows, int cols) {
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < cols; j++) {

				System.out.print(matrix.get(i).get(j) + " ");

			}
			System.out.println();
		}
	}

	private static void markRows(ArrayList<ArrayList<Integer>> matrix, int i, int cols) {

		for (int j = 0; j < cols; j++) {
			if (matrix.get(i).get(j) != 0) {
				matrix.get(i).set(j, -1);
			}
		}

	}

	private static void markColumn(ArrayList<ArrayList<Integer>> matrix, int j, int rows) {

		for (int i = 0; i < rows; i++) {
			if (matrix.get(i).get(j) != 0) {
				matrix.get(i).set(j, -1);
			}
		}

	}
}
