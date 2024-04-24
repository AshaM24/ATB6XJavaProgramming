package ex_18042024;

public class Lab038 {
    public static void main(String[] args) {

        int a = 67;
        boolean i= a > 20;
        boolean j= a < 78;
        System.out.println(i);
        System.out.println(j);

        boolean b =! ((a > 20) && (a < 78)); //!(T && T);

        System.out.println(b);

    }
}
