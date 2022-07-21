package jco.ql.parser.model;

import java.util.ArrayList;
import java.util.List;

import jco.ql.parser.model.util.*;

/**
 * 
 * @author Zunstraal
 *
 */
public class UseDb extends Instruction {
		public static int UNDEFINED = -1; 
		public static int DEFAULT = 0; 
		public static int SERVER = 1; 
		public static int SERVER_CONNECTED = 2; 
		
		public List<DbName> dbList;
		public String server;
		public String connectionString;
		public int type;

		public UseDb (int seq) {
			id = USEDB_INSTRUCTION;
			instructionName = "Use DB";
			sequence = seq;
			dbList = new ArrayList<DbName> ();
			server = null;
			connectionString = null;			
			type = DEFAULT;
		}
		
		public void addDb (DbName dbName) {
			dbList.add(dbName);
		}
		
		public void setServer (String s) {
			type = SERVER;
			server = s;
		}

		public void setConnectionString (String cs) {
			type = SERVER_CONNECTED;
			connectionString = cs;
		}
		
		public boolean isDefault () {
			return (type == DEFAULT);
		}
		
		public boolean hasServer () {
			return (type > DEFAULT);
		}

		public boolean hasConnectionString () {
			return (type > SERVER);
		}

		public String toString () {
			String st = "USE ";
			
			if (dbList.size() > 0)
				st += "DB " + dbList.get(0).toString();
			
			for (int i = 1; i < dbList.size(); i++)
				st += ", DB" +  dbList.get(i).toString();						
			
			if (type == DEFAULT)
				st += " ON DEFAULT SERVER";
			else {
				st += " ON SERVER " + server;
				if (type == SERVER_CONNECTED)
					st += " " + connectionString;
			}

			return st.trim() + ";";
		}		
		
		public String toMultilineString () {
			String st = "USE ";
			
			if (dbList.size() > 0)
				st += "DB " + dbList.get(0).toString();
			
			for (int i = 1; i < dbList.size(); i++)
				st += ", " +  dbList.get(i).toString();						
			
			if (type == DEFAULT)
				st += "\n\tON DEFAULT SERVER";
			else {
				st += "\n\tON SERVER " + server;
				if (type == SERVER_CONNECTED)
					st += " " + connectionString;
			}

			return st.trim() + ";\n";
		}		

}
