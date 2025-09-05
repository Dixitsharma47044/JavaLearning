public class recursion2 {
    public static void printsum(int i, int n, int sum) { // make another method using return value
        if (i == n) {
            sum += i;

            System.out.println(sum);
            return;
        }
        sum += i;
        printsum(i + 1, n, sum);
    }

    public static void factorial(int i, int n, int fact) {
        if (i == n) {
            fact *= i;
            System.out.println(fact);
            return;

        }
        
        factorial(i + 1, n, fact);
    }

    public static void main(String[] args) {
        factorial(1, 5, 0);
        //printsum(1, 10, 0);
    }
}
