public class RepeatString {
    public void print(String str, int no_of_times)
    {
        String repeated = new String(new char[no_of_times]).replace("\0", str);
        System.out.println(repeated);
    }
}
