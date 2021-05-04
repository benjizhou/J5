package dev;

import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

import javax.annotation.processing.FilerException;

public class TableParser {

    private WeightedList weightedList;
    private DijkstraTable dijkstraTable;
    private int start;

    public TableParser(String[] args) {
        // call 1 thing
        dijkstraTable = new DijkstraTable(args);
    }


}
