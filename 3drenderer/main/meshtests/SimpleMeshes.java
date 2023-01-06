package main.meshtests;

import main.Mesh;

public class SimpleMeshes {

    public static double[][] floor = new double[441][3];


    public static void initMeshes(){
        int num = 0;

        for(int i = -10; i < 11; i++){
            for(int j = -10; j < 11; j++){
                floor[num] = new double[]{i * 2, 0, -j * 2};
                num++;
            }
        }

        //Mesh.meshes.add(floor);
    }
}
