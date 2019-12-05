import javax.print.DocFlavor;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringUtils {
    public  static  final String CHAR_ARRAY = "abcdefghyjklmnopqrstuvwxyzABCDEFGHYJKLMNOPQRSTUVWXYZ";
    public  static  final String NUM_ARRAY = "1234567890";
    //判断源字符串是否有值，空引号也算没值
    public static boolean isEmpty(String string){
        return string != null && "".equals(string);
    }

    //	判断源字符串是否有值，空引号和空格也算没值
    public static boolean isEmptyAndTrim(String string){
        return string != null && "".equals(string.trim());
    }

    //判断是否为手机号码
    public static boolean isPhone(String phone){
        String reg_phone = "^1(3[0-9]|5[0-9]|7[0-9]|8[0-9])\\d{8}$";
    /*    boolean matches = phone.matches(reg_phone);*/
        System.out.println(phone);
       boolean reg_phone1 = Pattern.matches(reg_phone, phone);
        return reg_phone1;
    }

    // 判断是否为电子邮箱
    public static boolean isEmail(String email){
        String reg_email = "^\\w+@\\w+\\.(com|cn)$";
        /*    boolean matches = phone.matches(reg_phone);*/
        System.out.println(email);
        boolean flag = Pattern.matches(reg_email, email);
        return flag;
    }

    public static  boolean isArms(String str){
        String reg_arms = "^[a-zA-Z]+$";
        boolean matches = str.matches(reg_arms);
        return matches;
    }

    ////获取n位随机英文字符串
    public  static  String getStrings(Integer length){
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= length ;i++){
            int k = (int)( Math.random() * CHAR_ARRAY.length());
            System.out.println(k);
            char c = CHAR_ARRAY.charAt(k);
            sb.append(c);
        }
        System.out.println(sb.toString());
        return  sb.toString();
    }

    public  static  String getStringsAndNum(Integer length){
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= length ;i++){
            int k = (int)( Math.random() * (CHAR_ARRAY+NUM_ARRAY).length());
            System.out.println(k);
            char c = (CHAR_ARRAY+NUM_ARRAY).charAt(k);
            sb.append(c);
        }
        System.out.println(sb.toString());
        return  sb.toString();
    }

    public  static  String getChinese(Integer length){
        StringBuffer sb = new StringBuffer();
        int min = Integer.parseInt("4e00", 16);
        int max = Integer.parseInt("9fa5", 16);

        for (int i = 1; i <= length ;i++){
            int k = (int)( Math.random() * (max-min+1)+min);
             char c = (char) k;
             sb.append(c);
        }
        System.out.println(sb.toString());
        return  sb.toString();
    }

}
