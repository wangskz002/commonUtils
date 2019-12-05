import org.junit.Test;
import sun.reflect.misc.FieldUtil;

import java.io.File;

public class FileUtilsText{
    @Test
    public void getExcTest(){
        String name = FileUtils.getExcName("zzc.txt");
        System.out.println(name);
    }

    @Test
    public void deleteTest(){
        File f= new File("D:\\zzc");
        FileUtils.deleteAll(f);

    }

    @Test
    public void getHome(){
        File userHome = FileUtils.getUserHome();
        if (userHome.isFile()){
            System.out.println(userHome.toString());
        }else{
            File[] files = userHome.listFiles();
            for (File f:
                 files) {
                System.out.println(f.toString());
            }
        }
    }

    @Test
    public void  getSize(){
        File f = new File("D:\\zzc.txt");
        String size = FileUtils.getSize(f);
        System.out.println(size);
    }
}
