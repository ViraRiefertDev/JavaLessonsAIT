package lessons.lesson42;

import java.io.File;
import java.io.IOException;

public class FileUtil {
    public static void main(String[] args){
        File file = new File("src/main/resources/testUtil.txt");
        try {
            System.out.println(file.createNewFile());
        }catch (IOException exception){
            System.out.println("IOException");
        }
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.length());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.getAbsolutePath());
        //file.mkdir();
//        File dir = new File("src/main/resources/dir/");
//        dir.mkdirs();
//        dir.list();

//        File[] filesInDirectory = file.listFiles();
//        for(File fileInDirectory:filesInDirectory){
//            System.out.println(fileInDirectory.getName());
//        }
    }
}
