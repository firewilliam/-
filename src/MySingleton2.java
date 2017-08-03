

public class MySingleton2 {
	//设立静态变量,直接创建实例
	private static MySingleton2 mySingleton=new MySingleton2();
	
	//私有化构造函数
	private MySingleton2(){
		System.out.println("---->饿汉式单例模式开始调用构造函数");
	}
	
	//提供一个公开方法，判断是否已经存在实例，有就返回，没有就创建一个返回
	public static MySingleton2 getInstance(){
		System.out.println("---->饿汉式单例模式开始调用共有方法返回实例");
		return mySingleton;
	}
	//结论：饿汉模式，在第一次创建对象以后，不再创建任何实例，但次单一实例一直存在，线程安全，但是过于占用系统资源
}
