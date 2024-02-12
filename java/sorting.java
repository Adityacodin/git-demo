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
    static int[] a = new int[100];
    static void merge(int[] arr, int low, int mid, int high){
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                a[left]=arr[left];
                left++;
            }
            else{
                a[right] = arr[right];
                right++;
            }
        }
        while(arr[left]<=mid){
            a[left]=arr[left];
            left++;
        }
        
        while(arr[right]<=high){
            a[right]=arr[right];
            right++;
        }
        for(int i=low; i<=high; i++){
            arr[i] = a[i-low];
        }
    }
    static void ms(int[] arr, int low, int high){
        if(low<high){
        int mid = (low+high)/2;
        ms(arr,low,mid);
        ms(arr,mid+1,high);
        merge(arr,low,mid,high);
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
        ms(arr,0,n-1);
        output(arr,n);
        sc.close();
    }
}
