import java.awt.*;
import java.util.HashSet;
import java.util.Set;


//add turtle
public class Main {
    public static void main(String[] args) {
        int degree = 45;

        Set<Vertex> vertices = new HashSet<Vertex>();
        vertices.add(new Vertex(1,0,0));
        vertices.add(new Vertex(0,0,10));
        vertices.add(new Vertex(1,1,10));
        vertices.add(new Vertex(0,1,0));

        Graph gee = new Graph(vertices);
        gee.rotating(gee[0]);
    }

    /*

    public static void Findintersection(int[] p, int[] l0, int[] n, int[] l, int ne){
        int[] ee = {p[0]-l0[0],p[1]-l0[1],p[2]-l0[2]};
        int[][] bee = {{n[0]},{n[1]},{n[2]}};

        int[] gee = multiply(ee,bee);

        for(int i =0; i<l.length;i++){
            l[i]*=ne;
        }

        divide(gee,l);


    }

     */


    //How to make circle
    /*

     public static int[] ellipse(int v0, int v1, int v2, int v3, int v4, int[] arr){
        int[] gee = {v0,v1,v2,v3,v4};
        int[][] arrt = new int[1][5];
        for (int i =0; i<arr.length;i++){
            arrt[0][i] = arr[i];
        }
        int[] retva = multiply(gee,arrt);
        return retva;
    }

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
