


public class Client {
	/**
	 * ����ʽ����ģʽ
	 * MySingleton
	 */
	public static void myprint(){
		System.out.println("---------����ʽ����ģʽ-----------");
		System.out.println("��һ��ȡ��ʵ��������ʽ��");
		MySingleton s1=MySingleton.getInstance();
		System.out.println("�ڶ���ȡ��ʵ��������ʽ��");
		MySingleton s2=MySingleton.getInstance();
		if(s1==s2){
			System.out.println(">>>>>>>s1,s2Ϊͬһʵ��������ģʽ��");
		}
		System.out.println();
	}
	public static void myprint2(){
		System.out.println("---------����ʽ����ģʽ-----------");
		System.out.println("��һ��ȡ��ʵ��������ʽ��");
		MySingleton2 s1=MySingleton2.getInstance();
		System.out.println("�ڶ���ȡ��ʵ��������ʽ��");
		MySingleton2 s2=MySingleton2.getInstance();
		if(s1==s2){
			System.out.println(">>>>>>>s1,s2Ϊͬһʵ��������ģʽ��");
		}
		System.out.println();
	}
	public static void myprint3(){
		System.out.println("---------�Ǽ�ʽ����ģʽ-----------");
		System.out.println("��һ��ȡ��ʵ�����Ǽ�ʽ��");
		MySingleton3 s1=MySingleton3.getInstance(null);
		System.out.println(s1);
		System.out.println();
		
		System.out.println("�ڶ���ȡ��ʵ�����Ǽ�ʽ��");
		MySingleton3Childa s3=MySingleton3Childa.getInstance();
		System.out.println(s3);
		System.out.println(s3.about());
		System.out.println();
		
		System.out.println("������ȡ��ʵ�����Ǽ�ʽ��");
		MySingleton3Childb s4=MySingleton3Childb.getInstance();
		System.out.println(s4);
		System.out.println(s4.about());
		System.out.println();
		
		System.out.println("���Ĵ�ȡ��ʵ�����Ǽ�ʽ����������ֱ��new����Ĺ��췽����");
		MySingleton3Childb s5=new MySingleton3Childb();
		System.out.println(s5);
		System.out.println(s5.about());
		System.out.println();
		
		System.out.println("���������Map��������е��������Կ�����ֱ��new������ʵ����û�д���Map��");
		System.out.println(s1.getMap());
		System.out.println();
		System.out.println();
	}
	
    /** 
     * ����ʽ����ģʽ�Ľ� 
     * ʵ�����ӳټ��� 
     * MySingleton2 
     */  
    public static void myprint2a(){  
        System.out.println("---------------����ʽ����ģʽ�Ľ�--------------");  
        System.out.println("��һ��ȡ��ʵ�����Ľ�����ʽ��");  
        MySingleton2a s1 = MySingleton2a.getInstance();  
        System.out.println("�ڶ���ȡ��ʵ�����Ľ�����ʽ��");  
        MySingleton2a s2 = MySingleton2a.getInstance();  
        if(s1==s2){  
            System.out.println(">>>>>s1,s2Ϊͬһʵ�����Ľ�����ʽ��<<<<<");  
        }  
        System.out.println();  
    }  
    
    
    /** 
     * Properties�����ļ����� 
     * MySingleton4 
     */  
    public static void myprint4(){  
        System.out.println("---------------����ģʽʵ��--------------");  
        System.out.println("��һ��ȡ��ʵ��");  
        MySingleton4 s1 = MySingleton4.getInstance();  
        System.out.println(s1.getPuser());  
        System.out.println(s1.getPpassword());  
        System.out.println("�ڶ���ȡ��ʵ��");  
        MySingleton4 s2 = MySingleton4.getInstance();  
        System.out.println(s2.getPuser());  
        System.out.println(s2.getPpassword());  
        if(s1==s2){  
            System.out.println(">>>>>s1,s2Ϊͬһʵ�����Ľ�����ʽ��<<<<<");  
        }  
        System.out.println();  
    }  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����ʽ
		//myprint();
		//����ʽ
		//myprint2();
		//����ʽ�Ľ�
		//myprint2a();
		//�Ǽ�ʽ
		//myprint3();
		//ʵ��  
	    myprint4();  
		
		
	}

}
