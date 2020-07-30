package wu.threadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @ClassName : TestRandomCallable
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/29 14:13
 * @Version : 1.0
 */
public class TestRandomCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        RandomCallable rc = new RandomCallable();   //创建一个任务
        FutureTask<String> ft = new FutureTask<>(rc);   //创建一个任务管理器

        Thread t = new Thread(ft);


        System.out.println("任务是否已完成：" + ft.isDone());
        t.start();
        System.out.println(ft.get());
        System.out.println("任务是否已完成：" + ft.isDone());
    }

}
