package main;

import java.awt.*;

public class RenderObjects {

    public static double xAngle = 0;
    public static double yAngle = 0;
    public static double zAngle = 0;
    
    public static int scale = 100;

    public static int distance = 40;

    static double[][] xRotation = {
            {1, 0, 0},
            {0, Math.cos(xAngle), -Math.sin(xAngle)},
            {0, Math.sin(xAngle), Math.cos(xAngle)}
    };

    static double[][] yRotation = {
            {Math.cos(yAngle), 0, Math.sin(yAngle)},
            {0, 1, 0},
            {-Math.sin(xAngle), 0, Math.cos(xAngle)}
    };

    static double[][] zRotation = {
        {Math.cos(zAngle), -Math.sin(zAngle), 0},
        {Math.sin(zAngle), Math.cos(zAngle), 0},
        {0, 0, 1}
    };

    public static void render(Graphics g){

        Mesh.meshes.forEach(mesh -> {
            for(double[] point : mesh){
                double [][] MatrixX = Matrix.multiplyMatrix(yRotation, to2dArr(point));
                double [][] MatrixY = Matrix.multiplyMatrix(xRotation, MatrixX);
                double [][] MatrixZ = Matrix.multiplyMatrix(zRotation, MatrixY);


                double scale1 = 1/(distance - MatrixZ[2][0]);
                double[][] perspective = {
                        {scale1, 0, 0},
                        {0, scale1, 0}
                };

                double [][] finalM = Matrix.multiplyMatrix(perspective, MatrixZ);

                double x = (finalM[0][0] * scale * 10) + 750;
                double y = 450 - (finalM[1][0] * scale * 10);

                g.drawRect((int) x, (int) y, 1, 1);
            }
        });

        Mesh.lines.forEach(lines -> {
            for(int[][] line : lines){
                double[][] point1 = to2dArr(line[0]);
                double[][] point2 = to2dArr(line[1]);

                double [][] MatrixX1 = Matrix.multiplyMatrix(yRotation, point1);
                double [][] MatrixY1 = Matrix.multiplyMatrix(xRotation, MatrixX1);
                double [][] MatrixZ1 = Matrix.multiplyMatrix(zRotation, MatrixY1);

                double [][] MatrixX2 = Matrix.multiplyMatrix(yRotation, point2);
                double [][] MatrixY2 = Matrix.multiplyMatrix(xRotation, MatrixX2);
                double [][] MatrixZ2 = Matrix.multiplyMatrix(zRotation, MatrixY2);

                double scale1 = 1/(distance - MatrixZ1[2][0]);
                double[][] perspective = {
                        {scale1, 0, 0},
                        {0, scale1, 0}
                };

                double [][] finalM = Matrix.multiplyMatrix(perspective, MatrixZ1);

                double scale2 = 1/(distance - MatrixZ2[2][0]);
                double[][] perspective2 = {
                        {scale2, 0, 0},
                        {0, scale2, 0}
                };

                double [][] finalM2 = Matrix.multiplyMatrix(perspective2, MatrixZ2);


                double x1 = (finalM[0][0] * scale * 10) + 750;
                double y1 = 450 - (finalM[1][0] * scale * 10);

                double x2 = (finalM2[0][0] * scale * 10) + 750;
                double y2 = 450 - (finalM2[1][0] * scale * 10);

                g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);

            }
        });
    }

    static double[][] to2dArr(double[] numbers){
        double[][] finalArr = new double[numbers.length][1];

        for(int i = 0; i < finalArr.length; i++){
            finalArr[i][0] = numbers[i];
        }

        return finalArr;
    }

    static double[][] to2dArr(int[] numbers){
        double[][] finalArr = new double[numbers.length][1];

        for(int i = 0; i < finalArr.length; i++){
            finalArr[i][0] = numbers[i];
        }

        return finalArr;
    }

    public static void xRot(){
        xRotation = new double[][]{
                {1, 0, 0},
                {0, Math.cos(xAngle), -Math.sin(xAngle)},
                {0, Math.sin(xAngle), Math.cos(xAngle)}
        };
    }

    public static void yRot(){
        yRotation = new double[][]{
                {Math.cos(yAngle), 0, Math.sin(yAngle)},
                {0, 1, 0},
                {-Math.sin(yAngle), 0, Math.cos(yAngle)}
        };
    }

    public static void zRot(){
        zRotation = new double[][]{
                {Math.cos(zAngle), -Math.sin(zAngle), 0},
                {Math.sin(zAngle), Math.cos(zAngle), 0},
                {0, 0, 1}
        };
    }

    public static void checkRot(){
        xRot();
        yRot();
        zRot();
    }

    public static double calcDist(int x1, int y1, int z1, int x2, int y2, int z2){
        return Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)) + ((z2 - z1) * (z2 - z1)));
    }
}
