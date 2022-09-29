package br.com.home.lambda.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
//		List<Integer >list = Arrays.asList(7, 4, 3, 1, 22, 12, 57, 39, 41, 28);
		
		List<Integer> list = new ArrayList<>();
		list.add(7);
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(22);
		list.add(12);
		list.add(57);
		list.add(39);
		list.add(41);
		list.add(33);
		
//		ITERAÇÃO
//		list.forEach(e -> System.out.println(e));
		
//		SORT
		list.sort((x, y) -> x.compareTo(y));
		System.out.println(list);
		
//		APLICAR FUNÇÃO NOS ITENS
		list.replaceAll(e -> e * 2);
		System.out.println(list);
		
//		REMOVER SE
		list.removeIf(e -> e % 2 != 0);
		System.out.println(list);
		
		
	}

}
