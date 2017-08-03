

public class MySingleton {
	//设立静态变量
	private static MySingleton mySingleton=null;
	
	//私有化构造函数
	private MySingleton(){
		System.out.println("---->懒汉式单例模式开始调用构造函数");
	}
	
	//提供一个公开方法，判断是否已经存在实例，有就返回，没有就创建一个返回
	public static MySingleton getInstance(){
		System.out.println("----->懒汉式单例模式开始调用共有方法返回实例");
		if(mySingleton==null){
			System.out.println("---->懒汉式构造函数的实例当前并没有被创建");
			mySingleton=new MySingleton();
		}else{
			System.out.println("---->懒汉式构造函数的实例当前已经被创建");
		}
		System.out.println("公开方法调用结束，返回实例");
		return mySingleton;
	}
	//结论：懒汉模式，在高并发的情况下，同时创建了两个以上的实例，线程不安全
}
