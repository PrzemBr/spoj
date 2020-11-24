package TDBFS;

import java.util.ArrayList;

public class Vertex {
    private int id;
    private ArrayList<Integer> listOfRelations = new ArrayList<Integer>();
    private boolean visited;

    Vertex(int id, ArrayList<Integer> listOfRelations) {
        this.id = id;
        this.listOfRelations = listOfRelations;
        visited = false;
    }

    public void visit() {
        visited = true;
    }
    public void unvisit() {
        visited = false;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Integer> getListOfRelations() {
        return listOfRelations;
    }

    public boolean isVisited() {
        return visited;
    }

    public void getVertexDetails() {
        System.out.println("Wierzcholek nr " + id);
        System.out.println("Sasiaduje z: ");
        for (Integer temp : listOfRelations) {
            System.out.print(temp + " ");
        }
        System.out.println("Odwiedzony: " + visited);
    }
}
