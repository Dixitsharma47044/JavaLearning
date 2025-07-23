public class Question10 {
    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        int c = 1;

        int[][] matrix = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = c;
                c++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] t = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                t[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }

}
