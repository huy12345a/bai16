package copyfiletext;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public List<String> readFile(String fileName) {
        List<String> list = new ArrayList<String>();

        try {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new Exception("file khong ton tai");
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) != null) {
                list.add(line);
            }
            br.close();
        } catch (Exception e) {
            e.getMessage();
        }
        return list;
    }

    public void writeFile(String fileName, List<String> list) throws IOException {


        File file = new File(fileName);
        BufferedWriter br = new BufferedWriter(new FileWriter(file));
        for (String s : list) {
            System.out.println(s);
            br.write(s);
            br.newLine();
        }
        br.close();

    }
}
