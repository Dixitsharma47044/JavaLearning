import java.util.Scanner;

public class SpiralMatrixForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the matrix
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];
        int value = 1;

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            // ➡ Left to Right
            for (int i = left; i <= right; i++) {
                matrix[top][i] = value++;
            }
            top++;

            // ⬇ Top to Bottom
            for (int i = top; i <= bottom; i++) {
                matrix[i][right] = value++;
            }
            right--;

            // ⬅ Right to Left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    matrix[bottom][i] = value++;
                }
                bottom--;
            }

            // ⬆ Bottom to Top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    matrix[i][left] = value++;
                }
                left++;
            }
        }

        // Print the matrix
        System.out.println("\nSpiral Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matrix[i][j]);
            }
            System.out.println();
        }

        scanner.close();
    }
}
