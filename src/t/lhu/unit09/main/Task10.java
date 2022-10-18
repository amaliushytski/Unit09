package t.lhu.unit09.main;

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		/**
		 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
		 */
		int n = 5;
		int k = 2;
		int p = 3;
		int[][] mas = new int[n][n];

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(9);
			}
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d ", mas[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("------------------------");
		System.out.println("K-я строка ------");
		for (int x : mas[k]) {
			System.out.printf("[%3d]", x);
		}
		System.out.println();
		System.out.println("Р-ый столбец ------");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d]\n", mas[i][p]);
		}
	}

}
