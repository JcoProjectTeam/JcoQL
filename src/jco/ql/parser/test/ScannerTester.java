package jco.ql.parser.test;

import java.io.FileReader;
import java.io.FileWriter;

import org.antlr.runtime.*;

import jco.ql.parser.*;


public class ScannerTester {
  public static void main(String[] args) {
  	String fileIn = ".\\resources\\input.file";
  	String fileOut = ".\\resources\\lexer.ANTRL.txt";
  	FileWriter fOut;
  	Token tk;
  	int i;

 
		try {
			System.out.println ("Test ANTLR lexer");
			JCoQLLexer lexer = new JCoQLLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
			fOut = new FileWriter (fileOut);
			i = 0;
			while ((tk = lexer.nextToken()).getType() != JCoQLLexer.EOF) {
				System.out.println(++i + ":[" + tk.getLine() + "," + tk.getCharPositionInLine() + "]\t" + 
						"TokenType:" + tk.getType() + ":\t" + tk.getText());
			} 
			fOut.close();
		} catch (Exception e) {
			System.out.println ("Test ANTLR abortito");
			e.printStackTrace();
		}
  }
}
