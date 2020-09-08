package com.vn.entities;

import java.util.Iterator;

public class CusIdAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String beforeId = null;
		String prefix = "C";
		int uperUnit = 1;
		int length = 7;
		String charCode = "0";
		String newId1 = generateCusID(beforeId, prefix, uperUnit, length, charCode);
		String newId2 = generateCusID(newId1, prefix, uperUnit, length, charCode);
		System.out.println(newId1);
		System.out.println(newId2);
	}

	private static String generateCusID(String beforeId, String prefix, int uperUnit, int length, String charCode) {
		StringBuilder kq = new StringBuilder(prefix);
		int base = 1;
		if(beforeId != null) {
			base += uperUnit;
		}
		int totalCharSpace = length - String.valueOf(base).length() - prefix.length();
		for (int i = 0; i < totalCharSpace; i++) {
			kq.append(charCode);
		}
		kq.append(base);
		return kq.toString();
	}

}
