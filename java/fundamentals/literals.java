package fundamentals;

public class literals {
    public static void main(String[] args){

        // assigning base 10
        int num1 = 12;
        System.out.println(num1);

        // assigning base 2
        int num2 = 0b1100;
        System.out.println(num2);

        //assigning base 16
        int num3 = 0xC;
        System.out.println(num3);

        int num4 = 1_00_000;
        System.out.println(num4);

        double num5 = 1e2;
        System.out.println((int)num5);

        // assigning boolean var with 1 will give error

        char c = 'a';
        for(int i = 1; i<=26; i++){
            System.out.print(c++ + " ");
        }
        System.out.println();
        
    }
}
