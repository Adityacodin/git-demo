package Sorting;
import java.util.Scanner;

public class sort {
    
    static Scanner sc = new Scanner(System.in);
    public static void input(int[] arr, int n){
        System.out.println("Enter unsorted sequence -> ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
    }
    public static void printArr(int[] arr,int size){
            for(int i=0; i<size; i++){
                System.out.print(arr[i]+" ");
            }
        }
}
