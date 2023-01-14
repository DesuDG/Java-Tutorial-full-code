import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class fileread_write {
    public static void main(String[] args) throws IOException {
//        FileReader reader=new FileReader("sample.txt");
//        int data=reader.read();
//        while(data!=-1){
//            System.out.print((char)data);
//            data=reader.read();
//        }
//        reader.close();
        FileWriter writer=new FileWriter("sample.txt");
        writer.write("Dg Tech");
        writer.append("\nchannel technology!\n subscribe now!");
        writer.close();
    }
}
