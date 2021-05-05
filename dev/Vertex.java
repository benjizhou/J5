package dev;

import java.util.ArrayList;

public class Vertex {

    private ArrayList<Integer> path;
    private ArrayList<Integer> weights;
    private boolean marked;

    public Vertex() {
        marked = false;
        path = new ArrayList<>();
        weights = new ArrayList<>();
    }

    public void setMarked(boolean marked) {
        this.marked = marked;
    }

    public void addPath(int next) {
        path.add(next);
    }

    public void setPath(ArrayList<Integer> newPath) {
        path = newPath;
    }

    public void addWeight(int weight) {
        weights.add(weight);
    }

    public int totalWeight() {
        int total = 0;
        for (int i = 0; i < weights.size(); i++) {
            total += weights.get(i);
        }
        return total;
    }

    public String toString() {
        return null;
    }
}
