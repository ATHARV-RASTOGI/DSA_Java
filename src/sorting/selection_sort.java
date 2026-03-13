package com.sorting;

import java.util.Arrays;

class operation{
    public void selection(int[]arr){
        for(int i=0;i<arr.length;i++){

            int last=arr.length-i-1;
            int max=maxvalue(arr,0,last);
            swap(arr,max,last);

        }

    }   
    public int maxvalue(int []arr,int start, int end){
        int max=start;
        for(int i= start ;i<=end;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;

    } 
    public void swap(int []arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }

    public void insertion_sort(int []arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr, j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
}



public class selection_sort {
    public static void main(String[] args) {
        int arr[]={4,2,41,9,523,-413};

       operation o= new operation();
        o.insertion_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
