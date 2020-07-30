package wu.threadTest;

/**
 * @ClassName : Demo2_Thread
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/29 15:12
 * @Version : 1.0
 */
public class Demo2_Thread {
    /**
     * @param args
     */
    public static void main(String[] args) {
        MyThread mt = new MyThread();       //4,创建Thread类的子类对象
        mt.start();                         //5,开启线程,调用run方法

        for (int i = 0; i < 1000; i++) {
            System.out.println("bb");
        }
    }

    static class MyThread extends Thread {             //1,继承Thread
        public void run() {                     //2,重写run方法
            for (int i = 0; i < 1000; i++) {     //3,将要执行的代码写在run方法中
                System.out.println("aaaaaaaaaaaa");
            }
        }
    }
}
