package classes;

public class Main {
    public static void main(String[] args) {
        Son son =new Son(90);
        son.career("Doctor");

        daughter daughter=new daughter();
        daughter.career("pilot");
        daughter.Partner(24);

        Parent mom= new Parent() {
            @Override
            void career(String name) {

            }

            @Override
            void Partner(int age) {

            }
        };
    }
}
