package dev;

public class Node {
    private int nodeIndex;
    private int edge;

    public Node(int index, int weight) {
        nodeIndex = index;
        edge = weight;
    }

    public void setEdge(int edge) {
        this.edge = edge;
    }
    public void setNodeIndex(int nodeIndex) {
        this.nodeIndex = nodeIndex;
    }
    public int getEdge() {
        return edge;
    }
    public int getNodeIndex() {
        return nodeIndex;
    }
}
