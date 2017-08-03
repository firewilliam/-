/**
 * ����ʽ����ģʽ�Ľ�
 * ʵ���ӳټ��أ�����
 * Lazy initialization holder class
 * ���ģʽ�ۺ�������java���༶�ڲ���Ͷ��߳�ȱʡͬ������֪ʶ
 * @author qian.xu
 *
 */
public class MySingleton2a {
	/**
	 * �༶���ڲ��࣬Ҳ���Ǿ�̬�ĳ�Աʽ�ڲ��࣬���ڲ����ʵ�����ⲿ���ʵ��
	 * û�а󶨵Ĺ�ϵ������ֻ�б����õ��Ż�װ�أ��Ӷ�ʵ�����ӳټ���
	 * @author qian.xu
	 *
	 */
	private static class Singleton{
		/**
		 * ��̬��ʼ��������JVM����֤�̰߳�ȫ
		 */
		private static MySingleton2a singleton = new MySingleton2a();
		
		static {
			System.out.println("---->�༶���ڲ��౻����");
		}
		private Singleton(){
			System.out.println("---->�༶���ڲ��๹�캯��������");
		}
	}
	//˽�л����캯��
	private MySingleton2a(){
		System.out.println("-->��ʼ���ù��캯��");
	}
	//����һ�����з������ж��Ƿ��Ѿ�����ʵ�����з��أ�û���½�һ���ڷ���
	public static MySingleton2a getInstance(){
		System.out.println("-->��ʼ���ù��з�������ʵ��");
		MySingleton2a s1 = null;
		s1 = Singleton.singleton;
		System.out.println("-->���ص���");
		return s1;
	}
}