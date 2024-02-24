package Sorting;
import java.util.Scanner;

class Selection extends sort{

    static void selectionSort(int[] arr, int n){
        for(int i=0; i<n-1; i++){
            int min= i;
            for(int j=i+1; j<n; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Size-> ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        input(arr, size);
        selectionSort(arr,size);
        printArr(arr, size);
        sc.close();
    }
}