public class MergeSort {
    
    public static void mergeSort(int arr[], int l, int r){
        int mid = (l+r)/2;
        if(l >= r) return;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr,l,mid,r);
    }

    static void merge(int arr[], int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r - mid;

        int left[] = new int[n1];
        int right[] = new int[n2];

        int i, j, k;

        for(i = 0; i<n1; i++) left[i] = arr[l+i];
        for(i = 0; i<n2; i++) right[i] = arr[mid+1+i];

        i =0;
        j = 0;
        k = l;

        while(i < n1 && j < n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }

        while(i<n1){
            arr[k++] = left[i++];
        }

        while(j<n2){
            arr[k++] = right[j++];
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,7,5,9,2,0};
        mergeSort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
