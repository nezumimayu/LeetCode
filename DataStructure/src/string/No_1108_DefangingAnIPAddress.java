package string;

import java.util.Arrays;

public class No_1108_DefangingAnIPAddress {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }

    public static String defangIPaddr(String address) {
//        StringBuilder sb = new StringBuilder();
//        for(char c : address.toCharArray()){
//            sb = c == '.' ? sb.append("[.]") : sb.append(c);
//        }
//        return sb.toString();
        return address.replace(".", "[.]");
    }
}
