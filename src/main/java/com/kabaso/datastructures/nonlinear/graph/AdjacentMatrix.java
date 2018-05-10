package com.kabaso.datastructures.nonlinear.graph;


import com.kabaso.datastructures.Student;

public class AdjacentMatrix implements GraphADT{
    private int[][] matrix;
    private Student[] nodeValues;
    private int numEdge;

    // Initialize the graph with n vertices
    public void init(int n) {
        matrix = new int[n][n];
        nodeValues = new Student[n];
        numEdge = 0;

    }
    // Return the number of vertices
    public int nodeCount() {
        return nodeValues.length;
    }
    // Return the current number of edges
    public int edgeCount() {
        return numEdge;
    }
    // Get the value of node with index v
    public Student getValue(int v) {
        return nodeValues[v];
    }
    // Set the value of node with index v
    public void setValue(int v, Student data) {
        nodeValues[v] = data;

    }
    // Adds a new edge from node v to node w
    // Returns the new edge
    public void addEdge(int v, int w, int wgt) {
        if(wgt == 0 ) return ;
        matrix[v][w] = wgt;
        numEdge++;

    }
    // Get the weight value for an edge
    public int weight(int v, int w) {
        return matrix[v][w];
    }
    // Removes the edge from the graph.
    public void removeEdge(int v, int w) {
        matrix[v][w] = 0;
        numEdge --;
    }
    // Returns true iff the graph has the edge
    public boolean hasEdge(int v, int w) {
        return matrix[v][w]!=0;
    }

    // Returns an array containing the indicies of the neighbors of v
    public int[] neighbors(int v) {
        int i;
        int count = 0;
        int[] temp;

        for (i=0; i<nodeValues.length; i++)
            if (matrix[v][i] != 0) count++;
        temp = new int[count];
        for (i=0, count=0; i<nodeValues.length; i++)
            if (matrix[v][i] != 0) temp[count++] = i;
        return temp;
    }
}
