package com.peto.javarevisited;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MismatchInArray {

	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,4,5};
		
		List<int[]> la = Arrays.asList(a);
		List<int[]> lb = Arrays.asList(b);
		
		System.out.println("hasMismatch ? "+hasMismatch(la, lb));
	}
	
	public static <T> boolean hasMismatch(Collection<T> c1, Collection<T> c2) {
		return Collections.disjoint(c1, c2);
	}
}

