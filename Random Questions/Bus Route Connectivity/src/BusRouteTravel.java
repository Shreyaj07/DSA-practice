import java.util.Scanner;

public class BusRouteTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of stops for routes A and B
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // Read the stops for route A
        int[] stopsA = new int[N];
        for (int i = 0; i < N; i++) {
            stopsA[i] = scanner.nextInt();
        }

        // Read the stops for route B
        int[] stopsB = new int[M];
        for (int i = 0; i < M; i++) {
            stopsB[i] = scanner.nextInt();
        }

        // Read source and destination stops
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

        // Check if the passenger can travel from source to destination using the available buses
        boolean canTravel = canTravelFromSourceToDestination(stopsA, stopsB, X, Y);

        // Print the result
        if (canTravel) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }

    // Function to check if the passenger can travel from source to destination
    private static boolean canTravelFromSourceToDestination(int[] stopsA, int[] stopsB, int X, int Y) {
        boolean foundXInA = false;
        boolean foundYInB = false;

        // Check if source stop X is in route A
        for (int stop : stopsA) {
            if (stop == X) {
                foundXInA = true;
                break;
            }
        }

        // Check if destination stop Y is in route B
        for (int stop : stopsB) {
            if (stop == Y) {
                foundYInB = true;
                break;
            }
        }

        // If both source and destination are found in their respective routes, the passenger can travel
        return foundXInA && foundYInB;
    }
}

