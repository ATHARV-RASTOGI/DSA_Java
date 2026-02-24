package Heap;

import java.util.ArrayList;
import java.util.Arrays;

public class retry_heap {

    public ArrayList<Integer>list;

    public retry_heap(){
        list= new ArrayList<>();
    }

    public void swap(int first, int second){
        Integer temp= list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
    public int parent(int index){
        return (index-1)/2;
    }
    public int left(int index){
        return (2*index)+1;
    }
    public int right(int index){
        return (2*index)+2;
    }

    public Integer remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Empty");
        }
        Integer temp= list.get(0);
        Integer last= list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            down(0);
        }
        return temp;
    }

    private void up(int i ){
        if(list.isEmpty()){
            return;
        }
        int parent= parent(i);
        if(list.get(i).compareTo(list.get(parent))>0){
            swap(i,parent);
            up(parent);
        }
    }

    private void down(int i) {
        int left = left(i);
        int right= right(i);
        int root= parent(i);

        if(left<list.size() && list.get(root).compareTo(list.get(left))>0){
            root=left;
        }
        if(right<list.size() && list.get(root).compareTo(list.get(right))>0){
            root=left;
        }

        if(root != i){
            swap(root,i);
            down(i);
        }
    }

    public ArrayList<Integer> heapsort() throws Exception{
        ArrayList<Integer> data =new ArrayList<>();
        while(!list.isEmpty()){
            data.add(this.remove());
        }
        return data;
    }

}
