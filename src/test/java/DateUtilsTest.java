
import org.junit.Test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;




public class DateUtilsTest {
    @Test
    public void getAGE() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("1999-12-06");
        int age = DateUtils.getAge(parse);
        System.out.println(age);
    }

   @Test
    public void getfuther() throws ParseException {
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
       Date parse = sdf.parse("2020-01-13");
       int futher = DateUtils.getFuther(parse);
       System.out.println(futher);
   }

    @Test
    public void getPast() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2019-10-01");
        int futher = DateUtils.getPast(parse);
        System.out.println(futher);
    }

    @Test
    public void  isToday() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2019-12-05");
        boolean today = DateUtils.isToday(parse);
        System.out.println(today);
    }

    @Test
    public void  isThisWeek() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2019-12-07");
        boolean today = DateUtils.isThisWeek(parse);
        System.out.println(today);
    }

    @Test
    public void  isThisMouth() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2019-12-30");
        boolean today = DateUtils.isThisMouth(parse);
        System.out.println(today);
    }

    @Test
    public void initStart() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse("2019-12-30 12:30:30");
        Date initstart = DateUtils.initstart(parse);
        String format = sdf.format(initstart);
        System.out.println(format);
    }

    @Test
    public void initend() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse("2019-02-18 12:30:30");
        Date initstart = DateUtils.initend(parse);
        String format = sdf.format(initstart);
        System.out.println(format);
    }

    @Test
    public void coachTest() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("2019-12-30");
        Date parse1 = sdf.parse("2019-12-20");
        int i = DateUtils.coachDate(parse, parse1);
        System.out.println(i);
    }

}
