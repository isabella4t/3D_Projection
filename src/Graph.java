import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.lang.Math;

/*
Define a plane (P-P0)n = 0
Defining a line P = L0 +Ld

//n is perpendicular to the plane
// normalized

Combine ((L0+Ld)-P0)n = 0
(ln)d + (l0=P0)n = 0
d = (P0-L0)n / l*n

(Px,Py,Pz)  (L0x,L0y,L0z)

(Px-l0x, Py-L0y, Pz-L0z)*(nx,ny,nz)/l*n

 */

public class Graph {
    private Set<Vertex> vertices;
    private Set<Edge> edges;

    public Graph(Set<Vertex> nodes ,Set<Edge> edges){
        this.vertices = new HashSet<Vertex>();
        this.edges = new HashSet<Edge>();

        for(Vertex n: vertices) this.vertices.add(n);
        for(Edge e: edges) this.edges.add(e);
    }

    /*
    public void rotateX(int theta){
        for(Vertex n: vertices){
            int[] temp = new int[]{n.getArr()[1],n.getArr()[2]};
            double[][] rota = new double[][]{{Math.cos(theta),-Math.sin(theta)},{Math.sin(theta),Math.cos(theta)}};


            n = new Vertex(n.getArr()[0], )//transformed y and transformed z)
        }

    }

     */

    public void rotateY(int theta){


    }
    public void rotateZ(int theta){


    }


    public static int[][] multiply(int[][] fir, int[][] sec) {
        //new array is row length in first by column length in second
        int[][] newarr = new int[fir.length][sec[0].length];
        int acc = 0;

        for (int i = 0; i < fir.length; i++) {
            for (int j = 0; j < sec[0].length; j++) {
                for (int l = 0; l < fir[0].length; l++) {
                    newarr[i][j] += fir[i][l] * sec[l][j];
                }
            }
        }
        return newarr;
    }


    public String toString(){
        String ret = "The graph: \n";
        for(Vertex n:vertices) {
            ret += n.toString() + " ";
        }
        ret += "\n The edges: \n";

        for(Edge e:edges) ret += e.toString() + "\n";
        return ret;
    }
}
