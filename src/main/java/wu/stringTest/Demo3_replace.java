package wu.stringTest;

/**
 * @ClassName : Demo3_replace
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/31 10:40
 * @Version : 1.0
 */
public class Demo3_replace {
    public static void main(String[] args) {
        String s = "afdawsfdswugdgerty";
        String s2 = s.replace('w', 'y');            //两个w，全部被替换
        System.out.println(s2);

        String s3 = s.replace('z', 'o');            //z不存在,保留原字符不改变
        System.out.println(s3);

        String s4 = s.replace("wu", "yong");
        System.out.println(s4);

        String s5 = s.replaceFirst("w","m");    //替换掉提一个w
        System.out.println(s5);

        String s6 = s.replaceAll("f","k");
        System.out.println(s6);
    }

}
