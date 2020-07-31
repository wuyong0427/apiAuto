package wu.stringTest;

/**
 * @ClassName : Test7
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/31 9:51
 * @Version : 1.0
 */
public class Test7 {
    //* 统计大串中小串出现的次数
    public static void main(String[] args) {
        //定义大串
        String max = "woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
        //定义小串
        String min = "heima";
        //计数器
        int count = 0;
        //定义索引
        int index = 0;
        //判断小字符串在大字符串中出现
        while((index=max.indexOf(min))!=-1){   //另一种方法：index=max.indexOf(min,index),指定开始索引的位置，
                                               // 下面就不需要截取字符了
            count++;
            max = max.substring(index+min.length());
        }
        System.out.println(count);
    }

}
