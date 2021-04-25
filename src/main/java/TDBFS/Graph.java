package TDBFS;

import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    private ArrayList<Vertex> listOfVertexes = new ArrayList<Vertex>();
    private ArrayList<GraphOperation> listOfGraphOperations = new ArrayList<GraphOperation>();

    public void addVertex(Vertex vertex) {
        listOfVertexes.add(vertex);
    }

    public Vertex getVertex(int vertexNumber) {
        for (Vertex tempVertex : listOfVertexes) {
            if (tempVertex.getId() == vertexNumber) {
                return tempVertex;
            }
        }
        return null;
    }

    public ArrayList<Vertex> getListOfVertexes() {
        return listOfVertexes;
    }

    public void addGraphOperation(GraphOperation graphOperation) {
        listOfGraphOperations.add(graphOperation);
    }

    public ArrayList<GraphOperation> getListOfGraphOperations() {
        return listOfGraphOperations;
    }

    public void resetVertexes() {
        for (Vertex vertex : listOfVertexes) {
            vertex.unvisit();
        }
    }

    private ArrayList<Vertex> buildListOfVertexNeighbours(Vertex vertex) {
        ArrayList<Integer> listOfVertexNeighbourIds = vertex.getListOfRelations();
        ArrayList<Vertex> listOfVertexNeighbour = new ArrayList<>();
        for (Integer id : listOfVertexNeighbourIds) {
            Vertex tempVertex = getVertex(id);
            listOfVertexNeighbour.add(tempVertex);
        }
        return listOfVertexNeighbour;
    }

    private void dfsSearch(Vertex vertex) {
        vertex.visit();
        System.out.print(vertex.getId() + " ");
        if (vertex.getListOfRelations().isEmpty()) {
            return;
        } else {
            for (Vertex neighbor : buildListOfVertexNeighbours(vertex)) {
                if (!neighbor.isVisited()) {
                    dfsSearch(neighbor);
                }
            }
        }
    }

    private void bfsSearch(Vertex vertex) {
        if (listOfVertexes.isEmpty()) {
            return;
        }

        LinkedList<Vertex> queue = new LinkedList<>();
        queue.add(vertex);

        while (!queue.isEmpty()) {
            Vertex currentFirst = queue.removeFirst();

            if (currentFirst.isVisited()) {
                continue;
            }
            currentFirst.visit();
            System.out.print(currentFirst.getId() + " ");

            LinkedList<Vertex> allNeighbors = new LinkedList<>();
            for (int id : currentFirst.getListOfRelations()) {
                try {
                    allNeighbors.add(getVertex(id));
                } catch (NullPointerException NPE) {
                    System.out.println("getVertex - NullPointerException");
                }
            }
            if (allNeighbors.isEmpty()) {
                continue;
            }

            for (Vertex neighbor : allNeighbors) {
                if (!neighbor.isVisited()) {
                    queue.add(neighbor);
                }
            }
        }
    }

    public void searchTheGraph() {
        for (GraphOperation operation : listOfGraphOperations) {
            if (operation.getOperationType() == 0) {
                int vertexId = operation.getVertexId();
                for (Vertex vertex : listOfVertexes) {
                    if (vertex.getId() == vertexId) {
                        dfsSearch(vertex);
                        System.out.println(" ");
                    }
                }
            } else if (operation.getOperationType() == 1) {
                int vertexId = operation.getVertexId();
                for (Vertex vertex : listOfVertexes) {
                    if (vertex.getId() == vertexId) {
                        bfsSearch(vertex);
                        System.out.println(" ");
                    }
                }
            } else {
                System.out.println("Bledny numer operacji");
                continue;
            }
            resetVertexes();
        }
    }

}
