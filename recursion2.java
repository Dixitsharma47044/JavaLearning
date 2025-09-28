public class recursion2 {
    public static void printsum(int i, int n, int sum) { // make another method using return value
        if (i > n) {
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        printsum(i + 1, n, sum);
    }

    public static void factorial(int i, int n, int fact) {
        if (i > n) {
            System.out.println(fact);
            return;
        }
        fact = fact * i;
        factorial(i + 1, n, fact);
    }

    public static void main(String[] args) {
        factorial(1, 5, 1);
        // printsum(1, 10, 0);
    }
}
