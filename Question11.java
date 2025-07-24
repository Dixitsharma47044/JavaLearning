public class Question11 {

    public static void main(String[] args) {
        int a = 3;
        int b = 3;
        int c = 1;

        int[][] matrix = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = c++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        int[][] t = new int[b][a];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                t[j][i] = matrix[i][j];
            }
        }
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int s[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                s[i][j] = 0;
                for (int k = 0; k < a; k++) {
                    s[i][j] += matrix[i][k] * t[k][j];
                }
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(s[i][j] + " ");
            }
            System.out.println();
        }

    }

}