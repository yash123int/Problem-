package Array;

import java.util.ArrayList;

public class PrintAlternate {
    public static void main(String[] args){
        int arr[] = {10,20,30,40,50};

        ArrayList<Integer> res = getAlternateValue(arr);

        for(int x : res){
            System.out.print(x+ " ");
        }

    }

    static ArrayList<Integer> getAlternateValue(int[] arr){
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            res.add(arr[i]);
        }
        return res;
    }
}


