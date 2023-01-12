public class Main {
    public static void main(String[] args) {
//        Engine engine = new Engine ("Renault", 8000);
        Car mercedes = new Car("Mercedes AMG", 2, "Silver", new Engine("Renault", 8000));

        System.out.println(mercedes.getName());
        Engine engine = mercedes.getEngine();
        System.out.println("Engine Model: " + engine.getModel());
    }
}