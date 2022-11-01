import java.util.Random;

public class RandomOutTask implements Task{
    protected int nr;

    RandomOutTask()
    {
        Random rand = new Random(); //instance of random class
        int upperbound = 500; //generate random values from 0-500
        this.nr = rand.nextInt(upperbound);
    }

    @Override
    public void execute()
    {
        System.out.println("Hello from RandomOutTask. The random number is " + nr);
    }
}
