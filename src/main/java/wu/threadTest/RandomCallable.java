package wu.threadTest;

import java.util.concurrent.Callable;

/**
 * @ClassName : RandomCallable
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/29 14:12
 * @Version : 1.0
 */
public class RandomCallable implements Callable<String> {
        @Override
        public String call() throws Exception {

            String[] str = {"A","B","C","D","E"};   //创建一个数组，长度为5
            int random = (int)(Math.random()*4)+1;  //产生一个1~4之间的随机数
            return str[random]; //根据产生的随机数返回数组中对应位置的字符串
        }

}
