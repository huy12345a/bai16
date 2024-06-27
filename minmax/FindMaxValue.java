package minmax;

import java.util.ArrayList;
import java.util.List;

public class FindMaxValue {
    public static int findMaxValue(List<Integer> list) {
        int max = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (max < list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> list = readAndWriteFile.readFile("minmax\\in.txt");
        int max = findMaxValue(list);
        readAndWriteFile.writeFile("minmax\\out.txt", max);
    }
}
