package TDBFS;

/*
https://pl.spoj.com/problems/TDBFS/
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Integer amountOfGraphs = null;
        ArrayList<Graph> listOfGraphs = new ArrayList<Graph>();

        System.out.println("Podaj ile grafów chcesz zbadać z przedziału <1, 100>");
        while (amountOfGraphs == null) {
            Input tdbfsInput = new Input();
            ArrayList<Integer> tempListOfGraphs;
            tempListOfGraphs = tdbfsInput.genericInput();
            if (tempListOfGraphs.size() != 1) {
                System.out.println("Podano niepoprawną wartość");
            } else if (tempListOfGraphs.get(0) < 1 || tempListOfGraphs.get(0) > 100) {
                System.out.println("Podano wartość z poza zakresu");
            } else {
                amountOfGraphs = tempListOfGraphs.get(0);
            }
        }

        int loopCounter = 1;
        for (int i = 0; i < amountOfGraphs; i++) {
            int amountOfGraphVertexes = 0;
            int vertexCounter = 0;
            Graph graph = new Graph();

            System.out.println("Podaj ile wierzchołków z przedziału <1, 1000> ma graf");
            while (true) {
                Input input = new Input();
                ArrayList<Integer> tempList = new ArrayList<>();

                tempList = input.genericInput();
                if (tempList.size() == 1) {
                    amountOfGraphVertexes = tempList.get(0);
                } else if (tempList.get(0) == 0 && tempList.get(1) == 0) {
                    listOfGraphs.add(graph);
                    if (loopCounter < amountOfGraphs) {
                        loopCounter++;
                        break;
                    } else {
                        break;
                    }
                } else if (tempList.isEmpty()) {
                    System.out.println("Brak danych do przetworzenia");
                } else {
                    if (vertexCounter < amountOfGraphVertexes) {
                        int amountOfNeighborVertexes = tempList.get(1);
                        tempList.remove(1);
                        int id = tempList.get(0);
                        tempList.remove(0);
                        if (tempList.size() == amountOfNeighborVertexes) {
                            Vertex vertex = new Vertex(id, tempList);
                            graph.addVertex(vertex);
                            vertexCounter++;
                        } else {
                            System.out.println("Podano bledna ilosc wierzcholkow");
                        }
                    } else {
                        int vertexId = tempList.get(0);
                        int operationType = tempList.get(1);
                        GraphOperation graphOperation = new GraphOperation(vertexId, operationType);
                        graph.addGraphOperation(graphOperation);
                    }
                }
            }
        }
        for (int j = 1; j <= listOfGraphs.size(); j++) {
            Graph graph = listOfGraphs.get(j-1);
            System.out.println("");
            System.out.println("Graph " + j);
            graph.searchTheGraph();
        }

    }
}
