package wu.threadTest;

/**
 * @ClassName : Demo5_Join
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/29 16:03
 * @Version : 1.0
 */
public class Demo5_Join {

    /**
     * @param args
     * join(), 当前线程暂停, 等待指定的线程执行结束后, 当前线程再继续
     */
    public static void main(String[] args) throws InterruptedException {
         Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName() + "...aaaaaaaaaaaaa");
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                  /*  if (i == 2) {
                        try {
                            t1.join();
                            //t1.join(5);                 //插队指定的时间,过了指定时间后,两条线程交替执行
                        } catch (InterruptedException e) {

                            e.printStackTrace();
                        }
                    }*/
                    System.out.println(getName() + "...bb");
                }
            }
        };


        //t1.join();
        t2.start();
        t2.join();
        t1.start();
    }


}
