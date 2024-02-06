import java.util.Scanner;

public class sorting{
    static int partition(int[] arr,int low,int high){
        int pivot = arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }
            while(arr[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
            arr[low] = arr[j];
            arr[j] = temp;
        return j;
    }
    static void qs(int[] arr, int low, int high){
        if(low<high){
            int pIndex  = partition(arr,low,high);
            qs(arr,low,pIndex-1);
            qs(arr,pIndex+1,high);
        }
    }
    static void input(int[] arr, int size, Scanner sc){
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
    }
    static void output(int[] arr,int size){
        for(int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("size-> ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        input(arr,n,sc);
        qs(arr,0,n-1);
        output(arr,n);
        sc.close();
    }
}
