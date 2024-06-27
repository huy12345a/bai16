package copyfiletext;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException {
        CopyFileText copyFileText = new CopyFileText();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String fileName = scanner.nextLine();
        System.out.println("Enter the size of the file out: ");
        String fileOut = scanner.nextLine();
        List<String> list = copyFileText.readFile(fileName);
        try {
            copyFileText.writeFile(fileOut, list);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
