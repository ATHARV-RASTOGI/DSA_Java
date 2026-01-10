package classes;

public class Son extends Parent{

    public Son (int age){
        this.age=age;
    }
    @Override
    void career(String name) {
        System.out.println("I am not ready to be a "+ name);
    }

    @Override
    void Partner(int age) {

    }
}
