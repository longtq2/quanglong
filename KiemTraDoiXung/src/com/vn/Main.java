package com.vn;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap 1 chuoi vao");
		String chuoi = scanner.nextLine();
		String ktchuoi = "";
		System.out.println(chuoi);
		for(int i = chuoi.length() - 1; i >= 0; i--) {
			ktchuoi = ktchuoi + chuoi.charAt(i);
		}
			if(chuoi.equals(ktchuoi)) {
				System.out.println("chuoi la doi xung");
			}
			else
			{
				System.out.println("chuoi khong phai la doi xung");
			}
	}
}
