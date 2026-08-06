package Apuntes.LinkedinList;

import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {

		LinkedList<String> nombres = new LinkedList<>();

		nombres.add("Pedro");
		nombres.add("Ana");
		nombres.add("Sofia");

		System.out.println(nombres);

		nombres.addFirst("Juan");
		nombres.addLast("Carlos");

		System.out.println(nombres);

		nombres.remove("Ana");

		System.out.println(nombres);
	}
}
