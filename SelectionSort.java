public class SelectionSort {
    
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            int min_idx = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx = j;
                }
            }
            if(min_idx != i){
                swap(arr,i,min_idx);
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,7,5,9,2,0};
        selectionSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
