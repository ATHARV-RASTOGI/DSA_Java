package com.Rastogi;

public class Main {
    public static void main(String[] args) {
        Link_list link =new Link_list();
//        link.insertFirst(11);
//        link.insertFirst(11);
//        link.insertFirst(3);
//        link.insertFirst(3);
//        link.insertFirst(8);
//        link.insertFirst(8);
//        link.duplicates_remove();
//        link.dispaly();

        Link_list first =new Link_list();
        Link_list second = new Link_list();

        first.insertlast(1);
        first.insertlast(3);
        first.insertlast(5);

        second.insertlast(1);
        second.insertlast(2);
        second.insertlast(9);
        second.insertlast(14);

        Link_list ans = Link_list.Merge(first,second);
        ans.dispaly();









        // D_linked_list linked= new D_linked_list();
//        linked.insertfirst(90);
//        linked.insertfirst(23);
//        linked.insertfirst(70);
//        linked.insertfirst(85);
//        linked.display();
//        linked.insertlast(5);
//        linked.display();
//        linked.insert(85,30);
//        linked.display();

    }
}
