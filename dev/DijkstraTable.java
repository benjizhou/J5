package dev;

public class DijkstraTable {
    private int[] table;
    private WeightedList weightedList;

    public DijkstraTable(String[] args) {
        weightedList = new WeightedList(args);
        table = new int[weightedList.getNumVert()];
    }

    public void DijAlgo() {
        int start = weightedList.getStart();
        // fill table with the start index
        
        // recursion?
    }

    public String toString() {
        return null;
    }
}
