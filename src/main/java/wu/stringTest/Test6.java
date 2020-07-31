package wu.stringTest;

import java.util.Scanner;

/**
 * @ClassName : Test6
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/31 10:22
 * @Version : 1.0
 */
public class Test6 {
    /**
     *  *分析:
     *1,通过键盘录入获取字符串Scanner
     *2,将字符串转换成字符数组
     *3,倒着遍历字符数组,并再次拼接成字符串
     *4,打印
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("开始输入：");
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();//转为字符数组
        String  a = "";
        for (int i= chars.length-1;i>=0;i--){
            a=a+chars[i];
            //a=chars[i]+a;//注意字符串拼接顺序
        }
        System.out.println("反转后："+a);




    }

}
