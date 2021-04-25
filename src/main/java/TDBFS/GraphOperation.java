package TDBFS;

public class GraphOperation {
    private int vertexId;
    private int operationType;

    public GraphOperation(int vertexId, int operationType) {
        this.vertexId = vertexId;
        this.operationType = operationType;
    }

    public int getVertexId() {
        return vertexId;
    }

    public int getOperationType() {
        return operationType;
    }

    public void getOperationDetails() {
        System.out.println("Id wierzcholka " + vertexId);
        if (operationType == 0) {
            System.out.println("Typ operacji: " + operationType + " - DFS");
        } else {
            System.out.println("Typ operacji: " + operationType + " - BFS");
        }
    }
}
