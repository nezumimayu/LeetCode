package heap;

import javax.security.auth.kerberos.KerberosKey;
import java.util.Arrays;
import java.util.PriorityQueue;

public class No_703_KthLargestElementInAStream {
    public static void main(String[] args) {
//        int k = 2;
        int k = 3;
//        int[] arr = {0,3,6,6};
        int[] arr = {5,-1};
        No_703_KthLargestElementInAStream kthLargest = new No_703_KthLargestElementInAStream(k, arr);
        kthLargest.add(2);          // returns 4
        kthLargest.add(1);          // returns 5
        kthLargest.add(-1);         // returns 5
        kthLargest.add(3);          // returns 8
        kthLargest.add(4);          // returns 8
//        kthLargest.add(12);          // returns 9
//        kthLargest.add(11);          // returns 10
//        kthLargest.add(8166);          // returns 10
    }

//    PriorityQueue<Integer> heap;
//    int k;
//
//    public No_703_KthLargestElementInAStream(int k, int[] nums) {
//        heap = new PriorityQueue<>(k);
//        this.k = k;
//        for (int num : nums) {
//            add(num);
//        }
//    }
//
//    public int add(int val) {
//        if(heap.size() < k){
//            heap.offer(val);
//        }else if(heap.peek() < val){
//            heap.poll();
//            heap.offer(val);
//        }
//        System.out.println(heap.peek());
//        return heap.peek();
//    }
    /**
     * 执行用时：27 ms, 在所有 Java 提交中击败了19.74%的用户
     * 内存消耗：43.7 MB, 在所有 Java 提交中击败了88.69%的用户
     * 特点：调用PriorityQueue<>
     */

    int[] arr;
    int key;
    int len = 0;

    public No_703_KthLargestElementInAStream(int k, int[] nums) {
        this.arr = new int[k];
        this.key = k;
        int val = Math.min(nums.length, k);
        if(nums.length != 0){
            System.arraycopy(nums, 0, arr, 0, val);
            heapSort(arr, val);
        }
        len = val;
        for (int i = k; i < nums.length; i++)
            add(nums[i]);
    }

    public int add(int val) {
        if (len < key) {
            arr[len++] = val;
            heapSort(arr, len);
        }else if(val > arr[0]){
            arr[0] = val;
            adjustHeap(arr, 0, len);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        return arr[0];
    }

    private void heapSort(int[] arr, int length) {
        for (int i = length / 2 - 1; i >= 0; i--)
            adjustHeap(arr, i, length);
    }

    private void adjustHeap(int[] arr, int i, int length) {
        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
            if(k + 1 < length && arr[k] > arr[k + 1])
                k++;
            if(arr[i] > arr[k]){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i = k;
            }else{
                break;
            }
        }
    }
    /**
     * 执行用时：15 ms, 在所有 Java 提交中击败了98.87%的用户
     * 内存消耗：43.6 MB, 在所有 Java 提交中击败了97.96%的用户
     */
}
