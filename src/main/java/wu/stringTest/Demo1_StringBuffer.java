package wu.stringTest;

/**
 * @ClassName : Demo1_StringBuffer
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/31 14:55
 * @Version : 1.0
 */
public class Demo1_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.length());            //容器中的字符个数,实际值
        System.out.println(sb.capacity());          //容器的初始容量,理论值

        StringBuffer sb2 = new StringBuffer(10);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        StringBuffer sb3 = new StringBuffer("heima");
        System.out.println("sb3="+sb3.length());           //实际字符的个数
        System.out.println("sb3="+sb3.capacity());         //字符串的length + 初始容量

    }

}
