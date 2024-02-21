
public class Main {
    public static void main(String[] args) {
        Context context = new Context(new PlusStrategy());
        System.out.println("Sum: " + context.executeStrategy(6,7));

        context = new Context(new MultiplyStrategy());
        System.out.println("Multiply: " + context.executeStrategy(6,7));
    }
}