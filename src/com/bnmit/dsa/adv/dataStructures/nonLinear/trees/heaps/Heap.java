package com.bnmit.dsa.adv.dataStructures.nonLinear.trees.heaps;
public class Heap {
    private int[] arr;
    private int size;
    public Heap(){
        arr = new int[101];
        arr[0] = -1; // Sentinel Value // Just for reference
        size = 0;
    }
    private void swap(int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void print(){
        for (int i=1; i<=size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void insert(int val){
        size++;
        arr[size] = val;
        int index = size;
        while (index > 1){
            int parent = index / 2;
            if(arr[parent] < arr[index]){
                swap(parent,index);
                index = parent;
            }else {
                return; // It's at the correct position, no swap required
            }
        }
    }
    public void deleteFromHeap(){
        if(size == 0){
            System.out.println("Nothing to delete. Empty Heap.");
            return;
        }
        arr[1] = arr[size]; // Move last element to root
        size--; // Remove last element
        // Propagate the root to it's correct position
        int i = 1;
        while (i < size){
            int leftIndex = 2 * i;
            int rightIndex = 2 * i + 1;
            if(leftIndex <= size && arr[i] < arr[leftIndex]){
                swap(i,leftIndex);
                i = leftIndex;
            }else if(rightIndex <= size && arr[i] < arr[rightIndex]){
                swap(i,rightIndex);
                i = rightIndex;
            }else {
                return;
            }
        }
    }
    public static void heapify(int[] arr, int n, int i){
        int largest = i;
        int left = 2 * i;
        int right = 2 * i + 1;
        if(left <= n && arr[largest] < arr[left]){
            largest = left;
        }
        if(right <= n && arr[largest] < arr[right]){
            largest = right;
        }
        if(largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr,n,largest);
        }
    }
    public static void heapSort(int[] arr, int n){
        int size = n;
        while (size > 1){
            int temp = arr[1];
            arr[1] = arr[size];
            arr[size] = temp;
            size--;
            // The root value at index 1 might not be at it's correct position
            // Call the heapify method to correct the position 1
            heapify(arr,size,1);
        }
    }
    public static void main(String[] args) {
        Heap maxHeap = new Heap();
        maxHeap.insert(20);
        maxHeap.insert(30);
        maxHeap.insert(50);
        maxHeap.insert(10);
        maxHeap.insert(40);
        maxHeap.print();
        maxHeap.deleteFromHeap();
        maxHeap.print();
        int[] arr = {-1,54,53,55,52,50};
        int n = 5;
        for (int i=n/2; i>0; i--){ // Only non-leaf nodes
            heapify(arr,n,i);
        }
        System.out.println("Array after heapify: ");
        for (int i=1; i<=n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array elements after Heap Sort: (n log n):");
        heapSort(arr,n);
        for (int i=1; i<=n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
