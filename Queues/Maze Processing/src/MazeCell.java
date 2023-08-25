public class MazeCell {
    int x,y;
    MazeCell(){

    }
    MazeCell(int x, int y){
        this.x = x;
        this.y = y;
    }
    boolean equals(MazeCell cell){
        return x ==cell.x && y==cell.y;
    }
}
