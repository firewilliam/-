

public class MySingleton {
	//������̬����
	private static MySingleton mySingleton=null;
	
	//˽�л����캯��
	private MySingleton(){
		System.out.println("---->����ʽ����ģʽ��ʼ���ù��캯��");
	}
	
	//�ṩһ�������������ж��Ƿ��Ѿ�����ʵ�����оͷ��أ�û�оʹ���һ������
	public static MySingleton getInstance(){
		System.out.println("----->����ʽ����ģʽ��ʼ���ù��з�������ʵ��");
		if(mySingleton==null){
			System.out.println("---->����ʽ���캯����ʵ����ǰ��û�б�����");
			mySingleton=new MySingleton();
		}else{
			System.out.println("---->����ʽ���캯����ʵ����ǰ�Ѿ�������");
		}
		System.out.println("�����������ý���������ʵ��");
		return mySingleton;
	}
	//���ۣ�����ģʽ���ڸ߲���������£�ͬʱ�������������ϵ�ʵ�����̲߳���ȫ
}
