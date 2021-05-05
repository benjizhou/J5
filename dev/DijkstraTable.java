package dev;

import java.util.ArrayList;
import java.util.Arrays;

public class DijkstraTable {
    private int[] table;
    private WeightedList weightedList;
    private ArrayList<ArrayList<Node>> nodeList;
    private int start;

    public DijkstraTable(String[] args) {
        weightedList = new WeightedList(args);
        nodeList = weightedList.getNodeList();
        start = weightedList.getStart();
        table = new int[weightedList.getNumVert()];
        table[start] = 0;
    }

    public WeightedList getWeightedList() {
        return weightedList;
    }

    public DijkstraTable() {
    }

    public void buildTable(int index) {
        // fill table with what is in nodeList
        for (int i = 0; i < nodeList.get(index).size(); i++) {
            table[nodeList.get(index).get(i).getNodeIndex()] = nodeList.get(index).get(i).getEdge();
        }
        System.out.println(Arrays.toString(table));
    }

    public void display() {
        for (int i = 0; i < table.length; i++) {
            System.out.print(i + "\t");
        }
        System.out.print("\n");
        for (int j = 0; j < table.length; j++) {
            if (table[j] == 0) {
                System.out.print("inf\t");
            } else {
                System.out.print(table[j] + "\t");
            }
        }
    }
}
