
public class MySingleton3Childa extends MySingleton3 {
	public static MySingleton3Childa getInstance(){
		
		return (MySingleton3Childa) MySingleton3.getInstance("MySingleton3Childa");//���õĸ����getInstance����
	}
	
	public String about(){
		return "---->����MySingleton3�ĵ�һ������MySingleton3Childa";
	}
}
