package Examples;

public class RecursionTest {


	public static void main(String[] args) {
        System.out.println(countZeros(400340, 0));
        System.out.println(power(2, 5));
        System.out.println(facto(5));
        System.out.println(fibNum(50));
        fibSeq(7, 0, 1);
        printNum(5);
        System.out.println(digitProduct(4134));
        System.out.println(digitSum(4034));
    }

    // T.C = O(n) & S.C = O(n).
    public static int digitSum(int num) {
        int rem = num % 10; // remainder.
        if (rem == num) {
            return num;
        }
        return (rem + digitSum(num / 10));
    }
    
    // T.C = O(n) & S.C = O(n).
    public static int digitProduct(int num) {
        int rem = num % 10; // remainder.
        if (rem == num) {
            return num;
        }
        return (rem * digitProduct(num / 10));
    }
    
	// T.C = O(n) & S.C = O(n).
    public static int countZeros(int num, int count) {
        if (num == 0) {
            return count;
        }
        if (num % 10 == 0)
            return countZeros(num / 10, count + 1);
        return countZeros(num / 10, count);
    }
    
    // T.C = O(n) & S.C = O(n).
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    // T.C = O(n) & S.C = O(n).
    public static int facto(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * facto(n - 1);
    }
    
    // T.C = O(n) & S.C = O(n).
    public static int fibNum(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibNum(n - 1) + fibNum(n - 2);
    }
    
    // T.C = O(n) & S.C = O(n).
    public static void fibSeq(int n, int a, int b) {
        if (n < 0) {
            return;
        }
        System.out.print(a + " ");
        fibSeq(n - 1, b, a + b);
    }
    
    // T.C = O(n) & Space Complexity = O(n).
    public static void printNum(int n) {
        if (n == 0)
            return;
        printNum(n - 1);
        System.out.print(n + " ");
    }
}


