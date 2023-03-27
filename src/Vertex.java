public class Vertex {
    private int[] arr = new int[3];

    public Vertex(int x, int y, int z){
        arr = new int[]{x, y, z};
    }

    public int[] getArr(){
        return arr;
    }

    public String toString(){
        return " X: " + arr[0] + " Y: " + arr[1] + " Z: " + arr[2];
    }

}
