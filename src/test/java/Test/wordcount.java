package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class wordcount {
	public static void main(String[] args) {
		ArrayList<Integer> a1= new ArrayList<Integer>();
		ArrayList<Integer> a2= new ArrayList<Integer>();
//		ArrayList<Integer> a3= new ArrayList<Integer>();
		a1.add(1);
		a1.add(4);
		a1.add(15);
		a1.add(5);
		a2.add(5);
		a2.add(15);
		a2.add(1);
		a1.retainAll(a2);
		System.out.println(a1);
	}

}
