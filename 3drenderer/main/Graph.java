package main;

public class Graph {

    static int unit = 100;
    
    static float size = 50;

    public static double[][] sin = new double[unit * unit * 4][3];

    static void init(){
        int num = 0;
        for(double i = 0; i < unit; i++){
            for(double j = 0; j < unit; j++){
                sin[num] = new double[]{i / (unit/size), out(i / (unit/size), j / (unit/size)), j / (unit/size)};
                num++;
            }
        }
        for(double i = 0; i < unit; i++){
            for(double j = 0; j < unit; j++){
                sin[num] = new double[]{-i / (unit/size), out(-i / (unit/size), j / (unit/size)), j / (unit/size)};
                num++;
            }
        }
        for(double i = 0; i < unit; i++){
            for(double j = 0; j < unit; j++){
                sin[num] = new double[]{-i / (unit/size), out(-i / (unit/size), -j / (unit/size)), -j / (unit/size)};
                num++;
            }
        }
        for(double i = 0; i < unit; i++){
            for(double j = 0; j < unit; j++){
                sin[num] = new double[]{i / (unit/size), out(i / (unit/size), -j / (unit/size)), -j / (unit/size)};
                num++;
            }
        }
        Mesh.meshes.add(sin);
    }

    static double out(double x, double z){ // function goes here
        double k = sin(Math.abs(x) + Math.abs(z));

        return (Double.isNaN(k))? 100000 : k;
    }

    static double newPyth(double a, double b){
        return (Math.abs(a) > Math.abs(b))? .96 * Math.abs(a) + .4 * Math.abs(b) : .96 * Math.abs(b) + .4 * Math.abs(a);
    }

    static double log(double x){
        return Math.log(x);
    }
    static double abs(double x){
        return Math.abs(x);
    }
    static double atan(double x){
        return Math.atan(x);
    }
    static double pow(double x, double y){
        return Math.pow(x, y);
    }
    static double sin(double x){
        return Math.sin(x);
    }
    static double cos(double x){
        return Math.cos(x);
    }
    static double tan(double x){
        return Math.tan(x);
    }
    static double sign(double x){
        return Math.signum(x);
    }


}
