package sumofthetextfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public static void readFileText(String fileName) {
        try{
            File file = new File(fileName);
            if(!file.exists()){
                throw new FileNotFoundException("file khong ton tai hoac noi dung co loi");
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = null;
            int sum = 0;
            while((line = br.readLine()) != null){
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println(sum);
        }catch (Exception e){
            e.getMessage();
        }

    }
    public static void main(String[] args) {
        readFileText("sumofthetextfile\\huy.txt");

    }
}
