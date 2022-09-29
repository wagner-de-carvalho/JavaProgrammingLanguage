package br.com.home.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("batata");
		list.add("cacau");
		list.add("uva");
		list.add("mamão");
		
		for (String s : list) {
			System.out.println(s);
		}

	}

}
