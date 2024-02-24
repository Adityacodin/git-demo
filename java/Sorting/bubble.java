package Sorting;
import java.util.Scanner;

class bubble extends sort{
    static void bubbleSort(int[] arr, int n){
        for(int i=n-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
   
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Size-> ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        input(arr, size);
        bubbleSort(arr, size);
        printArr(arr,size);
        sc.close();
    }
}