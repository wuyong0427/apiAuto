package wu.stringTest;

/**
 * @ClassName : Demo2_indexOf
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/31 9:56
 * @Version : 1.0
 */
public class Demo2_indexOf {
    public static void main(String[] args) {

        String max = "asdfg3hjklwusdfawer";
        String min = "wu";
        String mas = "12312498";
        //如果大字符串包含小字符串，返回小符串的第一个字符的索引
        System.out.println(max.indexOf(min));
        //如果大字符串没有包含小字符串，返回-1
        System.out.println(max.indexOf("yong"));
        //从指定字符索引开始查找
        System.out.println(max.indexOf("w",11));
        //字符串的规范并表示
        System.out.println(max.intern());

    }

}
