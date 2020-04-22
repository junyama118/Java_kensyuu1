public class AAA {
    int a = 1;
    static int aa;
    final static String aaaa = "4";

    static {
        aa = 2;
    }

    AAA () {
        System.out.println(a);
        System.out.println(aa);
        a = 3;
        System.out.println(a);
        System.out.println(aaaa);
    }
}
