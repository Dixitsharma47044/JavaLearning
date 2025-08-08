public class recursion1 {
//     public static void printnum(int n){
//         if(n == 0){
//             return;
//         }
//         System.out.println(n);
//         printnum(n-1);
//     }    
//     public static void main(String[]args){
//         int n = 5;
//         printnum(n);
//     }
// }

public static void main (String [] args){
    int a [] = {4,5,3,6,4,1};
    for(int i = 0; i < a.length ; i++){
        for( int j = 0; j < a.length -1; j++){
            // System.out.println(a.length);
            if( a[j]> a[j+1]){
                int tem = a[j];
                a[j] = a[j + 1];
                a[j +1] = tem;
            }
        }
       
    }
     for (int i = 0; i <a.length; i++){
        System.out.println(a[i]);
     }
}
}