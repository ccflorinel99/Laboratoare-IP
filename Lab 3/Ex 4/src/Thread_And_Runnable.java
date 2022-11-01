public class Thread_And_Runnable {
    public static void main(String[] args)
    {
        MyThread thread = new MyThread();
        MyRunnable runnable = new MyRunnable();
        Thread anonimus_thread = new Thread(){
            public void run(){
                System.out.println("Anonimus thread running");
            }
        };
        thread.run();
        runnable.run();
        anonimus_thread.start();
    }
}
