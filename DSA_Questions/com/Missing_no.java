package DSA_Questions.com;
class mis{
    public int cycsort(int []arr){
        int i=0;
        
        while(i<arr.length){
            int cor=arr[i];
        if( arr[i]<arr.length && arr[i]!=arr[i]  ){
            swap(arr,i,cor);
        }
        else{
            i++;
        }
    }
    for(int index=0;index<arr.length;index++){
        if(arr[index]!=index){
            return index;
        }
    }
    return arr.length;
}

    static void swap(int []arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
    }
}

public class Missing_no {
    public static void main(String[] args) {
        int []arr={2,4,1,5,6,7,3};
        mis m= new mis();
        m.cycsort(arr);
    }
}
