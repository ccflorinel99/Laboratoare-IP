public class Person implements IPerson{

    protected String firstName;
    protected String lastName;
    protected int age;
    public void greet() {
        System.out.println("Hello, my name is " + firstName + " " + lastName + "!");
    }
    public void doWork() {
        System.out.println("Go to work...");
    }
    public void sleep() {
        System.out.println("It's time to get some rest...");
    }
}