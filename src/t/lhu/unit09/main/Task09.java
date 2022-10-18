package t.lhu.unit09.main;

import java.util.Random;

public class Task09 {

	public static void main(String[] args) {
		/**
		 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
		 */
		int n = 5;
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

		for (int i = 0; i < mas.length; ++i) {
			System.out.print(mas[i][i] + "  ");
			System.out.println();

		}

	}

}
