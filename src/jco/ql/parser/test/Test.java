package jco.ql.parser.test;

import java.util.StringJoiner;

public class Test {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("\n\t\t", "Ciao Mondo\n\t\t", ";");
		sj.add("Paolo");
		sj.add("Fosci");
		sj.add("Viva la fica\n che dio la benedica");
		System.out.println(sj.toString());
	}

}
