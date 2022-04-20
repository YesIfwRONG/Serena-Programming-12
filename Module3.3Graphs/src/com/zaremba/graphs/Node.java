package com.zaremba.graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int key;
    private List<Integer> nodes; // Also called "points" in the Main class.
    private boolean visited;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public List<Integer> getNodes() {
        return nodes;
    }

    public void setNodes(List<Integer> nodes) {
        this.nodes = nodes;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Node(int key, ArrayList<Integer> nodes){
        this.key = key;
        this.nodes = nodes;
    }

    @Override
    public int hashCode() {
        return key;
    }

    @Override
    public boolean equals(Object obj) { // If two objects' key are the same, return true;
        if(obj instanceof Node){
            Node other = (Node)obj;
            if(this.key == other.key){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Node: " + key;
    }
}
