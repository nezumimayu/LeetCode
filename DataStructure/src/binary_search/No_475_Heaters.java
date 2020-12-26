package binary_search;

import java.util.Stack;

public class No_475_Heaters {
    public static void main(String[] args) {
        int[] houses = {1,5};
        int[] heaters = {10};
        int result = findRadius(houses, heaters);
        System.out.println("result = " + result);
    }

    public static int findRadius(int[] houses, int[] heaters) {
//        int index = 0, max = 0, prv = 0;
//        for (int i = 0; i <= houses.length; i++) {
//            if(i == houses.length || (index < heaters.length &&houses[i] == heaters[index])){
//                if(i - prv > max)
//                    max = i - prv;
//                index++;
//                prv = i + 1;
//            }
//        }
//        return (max & 1) == 1 ? max / 2 + 1 : max / 2;

        int nodeHouse = 0, nodeHeater = 0, prv = 0, max = 0;
        while(nodeHouse <= houses.length && nodeHeater <= heaters.length){
            if(nodeHouse == houses.length || houses[nodeHouse] == heaters[nodeHeater]){
                int val = Math.abs(heaters[nodeHeater] - houses[prv]);
                if(val > max)
                    max = val;
                nodeHeater++;
                nodeHouse++;
                prv = nodeHouse + 1;
            }else if(houses[nodeHouse] < heaters[nodeHeater]){
                nodeHouse++;
            }else if(houses[nodeHouse] > heaters[nodeHeater]){
                int len = Math.max(heaters[nodeHeater] - prv, houses[nodeHouse] - nodeHeater);
                if(len > max)
                    max = len;
                nodeHeater++;
                nodeHouse++;
                prv = nodeHouse + 1;
            }
        }
        return (max & 1) == 1 ? max / 2 + 1 : max / 2;

    }
}
