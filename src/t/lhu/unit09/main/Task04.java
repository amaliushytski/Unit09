package t.lhu.unit09.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		/**
		 * Дана матрица. Вывести на экран первую и последнюю строки.
		 */
		int[][] mas = new int[5][5];

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

		System.out.println("Первая строка ------");
		for (int x : mas[0]) {
			System.out.printf("[%3d]", x);

		}
		System.out.println("\nПоследняя строка ------");
		for (int x : mas[mas.length-1]) {
			System.out.printf("[%3d]", x);

		}
	}

}
