package Stack_queue;

public class QueueMain {
    public static void main(String[] args) {
//        CustomQueue qq= new CustomQueue(4);
//        qq.insert(90);
//        qq.insert(80);
//        qq.insert(70);
//        qq.display();

        CircularQueue fd = new CircularQueue(5);
        fd.insert(99);
        fd.insert(56);
        fd.insert(4);
        fd.insert(2);
        fd.insert(9);
        fd.display();
    }
}
