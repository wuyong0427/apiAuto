package wu.threadTest;

/**
 * @ClassName : Demo1_Thread
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/29 15:01
 * @Version : 1.0
 */
public class Demo1_Thread {
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            new Demo();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println("我是主线程的执行代码");
        }
    }
    static class Demo {
        @Override
        public void finalize() {
            System.out.println("垃圾被清扫了");
        }
    }
}