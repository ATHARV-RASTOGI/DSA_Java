package Heap;
import interfac.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.PriorityQueue;

//<T extends Comparable<T>>
public class Heap  {
    private ArrayList<Integer> list;

    public Heap(){
        list= new ArrayList<>();
    }


    private void swap(int first , int second){
        Integer temp= list.get(first);
        list.set(first,list.get(second));
        list.set(second, temp);
    }

    private int parent(int index){
        return (index-1)/2;
    }
    private int left (int index){
        return 2*index+1 ;
    }
    private int right(int index){
        return 2*index+2;
    }

    public void insert(Integer value){
        list.add(value);
        upheap(list.size()-1);
    }


    public Integer remove() throws Exception {
        if(list.isEmpty()){
            throw new Exception("Remove from an empty heap!");
        }
        Integer temp = list.get(0);
        Integer last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downheap(0);
        }
        return temp;
    }

    private void upheap(int index){
        if(index==0){
            return;
        }
        int p = parent(index);
//        here use > for max heap
        if(list.get(index).compareTo(list.get(p)) > 0 ){
            swap(index,p);
            upheap(p);
        }

    }
    private void downheap(int index){
        int min= index;
        int left = left(index);
        int right= right(index);

        if(left<list.size() && list.get(min).compareTo(list.get(left)) < 0){
            min=left;
        }
//        for max use <
        if(right<list.size() && list.get(min).compareTo(list.get(right)) < 0){
            min=right;
        }

        if(min!= index){
            swap(min,index);
            downheap(min);
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
