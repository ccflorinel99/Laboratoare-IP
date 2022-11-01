import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.IOException;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Email {
    protected static String readFile(String filename)
    {
        String str = new String();
        int counter = 0;
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (counter == 0)
                    str += data;
                else
                    str += "\n" + data;
                counter++;
            }
            return str;
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return "";
    }

    protected static int findRegex(String str)
    {
        int count = 0;
        String[] arr = str.split("\n");
        String regex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
        Pattern pattern = Pattern.compile(regex);

        for(String item: arr)
        {
            Matcher matcher = pattern.matcher(item);
            if(matcher.matches()) {
                System.out.println(item);
                count++;
            }
        }

        return count;
    }

    public static void main( String args[] ) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        //System.out.println("Working Directory = " + System.getProperty("user.dir"));
        try {
            System.out.print("Introduceti fisierul care contine email-urile: ");
            String filename = in.readLine();
            String fileContent = readFile(filename);
            //System.out.println("File content:\n" + fileContent);

            int matches = findRegex(fileContent);

            if(matches == 0)
                System.out.println("Nu au fost gasite email-uri in fisierul " + filename);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
