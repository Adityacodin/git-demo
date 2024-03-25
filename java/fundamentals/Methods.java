package Java.fundamentals;

public class Methods {
    public static long getSum(int a, int b){
        return a+b;
    }
    public static void main(String[] args){
        // public
        // static
        // void
        long ans = getSum(2,3);
        System.out.println(ans);
    }
}
