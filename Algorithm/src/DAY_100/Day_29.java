package DAY_100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day_29 {

	public static void main(String[] args) {

		ArrayList a = new ArrayList<Integer>();
		ArrayList b = new ArrayList<Integer>();
		ArrayList c = new ArrayList<Integer>();

		Scanner sc = new Scanner(System.in);

		// 하노이의 탑 원반 갯수
		int num = sc.nextInt();

		// 하노이의 탑 원 반 갯수에 맞는 숫자담기
		for (int i = 1; i <= num; i++) {
			a.add(i);
		}
		
		//리스트 내림차순 정렬
		//Collections.reverse(a);
		


		if (a.size() % 2 == 0) {
			// a의 첫번째 원소 b에 담기
			b.add(a.remove(0));
		} else {
			c.add(a.remove(0));
		}

		// a의 리스트 원소 출력
		for (int i = 0; i < a.size(); i++) {
			System.out.print("a{" + a.get(i) + "}");
		}

		System.out.println();
		// b의 리스트 원소 출력
		for (int i = 0; i < b.size(); i++) {
			System.out.print("b{" + b.get(i) + "}");
		}
		System.out.println();

		// c의 리스트 원소 출력
		for (int i = 0; i < c.size(); i++) {
			System.out.print("c{" + c.get(i) + "}");
		}
		System.out.println();
		System.out.println("///////////////////////////////////////////////");

		// 이번엔 2가 b로 가야함
		if ((int) a.get(0) > (int) c.get(0)) {
			b.add(a.remove(0));
		} else {
			c.add(a.remove(0));
		}

		// a의 리스트 원소 출력
		for (int i = 0; i < a.size(); i++) {
			System.out.print("a{" + a.get(i) + "}");
		}

		System.out.println();
		// b의 리스트 원소 출력
		for (int i = 0; i < b.size(); i++) {
			System.out.print("b{" + b.get(i) + "}");
		}
		System.out.println();

		// c의 리스트 원소 출력
		for (int i = 0; i < c.size(); i++) {
			System.out.print("c{" + c.get(i) + "}");
		}
		System.out.println();
		System.out.println("///////////////////////////////////////////////");

		// a의 원소값을 b와 c와 비교하여 a의 원소값이 더 크면 b와c의 원소값을 비교하여 작은 숫자를 옮긴다.
		if (((int) a.get(0) > (int) c.get(0)) && (((int) a.get(0) > (int) b.get(0)))) {
			if (((int) b.get(0) > (int) c.get(0))) {
				b.add(0, c.remove(0));
			}
		}

		// a의 리스트 원소 출력
		for (int i = 0; i < a.size(); i++) {
			System.out.print("a{" + a.get(i) + "}");
		}

		System.out.println();
		// b의 리스트 원소 출력
		for (int i = 0; i < b.size(); i++) {
			System.out.print("b{" + b.get(i) + "}");
		}
		System.out.println();

		// c의 리스트 원소 출력
		for (int i = 0; i < c.size(); i++) {
			System.out.print("c{" + c.get(i) + "}");
		}
		System.out.println();
		System.out.println("///////////////////////////////////////////////");

		// a의 원소 옮기기
		if (a.size() % 2 == 0) {
			// a의 첫번째 원소 b에 담기
			b.add(a.remove(0));
		} else {
			c.add(0, a.remove(0));
		}

		// a의 리스트 원소 출력
		for (int i = 0; i < a.size(); i++) {
			System.out.print("a{" + a.get(i) + "}");
		}

		System.out.println();
		// b의 리스트 원소 출력
		for (int i = 0; i < b.size(); i++) {
			System.out.print("b{" + b.get(i) + "}");
		}
		System.out.println();

		// c의 리스트 원소 출력
		for (int i = 0; i < c.size(); i++) {
			System.out.print("c{" + c.get(i) + "}");
		}
		System.out.println();
		System.out.println("///////////////////////////////////////////////");

	}

}
