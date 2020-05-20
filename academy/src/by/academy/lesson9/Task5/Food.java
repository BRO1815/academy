package by.academy.lesson9.Task5;

public class Food {

    public interface Cookable {
        void cook(String str);
    }
    public void prepare(Cookable c, String str) {
        c.cook(str);
    }

    public static void main(String... arg){
        Food p = new Food();

        Cookable c = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println(str + " готова");
            }
        };
        p.prepare(c, "картошка" );
    }

}
