package filecsv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Country {
    public static void main(String[] args) {

        try {
            File file = new File("filecsv\\data.csv");
            if (!file.exists()) {
                throw new Exception("file ko ton tai");
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            List<String[]> countries = new ArrayList<>();
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                countries.add(line.split(","));
            }
            bufferedReader.close();
            for (String[] country : countries) {
                System.out.println(
                        "Country [id= "
                                + country[0]
                                + ", code= " + country[1]
                                + " , name=" + country[2]
                                + "]");

            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
