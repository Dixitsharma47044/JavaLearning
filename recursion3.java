public class recursion3 {
    // public static int printnum(int n , int sum){
    // if( n == 0){
    // return 0 ;
    // }
    // return n + sum(n-1);

    // }
    // public static void main(String[] args){
    // printnum(10, 1);
    // }

    // public static int sum(int i) {
    // if (i == 0) {
    // return 0;
    // }
    // int tempSum = i + sum(i - 1);
    // return tempSum;
    // }

    // public static void main(String[] args) {
    // int result = sum(5);
    // System.out.println("Sum is: " + result);
    // }







    // public static int power(int x, int y){
    // if (y == 0){
    // return 1;
    // }
    // return x * power( y ,y-1);
    // }
    // public static void main(String[]args){
    // int result = power(5,2);
    // System.out.println("result "+ result);
    // }



    // static int c = 0;

    // public static int count(int n) {

    //     if (n == 0) {
    //         return 1;
    //     } else {
    //         c++;
    //         count(n / 10);
    //     }
    //     return c;

    // }

    // public static void main(String[] args) {

    //     int n = 1234567894;
    //     int b = count(n);
    //     System.out.println("number " + b);

    // }



   
    public static String rvs(String str, int idx) {
        if (idx < 0) {
            return "";
        }
        String word = "";
        String letter =  String.valueOf(str.charAt(idx));
        word = letter + rvs(str, idx - 1);
        return word;
    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(rvs(str, str.length() - 1));
    }
}

