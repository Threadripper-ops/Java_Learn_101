package com.lol.Questions;

class P287 {
    public int findDuplicate(int[] arr) {

        int i=0;

        while(i<arr.length){
            if (arr[i]!=i+1){
            int corr = arr[i]-1;
            if(arr[i]!=arr[corr]){
                swap(arr,i,corr);// we are taking the first index element and swapping it with its correct index element

            }else {
                return arr[i];
            }

        }else {
                i++;
            }

    }
        return -1;

    }



    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    }
