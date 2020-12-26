package greedy;

import java.util.*;

public class _No_874_WalkingRobotSimulation {
    public static void main(String[] args) {
//        int[] commands = {7,-2,-2,7,5};
//        int[] commands = {4,-1,3};
        int[] commands = {4,-1,4,-2,4};
//        int[][] obstacles = {{-3,2},{-2,1},{0,1},{-2,4},{-1,0},{-2,-3},{0,-3},{4,4},{-3,3},{2,2}};
//        int[][] obstacles = {};
        int[][] obstacles = {{2,4}};
        int result = robotSim(commands, obstacles);
        System.out.println("result = " + result);
    }

    public static int robotSim(int[] commands, int[][] obstacles) {
//        int result = 0;
//        int x = 0, y = 0;
//        int[] AZ = new int[4];          //{y+, x-, y-, x+}
//        int target = 0;
//        for (int command : commands) {
//            if(command == -2){
//                target = (target + 1) % 4;
//            }else if(command == -1){
//                target = (target + 3) % 4;
//            }else{
//                x = AZ[3] - AZ[1];
//                y = AZ[0] - AZ[2];
//                if((target & 1) != 1){          //y轴上移动
//                    if(target == 0){
//                        for (int[] obstacle : obstacles) {
//                            if(obstacle[0] == x && obstacle[1] > y)
//                                command = Math.min(command, obstacle[1] - 1 - y);
//                        }
//                    }else{
//                        for (int[] obstacle : obstacles) {
//                            if(obstacle[0] == x && obstacle[1] < y)
//                                command = Math.min(command, Math.abs(obstacle[1] + 1 - y));
//                        }
//                    }
//                    AZ[target] += command;
//                }else{                          //x轴上移动
//                    if(target == 1){
//                        for (int[] obstacle : obstacles) {
//                            if(obstacle[1] == y && obstacle[0] < x)
//                                command = Math.min(command, Math.abs(obstacle[0] + 1 - x));
//                        }
//                    }else{
//                        for (int[] obstacle : obstacles) {
//                            if(obstacle[1] == y && obstacle[0] > x)
//                                command = Math.min(command, obstacle[0] - 1 - x);
//                        }
//                    }
//                    AZ[target] += command;
//                }
//                x = AZ[3] - AZ[1];
//                y = AZ[0] - AZ[2];
//                result = (int) Math.max(result, Math.pow(x, 2) + Math.pow(y, 2));
//            }
//        }
//        return result;
        /**
         * 执行用时：380 ms, 在所有 Java 提交中击败了8.68%的用户
         * 内存消耗：43.9 MB, 在所有 Java 提交中击败了90.41%的用户
         */

        HashMap<Integer, List<Integer>> xdire = new HashMap<>();
        HashMap<Integer, List<Integer>> ydire = new HashMap<>();
        for (int[] obstacle : obstacles) {
            int x = obstacle[0], y = obstacle[1];
            List<Integer> xlist = xdire.getOrDefault(x, new ArrayList<>());
            xlist.add(y);
            xdire.put(x, xlist);
            List<Integer> ylist = ydire.getOrDefault(y, new ArrayList<>());
            ylist.add(x);
            ydire.put(y, ylist);
        }
        int result = 0;
        int x = 0, y = 0;
        int[] AZ = new int[4];          //{y+, x-, y-, x+}
        int target = 0;
        for (int command : commands) {
            if(command == -2){
                target = (target + 1) % 4;
            }else if(command == -1){
                target = (target + 3) % 4;
            }else{
                x = AZ[3] - AZ[1];
                y = AZ[0] - AZ[2];
                if((target & 1) != 1){          //y轴上移动
                    List<Integer> list = xdire.get(x);
                    if(xdire.containsKey(x)){
                        if(target == 0){
                            for (Integer i : list) {
                                if(i > y)
                                    command = Math.min(command, i - 1 - y);
                            }
                        }else{
                            for (Integer i : list) {
                                if(i < y)
                                    command = Math.min(command, Math.abs(i + 1 - y));
                            }
                        }
                    }
                }else{                          //x轴上移动
                    List<Integer> list = ydire.get(y);
                    if(ydire.containsKey(y)){
                        if(target == 1){
                            for (Integer i : list) {
                                if(i < x)
                                    command = Math.min(command, Math.abs(i + 1 - x));
                            }
                        }else{
                            for (Integer i : list) {
                                if(i > x)
                                    command = Math.min(command, i - 1 - x);
                            }
                        }
                    }
                }
                AZ[target] += command;
                x = AZ[3] - AZ[1];
                y = AZ[0] - AZ[2];
                result = Math.max(result, x * x + y * y);
            }
        }
        return result;
        /**
         * 执行用时：28 ms, 在所有 Java 提交中击败了72.92%的用户
         * 内存消耗：46.3 MB, 在所有 Java 提交中击败了15.38%的用户
         */

//        HashSet<int[]> set = new HashSet<>();
//        for (int[] obstacle : obstacles)
//            set.add(obstacle);
//        int[] arr = new int[]{2,4};
//        System.out.println(set.contains(arr));
//        for (int[] ints : set) {
//            int[] ar = ints.clone();
//            System.out.println(set.contains(ar));
//        }
//        int result = 0;
//        int x = 0, y = 0;
//        int[] AZ = new int[4];          //{y+, x-, y-, x+}
//        int[] val = new int[]{1, -1, -1, 1};
//        int target = 0;
//        for (int command : commands) {
//            if(command == -2){
//                target = (target + 1) % 4;
//            }else if(command == -1){
//                target = (target + 3) % 4;
//            }else{
//                if((target & 1) != 1){          //y轴上移动
//                    boolean flag = true;
//                    for (int i = 0; i < command; i++) {
//                        if(set.contains(new int[]{x, y + (val[target] * i)})){
//                            y = y + (val[target] * i);
//                            flag = false;
//                            break;
//                        }
//                    }
//                    if(flag)
//                        y = y + (val[target] * command);
//                }else{                          //x轴上移动
//                    boolean flag = true;
//                    for (int i = 0; i < command; i++) {
//                        if(set.contains(new int[]{x + (val[target] * i), y})){
//                            x = x + (val[target] * i);
//                            flag = false;
//                            break;
//                        }
//                    }
//                    if(flag)
//                        x = x + (val[target] * command);
//                }
//                result = Math.max(result, x * x + y * y);
//            }
//        }
//        return result;
        /**
         * 不行，HashSet中存储数组的地址
         */


    }
}
