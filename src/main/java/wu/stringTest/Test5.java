package wu.stringTest;

/**
 * @ClassName : Test5
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/31 14:05
 * @Version : 1.0
 */
public class Test5 {


    /**
     * 分析:
     1,需要定义一个字符串"["
     2,遍历数组获取每一个元素
     3,用字符串与数组中的元素进行拼接
     */
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String s = "[";                         //定义一个字符串用来与数组中元素拼接

        for (int i = 0; i < arr.length; i++) {  //{1,2,3}
            if(i == arr.length - 1) {
                s = s + arr[i] + "]";           //[1, 2, 3]
            }else {
                s = s + arr[i] + ", ";          //[1, 2,
            }
        }

        System.out.println(s);
    }


}
