package jco.ql.parser.test;

import java.io.FileReader;
import org.antlr.runtime.ANTLRReaderStream;
import jco.ql.parser.*;

public class ParserTester {

	
	public static void main(String[] args) {
		JCoQLParser parser = null;
		// file da parsare
		String fileIn = ".\\resources\\input.file";
  	
		try {
			JCoQLLexer lexer = new JCoQLLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
			parser = new JCoQLParser(lexer);
			parser.start();
			Environment env = parser.getEnvironment();
			
			System.out.println("Parser " + env.getVersion() + 
							" - Release " + env.getRelease() + 
							":\tNumero di istruzioni analizzate: " + env.getNInstruction());

			System.out.println("\nNumero di errori:\t" + env.getErrorList().size());
		    // lista degli errori (eventuali)
		    for (int i=0;i<env.getErrorList().size();i++)
		    	System.out.println((i+1) + ".\t" + parser.getErrorList().get(i));
	    
		    // lista delle istruzioni
		    if (env.hasNoError()) {
			    System.out.println("\nLista delle istruzioni:");
			    for (int i=0;i<env.getInstructionList().size();i++) 
					System.out.println(env.getInstructionList().get(i).toString());
			    System.out.println("\n\nLista delle istruzioni formattata:");
			    for (int i=0;i<env.getInstructionList().size();i++) 
					System.out.println(env.getInstructionList().get(i).toMultilineString());
		    }	    
	  	
	  	} catch (Exception e) {
			System.out.println ("Parsing con ANTLR abortito\n\n");
			e.printStackTrace();
		}
  }

}
