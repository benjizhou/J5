package dev;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

public class WeightedList {
    private int start;
    private int numVert;
    private ArrayList<ArrayList<Node>> nodeList;

    public int getNumVert() {
        return numVert;
    }

    public ArrayList<ArrayList<Node>> getNodeList() {
        return nodeList;
    }

    public int getStart() {
        return start;
    }

    public WeightedList(String[] args) {
        

        try (RandomAccessFile data = new RandomAccessFile(args[0], "r")) {
            try (FileWriter log = new FileWriter(args[1])) {
                toString(data, log);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void toString(RandomAccessFile data, FileWriter log) throws IOException {
        String line = data.readLine();
        numVert = Integer.parseInt(line.split(" ")[3]);
        nodeList = new ArrayList<ArrayList<Node>>(numVert);
        for (int k = 0; k < numVert; k++) {
            nodeList.add(new ArrayList<Node>());
        }
        line = data.readLine();
        start = Integer.parseInt(line.split(" ")[8]);
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
                    if (indexes[j] != null) {
                        int weight = Integer.parseInt(indexes[j]);
                        Node node = new Node(j-3, weight);
                        if (node != null) {
                            nodeList.get(i).add(node);
                        }
                    }
                }
            }
            log.write("\n");
            line = data.readLine();
        }
        log.write("\nStart vertex is: " + start);
    }
}
