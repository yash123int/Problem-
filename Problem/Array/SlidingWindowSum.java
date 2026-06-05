package Array;
import java.util.Scanner;

public  class SlidingWindowSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long x = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        //generate input based on given formula and also arr[0] = x and remaining arr[i] = generated value
        long[] arr = new long[n];
        arr[0] = x;
        for(int i=1;i<n;i++){
            arr[i] = (a * arr[i-1] + b) % c;
        }

        //This will perform windows sum of size k
        long sum = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }

        //sliding windows and xor of each sum
        long result = sum;
        for(int i=0; i<n-k;i++){
            sum = sum - arr[i] + arr[i+k];
            result ^= sum;
        }

        System.out.println(result);
    }
}
