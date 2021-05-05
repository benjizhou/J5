import java.util.Arrays;

import dev.*;

public class SSAD {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        TableParser table = new TableParser(args);
        table.tableAlgo();
    }
}