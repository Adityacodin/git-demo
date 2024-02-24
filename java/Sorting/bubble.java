import java.util.Scanner;
class bubble{

    static Scanner sc = new Scanner(System.in);
    static void bubbleSort(int[] arr, int n){
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[i]<arr[j]){
                    int temp =arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    static void input(int[] arr, int n){
        System.out.println("Enter unsorted sequence -> ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    }
    static void printArr(int[] arr,int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        System.out.print("Size-> ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        input(arr, size);
        bubbleSort(arr, size);
        printArr(arr,size);
    }
}