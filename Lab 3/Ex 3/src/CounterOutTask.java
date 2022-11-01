import java.util.Random;

public class CounterOutTask implements Task{
    protected int nr;
    public int counter = 0;

    CounterOutTask()
    {
        Random rand = new Random(); //instance of random class
        int upperbound = 50; //generate random values from 0-50
        nr = rand.nextInt(upperbound);

        while(nr == 0)
            nr = rand.nextInt(upperbound);
    }

    @Override
    public void execute()
    {
        System.out.println("Hello from CounterOutTask. The counter stops at " + nr);
        for(int i = 0; i < nr; i++) {
            counter++;
            System.out.println("Counter is " + counter);
        }
    }
}
