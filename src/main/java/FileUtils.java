import java.io.File;

public class FileUtils {
    //获取文件扩展名
    public static String getExcName(String file){
        int i = file.lastIndexOf(".");
        String substring = file.substring(i+1);
        System.out.println(substring);
        return substring;
    }

    //删除文件，如果是目录，则下面的文件和所有子目录中的文件都要删除
    public static void deleteAll(File file){
        if (file.isFile()){
            file.delete();
        }else {
            File[] files = file.listFiles();
            for (File f:files) {
                if (f.isFile()){
                    f.delete();
                }else{
                    deleteAll(f);

                }
            }
            file.delete();
        }
    }

    //获取操作系统用户目录
    public static  File getUserHome(){
        String property = System.getProperty("user.home");
        File f = new File(property);
        return f;
    }

    //返回文件以指定单位大小表示
    public static  String getSize(File f){
        if(f.isFile()){
            long length = f.length();
            double Kilobyte  = (double)(length / 1024);
            if (Kilobyte < 1){
                return f.length()+"Bytes";
            }

            double Megabyte   = (double)(Kilobyte / 1024);
            if (Megabyte  < 1){
                return Kilobyte+"KB";
            }





        }

        return null;
    }
}
