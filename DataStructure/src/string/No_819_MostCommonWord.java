package string;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class No_819_MostCommonWord {
    public static void main(String[] args) {
//        String str = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String str = "Bob. hIt, baLl";
        String[] ban = new String[]{"bob", "hit"};
        String result = mostCommonWord(str, ban);
        System.out.println("result = " + result);
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
//        char[] chars = paragraph.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] < 'A'){
//                chars[i] = ' ';
//            }else if(chars[i] <= 'Z'){
//                chars[i] = (char)(chars[i] + 32);
//            }else if(chars[i] < 'a'){
//                chars[i] = ' ';
//            }
//        }
//        String[] str = new String(chars).split("\\s+");
//        HashMap<String, Integer> map = new HashMap<>();
//        for (String s : str) {
//            if(map.containsKey(s)){
//                map.put(s, map.get(s) + 1);
//            }else{
//                map.put(s, 1);
//            }
//        }
//        for (String s : banned) {
//            map.remove(s);
//        }
//        int max = Integer.MIN_VALUE;
//        String result = "";
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if(entry.getValue() > max){
//                max = entry.getValue();
//                result = entry.getKey();
//            }
//        }
//        return result;
        /**
         * 执行用时：16 ms, 在所有 Java 提交中击败了35.17%的用户
         * 内存消耗：39.7 MB, 在所有 Java 提交中击败了58.94%的用户
         */

//        String rex ="\\b[a-zA-Z]+\\b";
//        Pattern pat = Pattern.compile(rex);
//        Matcher mat = pat.matcher(paragraph.toLowerCase());
//        HashMap<String, Integer> map = new HashMap<>();
//        while(mat.find()) {
//            String s = mat.group(0);
//            if(map.containsKey(s)){
//                map.put(s, map.get(s) + 1);
//            }else{
//                map.put(s, 1);
//            }
//        }
//        for (String s : banned) {
//            map.remove(s);
//        }
//        int max = Integer.MIN_VALUE;
//        String result = "";
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if(entry.getValue() > max){
//                max = entry.getValue();
//                result = entry.getKey();
//            }
//        }
//        return result;
        /**
         * 无法进行测试
         */

//        StringBuilder sb = new StringBuilder();
//        HashMap<String, Integer> map = new HashMap<>();
//        char[] chars = paragraph.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if(chars[i] >= 'A' && chars[i] <= 'Z'){
//                sb.append((char)(chars[i] + 32));
//            }else if(chars[i] >= 'a' && chars[i] <= 'z'){
//                sb.append(chars[i]);
//            }else{
//                String str = sb.toString();
//                if(!str.equals("")){
//                    System.out.println(str);
//                    if(map.containsKey(str)){
//                        map.put(str, map.get(str) + 1);
//                    }else{
//                        map.put(str, 1);
//                    }
//                    sb.delete(0, sb.length());
//                }
//            }
//        }
//
//        for (String s : banned) {
//            map.remove(s);
//        }
//        int max = Integer.MIN_VALUE;
//        String result = "";
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if(entry.getValue() > max){
//                max = entry.getValue();
//                result = entry.getKey();
//            }
//        }
//        return result;
        /**
         * 执行用时：11 ms, 在所有 Java 提交中击败了52.60%的用户
         * 内存消耗：39.8 MB, 在所有 Java 提交中击败了50.57%的用户
         */

//        StringBuilder sb = new StringBuilder(paragraph);
//        sb.append('.');
//        HashMap<String, Integer> map = new HashMap<>();
//
//        int prv = 0;
//        for (int i = 0; i < sb.length(); i++) {
//            char c = sb.charAt(i);
//            if(c >= 'A' && c <= 'Z'){
//                sb.setCharAt(i, (char)(c + 32));
//            }else if(c >= 'a' && c <= 'z'){
//
//            }else if(i - prv > 0){
//                String str = sb.substring(prv, i);
//                System.out.println(str);
//                if(map.containsKey(str)){
//                    map.put(str, map.get(str) + 1);
//                }else{
//                    map.put(str, 1);
//                }
//                prv = i + 1;
//            }else if(i - prv == 0){
//                prv = i + 1;
//            }
//        }
//        for (String s : banned) {
//            map.remove(s);
//        }
//        int max = Integer.MIN_VALUE;
//        String result = "";
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if(entry.getValue() > max){
//                max = entry.getValue();
//                result = entry.getKey();
//            }
//        }
//        return result;
        /**
         * 执行用时：8 ms, 在所有 Java 提交中击败了77.27%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了87.07%的用户
         */

//        HashMap<String, Integer> map = new HashMap<>();
//        int prv = 0;
//        char[] chars = paragraph.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            char c = chars[i];
//            if(c >= 'a' && c <= 'z'){
//
//            }else if(c >= 'A' && c <= 'Z'){
//                chars[i] = (char)(c + 32);
//            }else{
//                if(i - prv != 0){
//                    String str = new String(chars, prv, i - prv);
//                    System.out.println(str);
//                    if(map.containsKey(str)){
//                        map.put(str, map.get(str) + 1);
//                    }else{
//                        map.put(str, 1);
//                    }
//                }
//                prv = i + 1;
//            }
//        }
//        if(prv != chars.length - 1){
//            String str = new String(chars, prv, chars.length - prv);
//            System.out.println(str);
//            if(!str.equals("")){
//                if(map.containsKey(str)){
//                    map.put(str, map.get(str) + 1);
//                }else{
//                    map.put(str, 1);
//                }
//            }
//        }
//
//        for (String s : banned) {
//            map.remove(s);
//        }
//        int max = Integer.MIN_VALUE;
//        String result = "";
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            if(entry.getValue() > max){
//                max = entry.getValue();
//                result = entry.getKey();
//            }
//        }
//        return result;
        /**
         * 执行用时：6 ms, 在所有 Java 提交中击败了97.25%的用户
         * 内存消耗：39.2 MB, 在所有 Java 提交中击败了96.20%的用户
         */

//        HashSet<String> set = new HashSet<>(Arrays.asList(banned));
//        HashMap<String, Integer> map = new HashMap<>();
//        int prv = 0, max = Integer.MIN_VALUE;
//        String result = "";
//        char[] chars = paragraph.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            char c = chars[i];
//            if(c >= 'a' && c <= 'z'){
//
//            }else if(c >= 'A' && c <= 'Z'){
//                chars[i] = (char)(c + 32);
//            }else{
//                if(i - prv != 0){
//                    String str = new String(chars, prv, i - prv);
//                    System.out.println(str);
//                    if(!set.contains(str)){
//                        int count = map.getOrDefault(str, 0) + 1;
//                        map.put(str, count);
//                        if(count > max){
//                            result = str;
//                            max = count;
//                        }
//                    }
//                }
//                prv = i + 1;
//            }
//        }
//        if(prv != chars.length - 1){
//            String str = new String(chars, prv, chars.length - prv);
//            System.out.println(str);
//            if(!set.contains(str)){
//                int count = map.getOrDefault(str, 0) + 1;
//                map.put(str, count);
//                if(count > max){
//                    result = str;
//                    max = count;
//                }
//            }
//        }
//        return result;
        /**
         * 执行用时：4 ms, 在所有 Java 提交中击败了99.80%的用户
         * 内存消耗：39.5 MB, 在所有 Java 提交中击败了73.76%的用户
         */

        HashSet<String> set = new HashSet<>(Arrays.asList(banned));
        HashMap<String, Integer> map = new HashMap<>();
        int prv = 0, max = Integer.MIN_VALUE;
        String result = "";
        char[] chars = (paragraph + ".").toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if(c >= 'a' && c <= 'z'){

            }else if(c >= 'A' && c <= 'Z'){
                chars[i] = (char)(c + 32);
            }else{
                if(i - prv != 0){
                    String str = new String(chars, prv, i - prv);
                    if(!set.contains(str)){
                        int count = map.getOrDefault(str, 0) + 1;
                        map.put(str, count);
                        if(count > max){
                            result = str;
                            max = count;
                        }
                    }
                }
                prv = i + 1;
            }
        }
        return result;
        /**
         * 执行用时：5 ms, 在所有 Java 提交中击败了99.08%的用户
         * 内存消耗：39.4 MB, 在所有 Java 提交中击败了85.17%的用户
         */

    }
}
