public class MyRunnable implements Runnable{
    public void run() {
        System.out.println("My runnable class");
    }
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();
    }
}
