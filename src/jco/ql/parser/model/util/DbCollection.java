package jco.ql.parser.model.util;

/**
 * 
 * Collection name as a couple (dbname, collectionname)
 *
 */
public class DbCollection {
	public String db;
	public String collection;
	public String alias;
	
/**
 * 
 * @param collectionName: string
 * @param dbName: string
 * @param alias: string
 */
	public DbCollection (String collectionName, String dbName, String aliasName) {
		collection = collectionName;
		db = dbName;
		alias = aliasName;
	}

/**
 * 	
 * @return the collection name in a dot notation string-form 
 */
	public String getDbCollectionString () {
		if (db == null)
			return collection;
		return collection + "@" + db;
	}	

	public boolean hasDbName () {
		return (db != null);
	}
	
	public boolean hasAlias () {
		return (alias != null);
	}
	
	public boolean equals (DbCollection dc) {
		return getDbCollectionString().equals(dc.getDbCollectionString());
	}

	public boolean sameCollectionName (DbCollection dc) {
		String al1 = collection;
		String al2 = dc.collection;
		if (hasAlias())
			al1 = alias;
		if (dc.hasAlias())
			al2 = dc.alias;

		return al1.equals(al2);
	}

	public String toString () {
		String st = getDbCollectionString ();
		if (alias != null)
			st += " AS " + alias;
		return st;
	}	
	
	
}
