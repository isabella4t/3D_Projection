public class Main {
    public static void main(String[] args) {

        int[] P0 = {0,0,0};
        int[] L0 = {0,0,10};
        int[] l = {0,0,10};
        int[] n = {0,0,0};
        int ne = 1;


    }

    public static void Findintersection(int[] p, int[] l0, int[] n, int[] l, int ne){
        int[] ee = {p[0]-l0[0],p[1]-l0[1],p[2]-l0[2]};
        int[][] bee = {{n[0]},{n[1]},{n[2]}};

        int[] gee = multiply(ee,bee);

        for(int i =0; i<l.length;i++){
            l[i]*=ne;
        }

        divide(gee,l);


    }

    public static int[] multiply(int[] fir, int[][] sec) {
        //new array is row length in first by column length in second
        int[] newarr = new int[sec[0].length];
        int acc = 0;
            for (int j = 0; j < sec[0].length; j++) {
                for (int l = 0; l < fir.length; l++) {
                    newarr[j] += fir[l] * sec[l][j];
                }
            }
        return newarr;

    }

    public static int[][] divide(int[] n, int[] l){

    }

    public static int[] ellipse(int v0, int v1, int v2, int v3, int v4, int[] arr){
        int[] gee = {v0,v1,v2,v3,v4};
        int[][] arrt = new int[1][5];
        for (int i =0; i<arr.length;i++){
            arrt[0][i] = arr[i];
        }
        int[] retva = multiply(gee,arrt);
        return retva;
    }

    //How to make circle
    /*

    make an equation like ax^2 + bxy + cy^2 + dy + e =0

    1= x^2/a^2 + y^2/b^2

    TODO: write a funct that takes 5 points to gen 5 values to make a ellipse
     */

    /*
    I need to figure out what display I want.
    - Turtles?
    - 0 and os and stuff

    Need to organize my points and edges
    - DATA STRUCTURES
    - Probably hashset with vertices and edges (oo maybe faces)


    How to rotate a point
     - matrix multiplicaiton code

     */

    /*
    3/27/23 I am confused

    [1, 1]  [1] = 1
            [0]
    dotprod of A and B


    1 * [1,0]

    B/(length of B)

So C = {dot prod * B / root (b[1],b[2],b[3])



     */

}
