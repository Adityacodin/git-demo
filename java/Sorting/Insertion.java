package Sorting;
import java.util.Scanner;

class Insertion extends sort{

    static void insertionSort(int[] arr, int n){
        for(int i=0; i<=n-1; i++){
            int j=i; 
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size-> ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        input(arr, size);
        insertionSort(arr,size);
        printArr(arr, size);
        sc.close();
    }
}