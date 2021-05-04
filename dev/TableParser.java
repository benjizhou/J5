package dev;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

import javax.annotation.processing.FilerException;

public class TableParser {
    public TableParser(String[] args) {
        try (RandomAccessFile data = new RandomAccessFile(args[0], "r")) {
            try (FileWriter log = new FileWriter(args[1])) {
                display(data, log);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void display(RandomAccessFile data, FileWriter log) throws IOException {
        String line = data.readLine();
        int numVert = Integer.parseInt(line.split(" ")[3]);
        line = data.readLine();
        int start = Integer.parseInt(line.split(" ")[8]);
        log.write("  Node  | Successors\n");
        log.write("----------------------------------------------------------------------\n");
        data.readLine();
        data.readLine();
        data.readLine();
        line = data.readLine();
        for (int i = 0; i < numVert; i++) {
            // indexes[1] is the node indexes[3-x] are the successors
            String[] indexes = line.split("\\s+");
            //System.out.println(Arrays.toString(indexes));
            if (i < 10) {
                log.write(" ");
            }
            log.write("     " + i + " |");
            for (int j = 3; j < numVert + 3; j++) {
                if (Integer.parseInt(indexes[j]) > 0) {
                    log.write("\t" + (j-3) + ": " + indexes[j]);
                }
            }
            log.write("\n");
            line = data.readLine();
        }
        log.write("\n\nStart vertex is: " + start);
    }
}
