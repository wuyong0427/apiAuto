package wu;

import java.util.*;

/**
 * @ClassName : Test
 * @Description : todo
 * @Author : wuyong
 * @Date : 2020/7/27 14:44
 * @Version : 1.0
 */
public class Test {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        HashMap<String,String> hashMap = new HashMap<>();
        Hashtable<String,String> hashtable = new Hashtable<>();
        Object o = new Object();


        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        System.out.println(names.toString());

        System.loadLibrary("");
    }
}
