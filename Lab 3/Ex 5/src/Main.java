public class Main {
    public static void main(String[] args) {
        for(int i = 0; i <= 9; i++)
        {
            MyThread thread = new MyThread(i);
            thread.run();
        }
    }
}