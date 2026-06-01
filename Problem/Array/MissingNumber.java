/*
You are given an array arr[] of size n - 1 that contains distinct integers in the range 
from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n 
with one element missing. Your task is to identify and return the missing element.
*/

package Array;

public class MissingNumber {
    public static void main(String[] args){
        int arr[] = {1};
        int m_number = findmissingnumber.missingnumber(arr);

        System.out.println("Missing number: "+m_number);
    }
}

final class findmissingnumber {
    static int missingnumber(int arr[]){
        int n = arr.length + 1;
        int expected_sum = n * (n+1)/2;

        int actual_sum = 0;

        for(int num: arr){
            actual_sum = actual_sum + num;
        }
        return expected_sum - actual_sum;
    }
}
