package drive;

public class Main {
    public static void main(String[] args) {
        ShuntingYard a = new ShuntingYard();
        a.parse("(4+3)*5+(6-1)");
        a.process();
        System.out.println("Result is: " + a.run());
    }
}
