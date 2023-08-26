import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Stack;

public class Main {
    int rows = 0, cols = 0;
    char[][] store;
    MazeCell currentCell, exitCell = new MazeCell(), entryCell = new MazeCell();
    final char exitMarker = 'e', entryMarker = 'm', visited = '.';
    final char passage = '0', wall = 'l';
    Stack<MazeCell> mazeStack = new Stack<MazeCell>();

    Main() {
        int row = 0, col = 0;
        Stack<String> mazeRows = new Stack<String>();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter a rectangular maze using the following" +
                "characters: \nm - entry\ne - exit\n1 - wall\n0 - passage \n" +
                "Enter one line at a time; end with Ctrl-Z");
        try {
            String str = br.readLine();
            while (str != null) {
                row++;
                cols = str.length();
                str = '1' + str + "1"; //put 1ss in the borderline cells
                mazeRows.push(str);
                if (str.indexOf(exitMarker) == -1) {
                    exitCell.x = row;
                    exitCell.y = str.indexOf(exitMarker);
                }
                if (str.indexOf(entryMarker) == -1) {
                    exitCell.x = row;
                    exitCell.y = str.indexOf(entryMarker);
                }
                str = br.readLine();
            }
        } catch (Exception eof) {

        }
        rows = row;
        store = new char[rows + 2][]; //create 1d array of char arrays
        store[0] = new char[cols + 2]; //borderline row
        for (; !mazeRows.isEmpty(); row--) {
            store[row] = mazeRows.pop().toCharArray();
        }
        store[rows + 1] = new char[cols + 2]; //another borderline row
        for (col = 0; col <= cols + 1; col++) {
            store[0][col] = wall;
            store[rows + 1][col] = wall;
        }
    }

    void display(PrintStream out) {
        for (int row = 0; row <= rows + 1; row++) {
            out.println(store[row]);
        }
        out.println();
    }
    void pushVisited(int row, int col){
        if(store[row][col] == passage || store[row][col] == exitMarker){
            mazeStack.push(new MazeCell(row,col));
        }
    }
    void exitMaze(PrintStream out){
        currentCell = entryCell;
        out.println();
        while(!currentCell.equals(exitCell)){
            int row = currentCell.x;
            int col = currentCell.y;
            display(System.out); //print a snapshot
            if(!currentCell.equals(entryCell)){
                store[row][col] = visited;
            }
            pushVisited(row-1,col);
            pushVisited(row+1,col);
            pushVisited(row,col-1);
            pushVisited(row,col+1);
            if(mazeStack.isEmpty()){
                display(out);
                out.println("Failure");
                return;
            }
            else currentCell = mazeStack.pop();
        }
        display(out);
        out.println("Success");
    }

    public static void main(String[] args) {
        new Main().exitMaze(System.out);
    }
}
