import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
        path("", 3, 3);
        System.out.println();
        System.out.println(pathList("", 3, 3));
        System.out.println(pathDiagonal("", 3, 3));
        boolean[][] bool = new boolean[3][3];
        bool[0][1] = true;
        System.out.println(Arrays.deepToString(bool));
        System.out.println("Obstacle Maze");
        obstacleMaze("", 0, 0, bool);
    }
    //having obstacles in the maze
    static void obstacleMaze(String p, int r, int c, boolean[][] obstacle) {
        if (r == obstacle.length - 1 && c == obstacle[0].length - 1) {
            System.out.print(p + " ");
            return;
        }
        if (obstacle[r][c]) {
            return;
        }
        if (r < obstacle.length - 1) {
            obstacleMaze(p + 'D', r + 1, c, obstacle);
        }
        if (c < obstacle.length - 1) {
            obstacleMaze(p + 'R', r, c + 1, obstacle);
        }
    }

    static int count(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = count(r - 1, c);
        int right = count(r, c - 1);
        return left + right;
    }

    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.print(p + " ");
            return;
        }
        if (r > 1) {
            path(p + 'D', r - 1, c);
        }
        if (c > 1) {
            path(p + 'R', r, c - 1);
        }
    }
    //having diagonal too up down and diagonal movement
    static ArrayList<String> pathDiagonal(String p, int r, int c) {
        ArrayList<String> al = new ArrayList<>();
        if (r == 1 && c == 1) {
            al.add(p);
            return al;
        }
        if (r > 1 && c > 1) {
            al.addAll(pathDiagonal(p + 'D', r - 1, c - 1));
        }
        if (r > 1) {
            al.addAll(pathDiagonal(p + 'V', r - 1, c));
        }
        if (c > 1) {
            al.addAll(pathDiagonal(p + 'H', r, c - 1));
        }
        return al;
    }

    static ArrayList<String> pathList(String p, int r, int c) {
        ArrayList<String> al = new ArrayList<>();
        if (r == 1 && c == 1) {
            al.add(p);
            return al;
        }
        if (r > 1) {
            al.addAll(pathList(p + 'D', r - 1, c));
        }
        if (c > 1) {
            al.addAll(pathList(p + 'R', r, c - 1));
        }
        return al;
    }
}
