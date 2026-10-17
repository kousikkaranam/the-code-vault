// Sum of N natural numbers
public static int findSum(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    return sum;
}


// Sum of squares of first n natural numbers
public static int summation(int n) {
    int summation = 0;
    for (int i = 1; i <= n; i++) {
        summation += i * i;
    }
        return summation;

}






/// optimized
public static long findSumOzd(long n) {
    return n * (n + 1) / 2;
}

public static long summationOzd(long n) {
    return n * (n + 1) * (2 * n + 1) / 6;
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(findSumOzd(n));
    System.out.println(summationOzd(n));
}
