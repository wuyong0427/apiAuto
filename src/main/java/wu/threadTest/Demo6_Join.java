package wu.threadTest;

/**
 * @ClassName : Demo6_Join
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/30 10:09
 * @Version : 1.0
 */
public class Demo6_Join {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(() -> {
            System.out.println("hello");
        });
        System.out.println("start");
        t.start();
        t.join();//主线程将等待t线程结束在继续执行
        System.out.println("end");
    }

}
