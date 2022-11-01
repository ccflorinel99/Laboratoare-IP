public class MyThread extends Thread{
    protected int nr;

    MyThread(int numar)
    {
        nr = numar;
    }

    public void run() {
        System.out.println("My name is " + nr);
    }
}