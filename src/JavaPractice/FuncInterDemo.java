package JavaPractice;

public class FuncInterDemo {


    public static void main(String[] args) {
        FuncInterface funcInterface = (a,b) -> a + b;

        System.out.println(funcInterface.sum(5,7));
    }
}
