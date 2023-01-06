package main;

public class Matrix {

    static double[][] multiplyMatrix(double[][] matrix1, double[][] matrix2){
        double[][] result = new double[matrix1.length][matrix2[0].length];

        if(matrix1[0].length == matrix2.length){
            for(int i = 0; i < matrix1.length; i++){
                for(int j = 0; j < matrix2[0].length; j++){
                    for(int k = 0; k < matrix2.length; k++){
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }
        return result;
    }

    static double[][] multiplyMatrix(double[][] matrix1, int[][] matrix2){
        double[][] result = new double[matrix1.length][matrix2[0].length];

        if(matrix1[0].length == matrix2.length){
            for(int i = 0; i < matrix1.length; i++){
                for(int j = 0; j < matrix2[0].length; j++){
                    for(int k = 0; k < matrix2.length; k++){
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
        }
        return result;
    }
}
