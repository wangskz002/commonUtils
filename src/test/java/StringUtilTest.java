import org.junit.Test;

public class StringUtilTest {
    @Test
    public void phoneTest(){
        boolean phone = StringUtils.isPhone("13623800888");
        System.out.println(phone);
    }


    @Test
    public void emailTest(){
        boolean email = StringUtils.isEmail("wangskz002@163.com");
        System.out.println(email);
    }

    @Test
    public void AllamTest(){
        boolean arms = StringUtils.isArms("akaosdkoa");
        System.out.println(arms);
    }

    @Test
    public void StringTest(){
        String arms = StringUtils.getStrings(10);
        System.out.println(arms);
    }

    @Test
    public void StringNumTest(){
        String arms = StringUtils.getStringsAndNum(10);
        System.out.println(arms);
    }

    @Test
    public void ChineseNumTest(){
        String arms = StringUtils.getChinese(11);
        System.out.println(arms);
    }
}
