package MN_2;

import org.apache.commons.math3.linear.*;

public class MatrixSolver {
//    System.out.println("Equation in the form of AX=B solver");
//        System.out.println("Matrix representing A");
    RealMatrix a = new Array2DRowRealMatrix(
            new double[][]{{2, 3, -2}, {-1, 7, 6}, {4, -3, -5}},
            false);
//        System.out.println(a.toString());
//        System.out.println("Vector Representing B");
    RealVector b = new ArrayRealVector(new double[]{1, -2, 1},
            false);
//        System.out.println(b.toString());
//        System.out.println("Creating Solver Object");
    DecompositionSolver solver = new LUDecomposition(a).getSolver();
//        System.out.println("Calculation Solution");
    RealVector solution = solver.solve(b);
//        System.out.println("Solution is "+solution.toString());
}
