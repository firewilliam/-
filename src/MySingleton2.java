

public class MySingleton2 {
	//������̬����,ֱ�Ӵ���ʵ��
	private static MySingleton2 mySingleton=new MySingleton2();
	
	//˽�л����캯��
	private MySingleton2(){
		System.out.println("---->����ʽ����ģʽ��ʼ���ù��캯��");
	}
	
	//�ṩһ�������������ж��Ƿ��Ѿ�����ʵ�����оͷ��أ�û�оʹ���һ������
	public static MySingleton2 getInstance(){
		System.out.println("---->����ʽ����ģʽ��ʼ���ù��з�������ʵ��");
		return mySingleton;
	}
	//���ۣ�����ģʽ���ڵ�һ�δ��������Ժ󣬲��ٴ����κ�ʵ�������ε�һʵ��һֱ���ڣ��̰߳�ȫ�����ǹ���ռ��ϵͳ��Դ
}
