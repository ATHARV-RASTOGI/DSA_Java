package sorting;
import java.util.Arrays;

class mergesort{
    public int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergesort(Arrays.copyOfRange(arr, mid,arr.length));

        return merge_comp(left,right);

    }
    public int[] merge_comp(int []first, int[]second){
        int[] mix=new int [first.length+second.length];

        int i=0;
        int j=0;
        int k=0;

    while(i<first.length && j<second.length){
        if(first[i]<second[j]){
            mix[k]=first[i];
            i++;
        }
        else{
            mix[k]=second[j];
            j++;
        }
        k++;
    }
    while(i<first.length){
        mix[k]=first[i];
        i++;
        k++;
    }
    while(j<second.length){
        mix[k]=second[j];
        j++;
        k++;
    }
    return mix;
    }
    
}

public class main{
    public static void main(String[] args) {
        mergesort m=new mergesort();
        int []arr={8,3,4,12,5,6};
        int []res=m.mergesort(arr);
        System.out.println(Arrays.toString(res));
}   
}