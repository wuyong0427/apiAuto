package wu.stringTest;

/**
 * @ClassName : Demo4_compareTo
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/31 11:33
 * @Version : 1.0
 */
public class Demo4_compareTo {
    public static void main(String[] args) {
        String s1 = "a";
        String s2 = "aaa";

        int num = s1.compareTo(s2);             //按照码表值比较
        System.out.println("num="+num);

        String s3 = "黑";
        String s4 = "马";
        int num2 = s3.compareTo(s4);
        System.out.println('黑' + 0);            //查找的是unicode码表值
        System.out.println('马' + 0);
        System.out.println("num2="+num2);

        String s5 = "heima";
        String s6 = "HEIMA";
        int num3 = s5.compareTo(s6);
        System.out.println("num3="+num3);

        int num4 = s5.compareToIgnoreCase(s6);
        System.out.println("num4="+num4);
    }


}
