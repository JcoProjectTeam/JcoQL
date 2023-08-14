package jco.ql.parser.test;

import java.util.ArrayList;
import java.util.StringJoiner;

import jco.ql.parser.model.util.Field;

public class Test {

	public static void main(String[] args) {
		StringJoiner sj = new StringJoiner("\n\t\t", "Ciao Mondo\n\t\t", ";");
		sj.add("Paolo");
		sj.add("Fosci");
		sj.add("asdasdasd \n che xxxxxxx");
		System.out.println(sj.toString());
	
		
		ArrayList<String> l = new ArrayList<String>();
		l.add("1");
		l.add("2");
		l.add("3");
		l.add("4");
		
		System.out.println(l);
		l.add(0, "0");
		System.out.println(l);
		
		Field f = new Field();
		f.addField(".a");
		f.addField(".b");
		f.addField(".c");
		f.addField(".d");
		System.out.println(f.toString());
		f.addHeadField("XXXX");
		System.out.println(f.toString());
	}

}
