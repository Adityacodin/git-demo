import java.util.Scanner;

class Patterns{
    
    // pattern1
    static void solidrect(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // pattern2
    static void triangle(int n){
        for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // pattern3

    static void coltriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    // /pattern 4
    static void rowtriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    // pattern 5
    static void invtraingle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // pattern 6
    static void invcoltri(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n+1)-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    // pattern 7
    static void proptri(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n+1-i; j++){
                System.out.print(" ");
            }
            //1-st half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // 2-nd half
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern 8
    static void invprop(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n+1-i; j++){
                System.out.print("*");
            }

            for(int j=2; j<=n+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern 9
    static void diamondmid(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1; j<=n+1-i; j++){
                System.out.print(" ");
            }
            //1-st half
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            // 2-nd half
            for(int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }

            for(int j=1;j<=n+1-i; j++){
                System.out.print("*");
            }

            for(int j=2; j<=n+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern 10
    static void rightcutdiamond(int n){
        for(int i=1;i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<= n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // pattern11
    static void binarybit(int n){
        for(int i=1; i<=n; i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
                
            }
            System.out.println();
        }
    }
    // pattern12

    static void middlespacetri(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            for(int j=1;j<=2*(n-i); j++){
                System.out.print(" ");
            }
            int k=1;
            for(int j=1; j<=i;j++){
                if(j>=2){
                    System.out.print(i-k);
                    k++;
                }else
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void numtri(int n){
        int counter =1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //call the respective pattern function here.

        sc.close();
    }
}