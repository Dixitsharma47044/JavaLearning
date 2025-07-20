import java.util.Scanner;

// public class question7 {
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // int sizer = sc.nextInt();
//         // int sizec = sc.nextInt();
//         int sizer = 4;
//         int sizec = 4;
//         // int num = 1;

//         int[][] matrix = new int[sizer][sizec];

//         for (int i = 0; i < sizer; i++) {
//             for (int j = 0; j < sizec; j++) {
//                 // matrix4[i][j] = num++;
//                 if (i == j) {
//                     matrix[i][j] = 1;
//                 }
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// public static void main(String args[]){
//     int row = 6;
//     int col = 4;

//     int matrix [][]= new int[row][col];

//     for(int i = 0; i < row ; i++){
//         for(int j = 0; j < col; j++){
//             if( j == 0 || i == row-1 || i == 0 || j == col-1){
//                 matrix[i][j] = 1;
//             }
//             System.out.print(matrix[i][j] + " ");
//         }
//         System.out.println();
//     }
// }

// public static void main(String args[]) {
//     int a = 5;
//     int[][] matrix = new int[a][a];
//     int b = 1;

//     int top = 0;
//     int bottom = a - 1;
//     int left = 0;
//     int right = a - 1;

//     while (top <= bottom && left <= right) {
//         for (int i = left; i <= right; i++) {
//             matrix[top][i] = b++;
//         }
//         top++;
//         for (int i = top; i <= bottom; i++) {
//            matrix[i][right] = b++; 
//         }
//         right--;
//         if (top <= bottom) {
//             for (int i = right; i >= left; i--) {
//                 matrix[bottom][i] = b++;
//             }
        
//         bottom--;
//         }
//         if (left <= right) {
//             for (int i = bottom; i >= top; i--) {
//                 matrix[i][left] = b++;
//             }
//             left++;
//         }
//     }

//     for (int i = 0; i < a; i++) {
//         for (int j = 0; j < a; j++) {
//             System.out.print(matrix[i][j] + " ");
//         }
//         System.out.println();
//     }
// }



public static void main( String args[]){
    int row = 4;
    int col = 4;
     int matrix[][] = new int [row][col];
     
     for (int i = 0; i < row; i++){
       for (int j = 0; j < col; j++){
        if ((i+j)% 2 ==0){
            matrix[i][j] = 1;
        }
          System.out.print(matrix[i][j] + " ");
       }
        System.out.println();
     }  
} 