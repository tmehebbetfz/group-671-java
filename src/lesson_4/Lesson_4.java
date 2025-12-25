package lesson_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Lesson_4 {
	
	public static void main(String[] args) {
		// for 
		
		// Счетчик
		// Условие
		// Инкремент
		
//		for (int i = 1; i <= 100; i++) {
//			System.out.println(i + ": Hello world!");
//		}
//		
//		
//		for (;;) {
//			System.out.println("Forever!");
//		}
		
		// while
		
//		int i = 1000;
//		
//		while(i <= 100) {
//			System.out.println(i + ": Hello world!");
//			i++;
//		}
		
		// do + while
		
//		int i = 1;
//		
//		do {
//			System.out.println(i + ": Hello world!");
//			i++;
//		} while(i <= 100);
		
		// array + for
		
//		String[] fruits = {"apple", "mango", "banana", "kiwi", "orange"};
//		
//		for (int i = 0; i < fruits.length; i++) {
//			System.out.println("Fruit " + fruits[i]);
//		}
		
		// last index
		//                    0        1         2        3        4
//		String[] fruits = {"apple", "mango", "banana", "kiwi", "orange"}; // fruits.length = 5 - 1 = 4
//		
//		System.out.println("Fruit " + fruits[fruits.length - 1]); // 5 - 1 = 4
		
		// break, continue
		
		int[] fruits = {1, 0, 1, 0, 1, 1, 1, 1, 0};
		
		for (int i = 0; i < fruits.length; i++) {
			if (fruits[i] == 0) {
				continue;
			}
			
			System.out.println("Fruit " + (fruits[i] == 0 ? "not ready" : "ready"));
		}
		
		
	}
	
}



