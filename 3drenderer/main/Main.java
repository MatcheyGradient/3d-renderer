package main;

import main.meshtests.SimpleMeshes;

import javax.swing.*;

public class Main extends JFrame {

    public Main(){
        this.add(new Window());
        this.setTitle("3d version 2!!!!!");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args){
        // Initialize
        Mesh.init();
        SimpleMeshes.initMeshes();
        Graph.init();

        new Main();
    }

}
