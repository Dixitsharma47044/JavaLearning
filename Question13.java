public class Question13 {

    // bubble sorting

    // public static void main(String[] args) {
    // int a[] = { 5, 6, 2, 3, 1, 4 };

    // for (int i = 0; i < a.length - 1; i++) {
    // for (int j = 0; j < a.length - 1 - i; j++) {
    //     System.out.println(j);
    // if (a[j] > a[j + 1]) {

    // int temp = a[j];
    // a[j] = a[j + 1];
    // a[j + 1] = temp;
    // }
    // }
    // }
    // for (int i = 0; i < a.length; i++) {
    // System.out.print(a[i] + " ");
    // }
    // }
    // }

    // selection sorting
    public static void main(String[] args) {
    int a[] = { 5, 6, 2, 3, 1, 4 };

    for (int i = 0; i < a.length; i++) {
    int smallest = i;
    for (int j = i + 1; j < a.length; j++) {
    if (a[smallest] > a[j]) {
    smallest = j;
    }
    }
    int temp = a[smallest];
    a[smallest] = a[i];
    a[i] = temp;

    }
    for (int i = 0; i < a.length; i++) {
    System.out.print(a[i] + " ");
    }
    }
    }

    // insertion sort

//     public static void main(String[] args) {
//         int a[] = { 5, 6, 2, 3, 1, 4 };
//         // int a[] = { 5, 6, 3 };

//         for (int i = 0; i < a.length; i++) {
//             int current = a[i];
//             int j = i - 1;
//             while (j >= 0 && current < a[j]) {
//                 a[j + 1] = a[j];
//                 j--;
//             }

//             a[j + 1] = current;
//         }

//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] );
//         }
//     }
// }
