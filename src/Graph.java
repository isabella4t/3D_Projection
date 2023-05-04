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

    public Graph(Set<Vertex> vertices ,Set<Edge> edges){
        this.vertices = new HashSet<Vertex>();
        this.edges = new HashSet<Edge>();

        for(Vertex n: vertices) this.vertices.add(n);
        for(Edge e: edges) this.edges.add(e);
    }

    public Graph(Set<Vertex> vertices){
        this.vertices = new HashSet<Vertex>();

        for(Vertex n: vertices) this.vertices.add(n);
    }

    //TODO: Rotation of points!
    public Vertex rotating(Vertex n, int x, int y, int z){
        Vertex ret = n;
        ret = rotateX(x,ret);
        ret = rotateY(y,ret);
        ret = rotateZ(z,ret);
        return ret;
    }



    //matrix multiplication for rotation
    public static int[] multiply(int[] fir, double[][] sec) {
        //new array is row length in first by column length in second
        int[] newarr = new int[fir.length];
        int acc = 0;

        for (int l = 0; l<sec.length;l++){
                for (int j = 0; j < sec[0].length; j++) {
                        newarr[l] += fir[j]*sec[l][j];
                }
        }
        return newarr;
    }

    public Vertex rotateX(int theta,Vertex n){
            int[] temp = new int[]{n.getArr()[1],n.getArr()[2]};
            double[][] rota = new double[][]{{Math.cos(theta),-Math.sin(theta)},{Math.sin(theta),Math.cos(theta)}};

            int[] transformedcoords = multiply(temp,rota);

            return new Vertex(n.getArr()[0],transformedcoords[0],transformedcoords[1]);

    }

    public Vertex rotateY(int theta, Vertex n){
        int[] temp = new int[]{n.getArr()[0],n.getArr()[2]};
        double[][] rota = new double[][]{{Math.cos(theta),Math.sin(theta)},{-Math.sin(theta),Math.cos(theta)}};

        int[] transformedcoords = multiply(temp,rota);

        return new Vertex(transformedcoords[0],n.getArr()[1],transformedcoords[1]);

    }
    public Vertex rotateZ(int theta, Vertex n){
        int[] temp = new int[]{n.getArr()[0],n.getArr()[1]};
        double[][] rota = new double[][]{{Math.cos(theta),Math.sin(theta)},{-Math.sin(theta),Math.cos(theta)}};

        int[] transformedcoords = multiply(temp,rota);

        return new Vertex(transformedcoords[0],transformedcoords[1],n.getArr()[2]);

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
