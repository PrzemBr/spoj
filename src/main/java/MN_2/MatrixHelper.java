package MN_2;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixHelper {
    private int amountOfSets;
    private ArrayList<Matrix> listOfMatrixes = new ArrayList<>();

    private int amountOfSetsScanner(){
        Scanner sc = new Scanner(System.in);
        int amountOfSets = sc.nextInt();
        return amountOfSets;
    }

    private String readLine() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        return line;
    }

    private Matrix setMatrixSize() {
        int matrixSize;
        Matrix matrix = new Matrix();

        System.out.println("Podaj rozmiar matrycy");
        try {
            matrixSize = Integer.parseInt(readLine());
            if (matrixSize < 1 || matrixSize > 10) {
                System.out.println("Podano rozmiar z poza zakresu");
                setMatrixSize();
            }
            matrix.initializeMatrix(matrixSize);
        } catch (NumberFormatException NFE) {
            System.out.println("Podano błędne dane");
        }
        return matrix;
    }

    private int[] convertStringToArray() {
        String[] stringArgumentList;
        String line = readLine();
        stringArgumentList = line.split(" ");
        int[] intList = new int[stringArgumentList.length];
        for (int i =0; i < stringArgumentList.length; i++) {
            intList[i] = Integer.parseInt(stringArgumentList[i]);
        }
        return intList;
    }

    public void prepare() {
        System.out.println("Podaj ile zestawów danych program ma obliczyć");
        amountOfSets = amountOfSetsScanner();
        for (int i = 0; i < amountOfSets; i++) {
            Matrix matrix = setMatrixSize();
//            int[] vectorArray = new int[matrix.getSize()];
            matrix.initializeVector();
            System.out.println("Podaj wiersze macierzy");
            for (int j = 0; j< matrix.getSize(); j++){
                int[] listBeforeExtractingVector = convertStringToArray();
                int vector = 0;
                int[] listAfterExtractingVector = new int[listBeforeExtractingVector.length-1];
                for (int k = 0; k < listBeforeExtractingVector.length-1; k++){
                    if (k==listBeforeExtractingVector.length-2) {
                        vector = listBeforeExtractingVector[k];
                    } else {
                    listAfterExtractingVector[k] = listBeforeExtractingVector[k];
                    }
                }
                matrix.fillMatrixRowsWithData(j, listAfterExtractingVector);
                matrix.addVector(j, vector);
            }

            listOfMatrixes.add(matrix);
        }
    }
}
