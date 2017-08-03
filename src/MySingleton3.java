import java.util.HashMap;
import java.util.Map;



public class MySingleton3 {
	//������̬����,ֱ�Ӵ���ʵ��
	private static Map<String, MySingleton3> map=new HashMap<String, MySingleton3>();
	
	//----protected(�ܱ�����)----���캯��
	//������˽�еģ����������������ֱ�ӷ��ʹ��캯��
	//�����������������ʽ�����ʵ����ŵ�һ�����ڵİ��У��Ա����������е��ࣨ����ȱʡ���ࣩ�޷�ʵ����һ�������ࣿ��
	protected MySingleton3(){
		System.out.println("---->˽�л����캯�������ã�����ʵ����");
		
	}
	
	//�ṩһ�������������ж��Ƿ��Ѿ�����ʵ�����оͷ��أ�û�оʹ���һ������
	public static MySingleton3 getInstance(String name){
		if(name==null){
			name=MySingleton3.class.getName();
			System.out.println("-->name�����ڣ�name��ֵ����MySingleton3.class.getName():"+name);
		}
		if(map.get(name)==null){
			try {
				System.out.println("-->name:"+name+"��Ӧ��ֵ�����ڣ���ʼ����");
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
			System.out.println("-->name��Ӧ��ֵ����");
		}
		System.out.println("-->����name��Ӧ��ֵ");
		return map.get(name);
	}
	
	public Map<String, MySingleton3> getMap(){
		return map;
	}
}
