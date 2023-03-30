public class Screen {
    private int[] where = {0,0};
    private int Zcoord = 0;
    private Vertex camera = new Vertex(0,0,0);

    public Screen(int z){
        Zcoord = z;
    }

    public void setCamera(Vertex ca){
        camera = ca;
    }


    //main code
    public int[] findWhere(){
        return where;
    }

    public void findx(Vertex a, Vertex b){
        int AX = a.getArr()[0];
        int BX = b.getArr()[0];
        int AZ = a.getArr()[2];
        int BZ = b.getArr()[2];

        int difZ = BZ-AZ;
        int difX = BX-AX;

        int screendist = camera.getArr()[2] - AZ;
        int fac = difZ/screendist;
        where[0] = difX*fac;
    }

    public void findy(Vertex a, Vertex b){
        int AY = a.getArr()[1];
        int BY = b.getArr()[1];
        int AZ = a.getArr()[2];
        int BZ = b.getArr()[2];

        int difZ = BZ-AZ;
        int difY = BY-AY;

        int screendist = camera.getArr()[2] - AZ;
        int fac = difZ/screendist;
        where[1] = difY*fac;
    }

}
