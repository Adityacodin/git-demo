package Sorting;

public class cycle extends sort{
    
    static void cycleSort(int[] arr,int n){
        int i=0;
        while(i<n){
            if(arr[i] == n) i++;
            else if(arr[i]!=i){
                int correct = arr[i];
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            }
            else i++;
        }
    }


    public static void main(String[] args) {
        int arr[] = {1,0};
        cycleSort(arr,arr.length);
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
