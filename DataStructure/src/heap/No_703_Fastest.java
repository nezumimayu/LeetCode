package heap;

import java.util.Arrays;

public class No_703_Fastest {
    public static void main(String[] args) {
//        int k = 2;
        int k = 3;
//        int[] arr = {0,3,6,6};
        int[] arr = {5,-1};
        No_703_Fastest kthLargest = new No_703_Fastest(k, arr);
        kthLargest.add(2);          // returns 4
        kthLargest.add(1);          // returns 5
        kthLargest.add(-1);         // returns 5
        kthLargest.add(3);          // returns 8
        kthLargest.add(4);          // returns 8
    }

    /**
     * 小顶堆
     */
    private int[] minHeap;
    /**
     * 堆的规模
     */
    private final int k;
    /**
     * 堆的最后一个元素的索引
     */
    private int last;

    public No_703_Fastest(int k, int[] nums) {
        this.k = k;
        this.minHeap = new int[k + 1];
        /**/
        for (int i = 1; i <= k && i <= nums.length; i++) {
            this.minHeap[i] = nums[i - 1];
            this.last = i;
        }

        /*如果小顶堆被填满了,就继续添加元素,并使堆有序*/
        if (last == k) {
            order();
            for (int i = k; i < nums.length; i++) {
                add(nums[i]);
            }
        }

    }

    public int add(int val) {
        /*如果堆还未被填满（由题意堆会在至多一次add后被填满）,则将元素放在无序堆的末尾，然后将堆有序化*/
        if (last == k - 1) {
            minHeap[++last] = val;
            order();
        }
        /*如果新元素大于堆中第k大的元素（minHeap[1]），则替换它，并将堆有序化*/
        else if (val > minHeap[1]) {
            minHeap[1] = val;
            /*此时处堆尖处无序外,其他部分为有序,所以只需将堆顶下沉即可*/
            sink(1);
        }
        System.out.println(Arrays.toString(minHeap));
        System.out.println(minHeap[1]);
        return minHeap[1];
    }

    /**
     * 堆的有序化
     */
    private void order() {
        for (int i = k / 2; i >= 1; i--) {
            sink(i);
        }
    }

    /**
     * 下沉
     */
    private void sink(int i) {
        while (2 * i <= k) {
            int j = 2 * i;

            if (j < k && minHeap[j] > minHeap[j + 1]) {
                j++;
            }

            if (minHeap[i] > minHeap[j]) {
                int temp = minHeap[i];
                minHeap[i] = minHeap[j];
                minHeap[j] = temp;
                i = j;
            } else {
                break;
            }
        }
    }
    /**
     * 执行用时：15 ms, 在所有 Java 提交中击败了98.87%的用户
     * 内存消耗：43.7 MB, 在所有 Java 提交中击败了89.71%的用户
     */

}
