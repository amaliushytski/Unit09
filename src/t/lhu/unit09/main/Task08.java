package t.lhu.unit09.main;

public class Task08 {

	public static void main(String[] args) {
		/**
		 * Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
		 * число 7 среди элементов массива.
		 */
		int[][] mas = new int[][] { { 7, -2, -3 }, { 11, 22, -33 }, { 53, 66, 7 } };
		int count = 0;
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
				if (mas[i][j] == 7) {
					count++;

				}
			}
		}
		System.out.println(count);
	}

}
