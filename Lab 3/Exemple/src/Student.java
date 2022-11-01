public class Student extends Person{

    public void greet() {
        super.greet();
        System.out.println("Sa traiti, sunt student " + firstName + " " + lastName + "!");
    }

    public void doWork() {
        System.out.println("It's time to do some sectoare, I'm so excited!");
    }

    public void sleep() {
        System.out.println("A student is not allowed to sleep, he can only rest his eyes!");
    }

    Student(String fullName) {
        String[] names = fullName.split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main (String[] args) {
        Student s = new Student("Paul-Florinel Căsăndroiu");
        s.age = 22;
        System.out.println(s.toString());
    }
}