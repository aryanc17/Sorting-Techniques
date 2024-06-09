class BubbleSort{

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    static void bubbleSort(int arr[]){
        int n = arr.length;

        for(int i = 0; i < n- 1; i++){
            boolean flag = false;
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    flag = true;
                }
            }
            if(flag == false) return;
        }
    }
    public static void main(String[] args) {
        int arr[] = {3,1,7,5,9,2,0};
        bubbleSort(arr);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}