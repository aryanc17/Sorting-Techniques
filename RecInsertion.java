public class RecInsertion {
    
    static void recinsertionSort(int arr[], int i, int n){
        if(i == n) return;

        int j = i;
        while(j > 0 && arr[j-1] > arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }

        recinsertionSort(arr, i+1, n);
    }
    public static void main(String[] args) {
        int arr[] = {3,1,7,5,9,2,0};
        recinsertionSort(arr,1, arr.length);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
