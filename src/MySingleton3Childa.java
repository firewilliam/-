
public class MySingleton3Childa extends MySingleton3 {
	public static MySingleton3Childa getInstance(){
		
		return (MySingleton3Childa) MySingleton3.getInstance("MySingleton3Childa");//调用的父类的getInstance方法
	}
	
	public String about(){
		return "---->我是MySingleton3的第一个子类MySingleton3Childa";
	}
}
