package dev;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;

import javax.annotation.processing.FilerException;

public class TableParser {

    private WeightedList weightedList;
    private DijkstraTable dijkstraTable;
    private int start;
    private ArrayList<Node>[] nodeList;
    private PathTable pathTable;

    public TableParser(String[] args) {
        dijkstraTable = new DijkstraTable(args);
        weightedList = dijkstraTable.getWeightedList();
    }

    public void tableAlgo() {
        start = weightedList.getStart();
        dijkstraTable.buildTable(start);
        dijkstraTable.display();
        // fill table with the start index
        Vertex first = new Vertex();
        first.setMarked(true);
        first.addPath(start);
        first.addWeight(nodeList[start].get(0).getEdge());
        pathTable.getVertexList().add(first);
        // loop through
        for (int i = 1; i < weightedList.getNumVert(); i++) {
            // go through nodeList

            // find shortest path

            // build vertex
        }
    }

}
