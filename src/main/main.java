package main;

import controller.ControllerQuickSort;

public class main {

	public static void main(String[] args) {
		ControllerQuickSort controllerQuickSort = new ControllerQuickSort();
		
		int vetor [] = {69, 68, 32, 36, 91, 19, 28, 44, 88, 73, 37, 99, 1};
		controllerQuickSort.quickSort(vetor, 0, vetor.length - 1);
		
		for (int valor:vetor) {
			System.out.print(valor);
			System.out.print(" ");
		}
		
		

	}

}
