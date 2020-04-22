public class Cls_022 {

    private static void listNam(int... l){
        for (int num : l){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int[] lll = {1,4,43,3,8};

        if (lll.length == 3) {
            listNam(lll[0],lll[1]);
        } else if (lll.length == 5) {
            listNam(lll[1], lll[2], lll[4]);
        } else if (lll.length == 7) {
            listNam(lll[0], lll[3], lll[5],lll[6]);
        } else {
            //pakuri
            System.err.println("Usage : 引数の数を3個、5個、7個のいずれかにして再実行してください");
            System.exit(2);
        }
    }

}
