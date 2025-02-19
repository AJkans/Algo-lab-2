public class main {

    public static void main(String[] args) {
        int n = 5; // Example value: n is 5, an odd integer greater than 3
        int[][][] cube = new int[n][n][n];

        // Calculate the center index
        int center = (n - 1) / 2;

        // Initialize all elements to 0 and set the center to 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i == center && j == center && k == center) {
                        cube[i][j][k] = 1;
                    } else {
                        cube[i][j][k] = 0;
                    }
                }
            }
        }

        // Call the method to print the center
        printCenter(cube);
    }

    public static void printCenter(int[][][] cube) {
        int n = cube.length;
        int centerIndex = (n - 1) / 2;
        int centerValue = cube[centerIndex][centerIndex][centerIndex];

        System.out.println("Center Position: [" + centerIndex + ", " + centerIndex + ", " + centerIndex + "]");
        System.out.println("Value at Center: " + centerValue);
    }
}