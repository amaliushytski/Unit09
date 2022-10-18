package t.lhu.unit09.main;

import java.util.Arrays;
import java.util.Random;

public class Task33 {

	public static void main(String[] args) {
		/**
		 * Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
		 */
		int m = 10;
		int[][] mas = new int[m][m];

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
		// Сортировка по возрастанию
		int temp;
		for (int i = 0; i < mas.length; i++) {
			boolean sorted = false;
			while (!sorted) {
				sorted = true;
				for (int j = 0; j < mas.length - 1; j++) {
					if (mas[j][i] > mas[j + 1][i]) {
						temp = mas[j][i];
						mas[j][i] = mas[j + 1][i];
						mas[j + 1][i] = temp;
						sorted = false;
					}
				}
			}
		}

		System.out.print("Отсортированный по возрастанию массив:\t\t ");
		System.out.println();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%3d ", mas[i][j]);
			}
			System.out.println();
		}
		
		//Сортировка по убыванию
				int temp2;
				for (int i = 0; i < mas.length; i++) {
					boolean sorted = false;
					while (!sorted) {
						sorted = true;
						for (int j = 0; j < mas.length - 1; j++) {
							if (mas[j][i] < mas[j + 1][i]) {
								temp = mas[j][i];
								mas[j][i] = mas[j + 1][i];
								mas[j + 1][i] = temp;
								sorted = false;
							}
						}
					}
				}
				System.out.println();
				System.out.print("Отсортированный по убыванию массив:\t\t ");
				System.out.println();
				for (int i = 0; i < mas.length; i++) {
					for (int j = 0; j < mas[i].length; j++) {
						System.out.printf("%3d ", mas[i][j]);
					}
					System.out.println();
				}
	}

}
