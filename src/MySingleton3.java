import java.util.HashMap;
import java.util.Map;



public class MySingleton3 {
	//设立静态变量,直接创建实例
	private static Map<String, MySingleton3> map=new HashMap<String, MySingleton3>();
	
	//----protected(受保护的)----构造函数
	//不能是私有的，但是这样子类可以直接访问构造函数
	//？？？？？解决方法式把你的实例类放到一个外在的包中，以便在其他包中的类（包括缺省的类）无法实例化一个单例类？？
	protected MySingleton3(){
		System.out.println("---->私有化构造函数被调用，创建实例中");
		
	}
	
	//提供一个公开方法，判断是否已经存在实例，有就返回，没有就创建一个返回
	public static MySingleton3 getInstance(String name){
		if(name==null){
			name=MySingleton3.class.getName();
			System.out.println("-->name不存在，name赋值等于MySingleton3.class.getName():"+name);
		}
		if(map.get(name)==null){
			try {
				System.out.println("-->name:"+name+"对应的值不存在，开始创建");
				map.put(name, (MySingleton3) Class.forName(name).newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else{
			System.out.println("-->name对应的值存在");
		}
		System.out.println("-->返回name对应的值");
		return map.get(name);
	}
	
	public Map<String, MySingleton3> getMap(){
		return map;
	}
}
