package br.com.home.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {
		Class<Televisao> tvClass = Televisao.class;

		Field[] fields = tvClass.getDeclaredFields();

		for (Field f : fields) {
			System.out.println(f.getName() + " => " + f.getType());
		}

		Method[] methods = tvClass.getDeclaredMethods();

		for (Method m : methods) {
			System.out.println(m.getName() + Arrays.toString(m.getParameters()) + " => " + m.getReturnType());
		}

//		USANDO REFLECTION
		Televisao tv1 = new Televisao();
		Method mudarCanal = tvClass.getDeclaredMethod("mudarCanal", int.class);
		mudarCanal.invoke(tv1, 2);
		
		Method ligar = tvClass.getDeclaredMethod("ligar");
		ligar.invoke(tv1);

	}

}
