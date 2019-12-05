import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.IllegalFormatException;

public class DateUtils {
    //根据日期算年龄根据日期算年龄根据日期算年龄
    public  static int getAge(Date brithday){

        Calendar birth =   Calendar.getInstance();
        birth.setTime(brithday);
        Calendar now = Calendar.getInstance();
        if (now.before(birth) ){
            throw new IllegalArgumentException("参数不对");
        }
        int nowYear = now.get(Calendar.YEAR);
        int nowMonth = now.get(Calendar.MONTH);
        int nowdate = now.get(Calendar.DAY_OF_MONTH);
        birth.setTime(brithday);
        int birthYear = birth.get(Calendar.YEAR);
        int birthMonth = birth.get(Calendar.MONTH);
        int birthdate = birth.get(Calendar.DAY_OF_MONTH);

        System.out.println(nowYear);
        System.out.println(birthYear);
        int age = nowYear - birthYear;
        System.out.println(age);
        if(nowMonth<=birthMonth){
            if (nowMonth==birthMonth){
                if(nowdate<birthdate){
                    age--;
                }
            }else{
                age--;
            }
        }

        return age;
    }

    //求未来日期离今天还剩的天数
    public static  int getFuther(Date date){
        Calendar futher =   Calendar.getInstance();
        futher.setTime(date);
        Calendar now = Calendar.getInstance();
        System.out.println(futher.get(Calendar.YEAR));
        System.out.println(now.get(Calendar.YEAR));
        if(futher.before(now)){
            throw new IllegalArgumentException("参数不正确");
        }
        long time = date.getTime();
        Date d = new Date();
        long time1 = d.getTime();
        int i = (int) ((time - time1) / 1000 / 60 / 60 / 24);

        return  i;
    }

    //求过去日期离今天还剩的天数
    public static  int getPast(Date date){
        Calendar past =   Calendar.getInstance();
        past.setTime(date);
        Calendar now = Calendar.getInstance();
        System.out.println(past.get(Calendar.YEAR));
        System.out.println(now.get(Calendar.YEAR));
        if(now.before(past)){
            throw new IllegalArgumentException("参数不正确");
        }
        long time1 = date.getTime();
        Date d = new Date();
        long time = d.getTime();
        int i = (int) ((time - time1) / 1000 / 60 / 60 / 24);

        return  i;
    }

    //判断给定的日期是否为今天
    public  static  boolean isToday(Date date){
        Calendar dates =   Calendar.getInstance();
        dates.setTime(date);
        Calendar now = Calendar.getInstance();
        int i = now.get(Calendar.DAY_OF_MONTH);
        int i1 = dates.get(Calendar.DAY_OF_MONTH);
        if (i == i1){
            return true;
        }else{
            return false;
        }
    }

    //判断给定的日期是否在本周之内
    public  static  boolean isThisWeek(Date date){
        Calendar dates =   Calendar.getInstance();
        dates.setTime(date);
        Calendar now = Calendar.getInstance();
        int i = now.get(Calendar.WEEK_OF_YEAR);
        int i1 = dates.get(Calendar.WEEK_OF_YEAR);
        if (i == i1){
            return true;
        }else{
            return false;
        }
    }

    //判断给定的日期是否在本月之内
    public  static  boolean isThisMouth(Date date){
        Calendar dates =   Calendar.getInstance();
        dates.setTime(date);
        Calendar now = Calendar.getInstance();
        int i = now.get(Calendar.MONTH);
        int i1 = dates.get(Calendar.MONTH);
        if (i == i1){
            return true;
        }else{
            return false;
        }
    }

    //给定时间对象，初始化到该月初的1月1日0时0分0秒0毫秒
    public static Date initstart(Date date){
        Calendar dates =   Calendar.getInstance();
        dates.setTime(date);
        dates.set(Calendar.DAY_OF_MONTH,1);
        dates.set(Calendar.HOUR_OF_DAY, 0);
        dates.set(Calendar.MINUTE, 0);
        dates.set(Calendar.SECOND, 0);
        dates.set(Calendar.MILLISECOND, 0);
        Date time = dates.getTime();
        return time;
    }

    //给定时间对象，设定到该月最一天的23时59分59秒999毫秒
    public static Date initend(Date date){

        Calendar dates =   Calendar.getInstance();
        dates.setTime(date);
        //判断闰年
        boolean flag = false;
        int year = dates.get(Calendar.YEAR);
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 ==0){
            flag = true;
        }
        int i = dates.get(Calendar.MONTH) + 1;
        System.out.println(i);
        if (i == 2){
            if (flag){
                dates.set(Calendar.DATE, 29);
            }else{
                dates.set(Calendar.DATE, 28);
            }
        }else{

        switch (i){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
                dates.set(Calendar.DATE, 31);
                break;
            case 4:
            case 6:
            case 9:
            case 12:
                dates.set(Calendar.DATE, 30);
                break;
        }
        }
        dates.set(Calendar.HOUR_OF_DAY, 23);
        dates.set(Calendar.MINUTE, 59);
        dates.set(Calendar.SECOND, 59);
        dates.set(Calendar.MILLISECOND, 999);
        Date time = dates.getTime();
        return time;
    }

    //比较时间
    public  static  int coachDate(Date date1 , Date date2){
        if(date1.after(date2)){
            return 1;
        }else if(date1.before(date2)){
            return -1;
        }else{
            return 0;
        }
    }
}
