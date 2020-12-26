package stack;

public class No_682_Fastest {
    public static void main(String[] args) {
        String[] ops = {"36","28","70","65","C","+","33","-46","84","C"};

        long startTime = System.currentTimeMillis();

        int result = calPoints(ops);
        System.out.println(result);

        long endTime = System.currentTimeMillis();
        System.out.println("运行时间:" + (endTime - startTime) + "ms");

    }
    public static int calPoints(String[] ops) {
        int[] arr = new int[ops.length];
        int i=0;
        for(String s:ops){
            switch (s){
                case "+":
                    arr[i] = arr[i-1]+arr[i-2];
                    i++;
                    break;
                case "D":
                    arr[i] = arr[i-1]*2;
                    i++;
                    break;
                case "C":
                    arr[i-1]=0;
                    i--;
                    break;
                default:
                    arr[i] = Integer.valueOf(s);
                    i++;
            }
        }
        int sum=0;
//        for(int j=0;j<arr.length;j++){
        for(int j=0;j<i;j++){
                sum += arr[j];
        }
        return sum;
    }
}
