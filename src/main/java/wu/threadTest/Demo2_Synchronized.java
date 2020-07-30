package wu.threadTest;

/**
 * @ClassName : Demo2_Synchronized
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/30 10:42
 * @Version : 1.0
 */
public class Demo2_Synchronized {
    /**
     * @param args 同步代码块
     */
    public static void main(String[] args) {
        final Printer2 p = new Printer2();

        new Thread() {
            public void run() {
                while (true) {
                    p.print1();
                }
            }
        }.start();

        new Thread() {
            public void run() {
                while (true) {
                    p.print2();
                }
            }
        }.start();
    }
    static class Printer2 {
        Demo d = new Demo();

        //非静态的同步方法的锁对象是神马?
        //答:非静态的同步方法的锁对象是this
        public synchronized void print1() {                         //同步方法只需要在方法上加synchronized关键字即可
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.print("\r\n");
        }

        public synchronized void print2() {
            //synchronized(new Demo()) {                            //锁对象不能用匿名对象,因为匿名对象不是同一个对象
            synchronized (Printer2.class) {
                System.out.print("传");
                System.out.print("智");
                System.out.print("播");
                System.out.print("客");
                System.out.print("\r\n");
            }
        }
    }
    //定义的锁类
    static class Demo{
    }
}


