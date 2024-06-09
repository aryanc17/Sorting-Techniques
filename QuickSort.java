public class QuickSort {
    
    static void quickSort(int[] arr, int st, int end){
        if(st >= end) return;
        int pi = partition(arr,st,end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }

    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int cnt = 0;

        for(int i=st+1; i<=end; i++){
            if(pivot >=arr[i])cnt++;
        }

        int pivotIndex = st + cnt;

        swap(arr,st,pivotIndex);

        int i = st, j = end;

        while(i < pivotIndex && j > pivotIndex){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;

            if(i<pivotIndex && j > pivotIndex){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {3,1,7,5,9,2,0};
        quickSort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
