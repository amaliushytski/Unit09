package t.lhu.unit09.main;

import java.util.Random;

public class Task31 {

	public static void main(String[] args) {
		/**
		 * Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. Посчитать
		 * количество двузначных чисел в ней.
		 */
		int m = 5;
		int[][] mas = new int[m][m];
		int count = 0;

		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(999);
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

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] > 9 & mas[i][j] < 100) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
