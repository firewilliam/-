
public class MySingleton3Childb extends MySingleton3 {
	public static MySingleton3Childb getInstance(){
		return (MySingleton3Childb) MySingleton3Childb.getInstance("MySingleton3Childb");
	}
	
	public String about(){
		return "---->我是MySingleton3的第二个子类MySingleton3Childb";
	}
}
