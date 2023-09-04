// package Coding Ninja;
import java.util.*;
public class SquareRootOfANumber {

    public static int sqrtN(long N) {
		int res = (int)Math.sqrt(N);
        return res;
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int ans = sqrtN(N);
        System.out.println(ans);
    }
}
