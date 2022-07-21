package jco.ql.parser.model.util;

/**
 * 
 * @author Zunstraal
 *
 */
public class DbName {
	public String db;
	public String alias;
	
	public DbName (String dbName) {
		db = dbName;
		alias = null;
	}
	
	public void setAlias (String alias) {
		this.alias = alias;
	}
	
	public String toString () {
		if (alias == null) 
			return db;
		return db + " AS " + alias;
	}

}
