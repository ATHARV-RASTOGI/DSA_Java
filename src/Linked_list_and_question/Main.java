package Linked_list_and_question;

public class Main {
    public static void main(String[] args) {
        Link_list_and_all_questions link =new Link_list_and_all_questions();
//        link.insertFirst(11);
//        link.insertFirst(11);
//        link.insertFirst(3);
//        link.insertFirst(3);
//        link.insertFirst(8);
//        link.insertFirst(8);
//        link.duplicates_remove();
//        link.dispaly();

        Link_list_and_all_questions first =new Link_list_and_all_questions();
        Link_list_and_all_questions second = new Link_list_and_all_questions();

        first.insertlast(1);
        first.insertlast(3);
        first.insertlast(5);

        second.insertlast(1);
        second.insertlast(2);
        second.insertlast(9);
        second.insertlast(14);

        Link_list_and_all_questions ans = Link_list_and_all_questions.Merge(first,second);
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
