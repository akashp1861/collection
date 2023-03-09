package com.list;

import java.awt.List;
import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		
		
		ArrayList l1 = new ArrayList();
		l1.add(23);
		l1.add(35);
		l1.add(45);
		
		ArrayList l2 = new ArrayList();
		l2.add("Pune");
		l2.add("Mumbai");
		l2.add("Kolhapur");
		
		l1.addAll(l2);
		
		System.out.println(l1);
		
	}
}
