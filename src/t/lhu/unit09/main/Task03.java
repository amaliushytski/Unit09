package t.lhu.unit09.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		/**
		 * Дана матрица. Вывести на экран первый и последний столбцы.
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
		
		System.out.println("Первый столбец ------");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d]\n", mas[i][0]);
		}
		System.out.println("Последний столбец ------");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%4d]\n", mas[i][4]);
		}

	}

}
