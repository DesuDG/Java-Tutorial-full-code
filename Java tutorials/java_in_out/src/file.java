import java.io.File;

public class file {
    public static void main(String[] args) {
        File file=new File("sample.txt");
        if(file.exists()){
            System.out.println("the file is exist!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            System.out.println(file.getName());
            System.out.println(file.length());
    }else{
            System.out.println("the file doesn't exist!");

        }


    }
}
