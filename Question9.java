public class Question9 {



public static void main(String args[]) {
    int a = 3;
    int b = 3;
    int c = 1;
    int sum = 0;
    int array[][] = new int[a][b];
    for (int i = 0; i < a; i++) {
        for (int j = 0; j < b; j++) {
            array[i][j] = c;
            sum += c;
            c++;

            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }
    System.out.println(sum);
}
}
