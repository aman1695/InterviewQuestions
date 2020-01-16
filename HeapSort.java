public class HeapSort {

    /**
     * @param args the command line arguments
     */
//    public static int[] array = {1,12,9,5,6,10};
    public static void main(String[] args) {
        int[] array = {1,12,9,5,6,10};
        HeapSort heap = new HeapSort();
        heap.sort(array);
        heap.printArray(array);
        
        
    }
    public void sort(int[] array){
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
          heapify(array, n, i);
        }
            
 
		// Heap sort
        for (int i=n-1; i>=0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
 
          	// Heapify root element
            heapify(array, i, 0);
        }
    }
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i < n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    public static int[] heapify(int[] array, int n, int i){
         int largest = i;
         int l = 2*i + 1;
         int r = 2*i + 2;
         if(l<n && array[l]>array[largest]){
             largest = l;
         }
         if(r<n && array[r]>array[largest]){
             largest = r;
         }
         if(largest != i){
             array = swap(array,i,largest);
             heapify(array, n, largest);
         }else{
             return array;
         }
        return array;
         
    }
    private static int[] swap(int[] array, int root, int largest) {
        int x = array[root];
        array[root] = array[largest];
        array[largest] = x;
        
        return array;
    }
    
}
