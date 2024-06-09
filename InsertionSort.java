public class InsertionSort {
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void insertionSort(int arr[]){
        int n = arr.length;

        for(int i = 1; i<n; i++){
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]){
                swap(arr, j-1, j);
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,7,5,9,2,0};
        insertionSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
