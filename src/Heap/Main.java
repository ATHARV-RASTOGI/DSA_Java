package Heap;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception{
        Heap heap=new Heap();
        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(94);
        heap.insert(76);

//      System.out.println(heap.remove());

        ArrayList <Integer>heeap = heap.heapsort();
        System.out.println(heeap);



    }
}
