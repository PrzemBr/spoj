package MN_2;

public class Matrix {
    private int size;
    private int matrix[][];
    private int vector[];

    public void initializeMatrix(int size){
        this.size = size;
        matrix = new int[size][size];
    }

    public void fillMatrixRowsWithData(int rowNumber, int data[]) {
        if (data.length == matrix[rowNumber].length) {
            for (int i = 0; i < data.length; i++) {
                if (i == data.length - 1) {
                    addVector(rowNumber, data[i]);
                }
                matrix[rowNumber][i] = data[i];
            }
        } else {
            System.out.println("Podano nieprawidłową ilość argumentów");
        }
    }

    public void initializeVector(){
        vector = new int[size];
    }

    public void addVector(int rowNumber, int vector) {
        this.vector[rowNumber] = vector;
    }

    public int getSize() {
        return size;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public int[] getVector() {
        return vector;
    }
}
