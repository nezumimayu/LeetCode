package test;

import java.util.Arrays;

/**
 * @author nezumimayu
 * @since 2020-11-14 8:58
 */
public class ChineseToGB2312 {
    public static void main(String[] args) throws Exception {
        ChineseToGB2312 cb = new ChineseToGB2312();
//        cb.App();     //无法识别非汉字

        String s1 = "舞曲回旋23";
        byte[] bytes = s1.getBytes("GBK");
        System.out.println(Arrays.toString(bytes));
        String hex = bytesToHex(bytes);
        System.out.println(hex);    //B6BCCAC7B7CFBBB0      %B6%BC%CA%C7%B7%CF%BB%B0
        String fin = fillSyn(hex);
        System.out.println(fin);
        String text = stringToGbk(hex);
        System.out.println(text);
    }

    private static String fillSyn(String text) {
        StringBuilder sb = new StringBuilder();
        char[] chars = text.toCharArray();
        sb.append('%');
        for (int i = 0; i < chars.length; i++) {
            sb.append(chars[i]);
            if((i & 1) == 1)
                sb.append('%');
        }
        return sb.toString();
    }

    public void App() throws Exception {
        String string = "B6BCCAC7B7CFBBB0";
        String result = stringToGbk(string);
        System.out.println(result);
    }

    // 将gbk编码转换成汉字
    public static String stringToGbk(String string) throws Exception {
        byte[] bytes = new byte[string.length() / 2];
        for (int i = 0; i < bytes.length; i++) {
            byte high = Byte.parseByte(string.substring(i * 2, i * 2 + 1), 16);
            byte low = Byte.parseByte(string.substring(i * 2 + 1, i * 2 + 2), 16);
            bytes[i] = (byte) (high << 4 | low);
        }
        String result = new String(bytes, "gbk");
        return result;
    }

    final protected static char[] hexArray = "0123456789ABCDEF".toCharArray();

    public static String bytesToHex(byte[] bytes) {
        char[] hexChars = new char[bytes.length * 2];
        for (int j = 0; j < bytes.length; j++) {
            int v = bytes[j] & 0xFF;
            hexChars[j * 2] = hexArray[v >>> 4];
            hexChars[j * 2 + 1] = hexArray[v & 0x0F];
        }
        return new String(hexChars);
    }
}
