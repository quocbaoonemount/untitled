public class App {

//    static String global = "global variable";
//
//    public static void main(String[] args){
//        String str = "Data type";
//        System.out.println(str);
//
//        System.out.println(global);
//        sum();
//
//        final double PI = 3.14;
//        System.out.println(PI);
//
//        System.out.println("Name\t1998");
//
//    }
//
//    public static void sum(){
//        System.out.println(global);
//    }

    static String global = "Global Variable";

    public static void main(String[] args){
        String str = "kava";
        System.out.println(str);

        sum();
        System.out.println(global);

        final double PI = 3.14;
        System.out.println(PI);

        System.out.println("Name\t1998");

        short s = 10;  // -32768 ->  32767
        int i = 100; // -2^31 -> 2^31-1
        long l = 1000000000; // -2^63 -> 2^63 -1
        long l2 = 100L;

        float f = 3.1f;
        double d = 5.7;

        char c = 'a';
        char c1 = '5';
        char c2 = 65; // 65 = 'A'

        boolean b1 = true;
        boolean b2 = false;

        Integer ref_i = 100;

//        int a = 100;
//        int b = 200;
//        System.out.println("a = " + a + ", b = " + b);
//        swap(a,b);
//        System.out.println("a = " + a + ", b = " + b);

        Integer a = 100;
        Integer  b = 200;
        System.out.println("a = " + a + ", b = " + b);
        swap(a,b);
        System.out.println("a = " + a + ", b = " + b);

        Season se = Season.SUMMER;
        System.out.println(se);

        SimpleSeason sse = SimpleSeason.AUTUMN;
        System.out.println(sse);


    }

        static void swap(Integer a, Integer b){
        Integer tmp = a;
        a = b;
        b = tmp;
        System.out.println("Swap: a = " + a + ", b = " + b);
    }

    //Swap : hàm đổi chỗ
//    static void swap(int a, int b){
//        int tmp = a;
//        a = b;
//        b = tmp;
//        System.out.println("Swap: a = " + a + ", b = " + b);
//    }

    public  static  void sum(){
        System.out.println(global);
    }

}
