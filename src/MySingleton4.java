    import java.io.File;  
    import java.io.FileInputStream;  
    import java.io.IOException;  
    import java.util.Properties;  
      
    //Properties�����ļ��ĵ���ģʽ  
    public class MySingleton4 {  
      
        //�趨�����ļ���ַ  
        private static final String filePath = "D:/mywork/user.properties";  
        private File myFile = null;  
        //���һ�θ���ʱ��  
        private long lastTime = 0;  
        //�����ļ�  
        private Properties myProps = null;  
        //�����ļ�--�û�  
        private String p_user = "";  
        //�����ļ�--����  
        private String p_password = "";  
        //������̬������ֱ�Ӵ���ʵ��  
        private static MySingleton4 mySingleton = null; //�ڶ��ι�������ʱ����Ϊ������Ϊ��̬������mySingleton��Ϊ�� 
        /** 
         *  
         * @author qian.xu 
         * 
         */  
        private static class Singleton{  
            public static MySingleton4 getInstance(){  
                System.out.println("---->�ڲ��ഴ��ʵ������������");  
                MySingleton4 mySingleton = new MySingleton4();  
                System.out.println("---->�ڲ��෽�����ý���");  
                return mySingleton;  
            }  
        }  
          
        //��ȡ�������ļ�ȡ�õ���Ϣ  
        public String getPuser(){  
            return p_user;  
        }  
        public String getPpassword(){  
            return p_password;  
        }  
        private MySingleton4() {  
            // ˽�л����캯��  
            System.out.println("-->˽�л����캯�������ã�����ʵ����");  
            //����Ϊ����������ģʽ����properties�ļ�
            myFile = new File(filePath);  
            lastTime = myFile.lastModified();  
            if (lastTime == 0) {  
                System.err.println(filePath + " file does not exist!");  
            }  
            myProps = new Properties();  
            try {  
                myProps.load(new FileInputStream(filePath));  
                System.out.println("-->properties�ļ��������");  
                p_user = myProps.getProperty("user");  
                p_password = myProps.getProperty("password");  
                System.out.println("-->properties�ļ����Զ�ȡ���");  
            } catch (IOException e) {  
                e.printStackTrace();  
            }  
        }  
        // ����һ�����з������ж��Ƿ��Ѿ�����ʵ�����з��أ�û���½�һ���ڷ���  
        public static MySingleton4 getInstance() {  
            MySingleton4 s1 = null;  
            if(mySingleton == null){  
                System.out.println("-->û��ʵ���������ڲ��෽������ʵ��");  
                mySingleton = MySingleton4.Singleton.getInstance();  
            }  
            s1 = mySingleton;  
            System.out.println("-->����ʵ��");  
            return s1;  
        }  
    }  