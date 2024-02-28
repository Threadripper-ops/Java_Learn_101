package com.lol.Algorithms.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> out = subsetdup(arr);

        for (List<Integer> l : out){
            System.out.println(l);
        }


    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> out = new ArrayList<>();

        out.add(new ArrayList<>());

        for (int num : arr){
            int n = out.size();
            for (int i =0 ; i<n;i++){
                List<Integer> internal = new ArrayList<>(out.get(i));
                internal.add(num);
                out.add(internal);
            }
        }
        return out;
    }

    static List<List<Integer>> subsetdup(int[] arr){
        Arrays.sort(arr);

        List<List<Integer>> out = new ArrayList<>();

        out.add(new ArrayList<>());
        int s=0;
        int e = 0;

        for (int i =0; i<arr.length;i++){
                 s=0;
            //if current and previous are same then start = end+1
            if(i>0 && arr[i]==arr[i-1]){
                s=e+1;
            }
            e=out.size()-1;

            int n = out.size();
            for (int j =s ; j<n;j++){
                List<Integer> internal = new ArrayList<>(out.get(j));
                internal.add(arr[i]);
                out.add(internal);
            }
        }
        return out;
    }
}
