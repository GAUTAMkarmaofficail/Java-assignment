/*
20)Create class Tile to store the edge length of a square tile , and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
*/
class Tile{
    private int edge;
    public Tile(int edge){
        this.edge = edge;
    }
    public int getEdge(){
        return edge;
    }
}
class Floor{
    private int length;
    private int width;
    
    public Floor(int length, int width){
        this.length = length;
        this.width = width;
    }
    public void display(Tile tile){
       int totalNumberTilesNeeded =   (length*width) / (tile.getEdge()*tile.getEdge());
       System.out.println("Total Tiles Required : "+totalNumberTilesNeeded);
    }
}
class TestMain{
    public static void main(String args[]){
        Tile t = new Tile(10); // t-->edge=10
        Floor f = new Floor(20,50); // f-->length=20,width=50
        f.display(t);
       
       
    }
}
