package array;

public class No_1184_DistanceBetweenBusStops {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4};
//        int start = 1, destination = 3;
        int[] arr = {7,10,1,12,11,14,5,0};
        int start = 7, destination = 2;
        int result = distanceBetweenBusStops(arr, start, destination);
        System.out.println("result = " + result);
    }

    public static int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int cw = 0, ccw = 0;
        for (int i = 0; i < distance.length; i++) {
            if(i >= start && i < destination || i >= destination && i < start)
                ccw+=distance[i];
            cw+=distance[i];
        }
        cw = cw - ccw;
        System.out.println("cw = " + cw);
        System.out.println("ccw = " + ccw);
        return cw < ccw ? cw : ccw;
        /**
         * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了31.58%的用户
         */
    }
}
