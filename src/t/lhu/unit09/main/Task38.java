package t.lhu.unit09.main;

import java.util.Random;

public class Task38 {

	public static void main(String[] args) {
		/**
		 * Найдите сумму двух матриц
		 */
		int m = 10;
		int[][] mas1 = new int[m][m];

		int[][] mas2 = new int[m][m];

		Random rand = new Random();
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				mas1[i][j] = rand.nextInt(999);
			}
		}
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.printf("%3d ", mas1[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				mas2[i][j] = rand.nextInt(999);
			}
		}
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				System.out.printf("%3d ", mas2[i][j]);
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("------------------------");
		System.out.println("Сумма первой матрицы равна: \n" + SumUp(mas1));
		System.out.println("Сумма первой матрицы равна: \n" + SumUp(mas2));
		System.out.println("Сумма двух матриц равна: \n" + (SumUp(mas1) + SumUp(mas2)));
	}

	public static int SumUp(int[][] x) {
		int sum = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				sum = sum + x[i][j];
			}
		}
		return sum;
	}
}
