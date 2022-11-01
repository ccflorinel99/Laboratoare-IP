public class OutTask implements Task{
    protected String msg;

    OutTask()
    {
        this.msg = "Hello from OutTask";
    }

    @Override
    public void execute()
    {
        System.out.println(msg);
    }
}
