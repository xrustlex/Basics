package basics.designPatterns;

public class DatabaseSingleton {

	private static DatabaseSingleton singletonInstance = null;

	private DatabaseSingleton() {	
	}
	
	public static DatabaseSingleton getInstance() {
		if(singletonInstance == null) {
			singletonInstance = new DatabaseSingleton();	
		}

		return singletonInstance;
	}
}
