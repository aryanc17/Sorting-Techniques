public class RecBubble {
    
    static void recBubbleSort(int arr[], int n){
        if(n == 1) return ;

        for(int i=0; i<=n-2; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp; 
            }
        }
        recBubbleSort(arr, n-1);
    }
    public static void main(String[] args) {
        int arr[] = {3,1,7,5,9,2,0};
        recBubbleSort(arr,arr.length);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}
