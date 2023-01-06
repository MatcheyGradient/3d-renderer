package main;

import java.util.ArrayList;
import java.util.List;

public class Mesh {

    public static List<double[][]> meshes = new ArrayList<double[][]>();
    public static List<int[][][]> lines = new ArrayList<>();

    static double[][] cube = {
            {-1, 1, 1},
            {1, 1, 1},
            {-1, -1, 1},
            {1, -1, 1},
            {-1, 1, -1},
            {1, 1, -1},
            {-1, -1, -1},
            {1, -1, -1}
    };

    static int[][][] cubeLines = {
            {{1, 1, 1}, {1, 1, -1}},
            {{1, -1, 1}, {1, -1, -1}},
            {{-1, 1, 1}, {-1, 1, -1}},
            {{-1, -1, 1}, {-1, -1, -1}},
            {{-1, 1, 1}, {1, 1, 1}},
            {{-1, -1, 1}, {1, -1, 1}},
            {{-1, 1, -1}, {1, 1, -1}},
            {{-1, -1, -1}, {1, -1, -1}},
            {{-1, 1, 1}, {-1, -1, 1}},
            {{1, 1, 1}, {1, -1, 1}},
            {{-1, 1, -1}, {-1, -1, -1}},
            {{1, 1, -1}, {1, -1, -1}},
    };

    static double[][] triangle = {
            {4, 0, 0},
            {6, 0, 0},
            {5, 0, -2},
            {5, 2, 0},
    };

    static int[][][] triangleLines = {
            {{4, 0, 0}, {6, 0, 0}},
            {{4, 0, 0}, {5, 2, 0}},
            {{5, 2, 0}, {6, 0, 0}},
            {{5, 2, 0}, {5, 0, -2}},
            {{5, 0, -2}, {6, 0, 0}},
            {{5, 0, -2}, {5, 2, 0}},
            {{5, 0, -2}, {4, 0, 0}}
    };

    static int[][] axis = {
            {0, 10, 0},
            {0, -10, 0},
            {-10, 0, 0},
            {10, 0, 0},
            {0, 0, -10},
            {0, 0, 10}
    };

    static int[][][] axisLines = {
            {{0, 20, 0}, {0, -20, 0}},
            {{-20, 0, 0}, {20, 0, 0}},
            {{0, 0, -20}, {0, 0, 20}}
    };

    static void init() {
        //meshes.add(cube);
        //meshes.add(triangle);
        //meshes.add(axis);

        //lines.add(cubeLines);
        //lines.add(triangleLines);
        lines.add(axisLines);
    }

}
