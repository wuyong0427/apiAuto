package wu.objectTest;

public class Demo1_Math {
    public static void main(String[] args) {
        //随机生成[1-5)
        for (int i =0 ; i<10 ;i++) {
            int i1 = (int) (Math.random() * (4 + 1));
            System.out.println(i1);
        }

    }
}
