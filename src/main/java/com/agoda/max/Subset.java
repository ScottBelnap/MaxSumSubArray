package com.agoda.max;

/**
 * Created by sbelnap on 8/6/2016.
 */
public class Subset {

    public static int sumSlow(int[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];
                }
                if(max < sum){
                    max = sum;
                }
            }
        }
        return max;
    }

    public static int sumSemiFast(int[] arr){
        int max = arr[0];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum = 0;
            for (int j = i; j < arr.length; j++){
                sum += arr[j];
                if(max < sum){
                    max = sum;
                }
            }
        }
        return max;
    }

    public static int sumFast(int[] arr){
        int max = arr[0];
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum < 0){
                sum = 0;
            }
            if(max < sum){
                max = sum;
            }
        }
        return max;
    }

}
