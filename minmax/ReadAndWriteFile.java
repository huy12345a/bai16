package minmax;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String fileName) {
        List<Integer> list = new ArrayList<Integer>();
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new FileNotFoundException("file ko ton tai");
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = br.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }br.close();

        }catch (Exception e) {
            e.getMessage();
        }
        return list;
    }
    public void writeFile(String fileName, int max) {
        try{
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));
            bufferedWriter.write("gia tri lon nhat la : " + max);
            bufferedWriter.newLine();
            bufferedWriter.close();

        }catch (IOException e) {
            e.getMessage();
        }
    }
}
