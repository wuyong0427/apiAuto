package wu.stringTest;

/**
 * @ClassName : Demo2_StringBuffer
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/31 14:59
 * @Version : 1.0
 */
public class Demo2_StringBuffer {
    /**
     *  StringBuffer是字符串缓冲区,当new的时候是在堆内存创建了一个对象,底层是一个长度为16的字符数组
     当调用添加的方法时,不会再重新创建对象,在不断向原缓冲区添加字符
     */
    public static void main(String[] args) {
        //demo1();
        demo2();
    }
    private static void demo2() {
        StringBuffer sb = new StringBuffer("1234");
        sb.insert(3, "heima");                      //在指定位置添加元素,如果没有指定位置的索引就会报索引越界异常

        System.out.println(sb);
    }
    private static void demo1() {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = sb.append(true);
        StringBuffer sb3 = sb.append("heima");
        StringBuffer sb4 = sb.append(100);


        System.out.println(sb.toString());          //StringBuffer类中重写了toString方法,显示的是对象中的属性值
        System.out.println(sb2.toString());
        System.out.println(sb3.toString());
        System.out.println(sb4.toString());
    }
}