package br.com.home.generics;

import java.util.ArrayList;
import java.util.List;

public class Buffer<T> {

	private List<T> list = new ArrayList<>();

	public void adicionar(T element) {
		list.add(element);
	}

	public void remover(T element) {
		list.remove(element);
	}
	
	public T remover() {
		T element = list.get(0);
		list.remove(element);
		return element;
	}
	
	public List<T> getBufferElements() {
		return list;
	}

}
