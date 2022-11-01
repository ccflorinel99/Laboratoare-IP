import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class FileIOExample {
    public static void main(String[] args)
    {
        try {
            FileReader fr = new FileReader("test.txt");
            FileWriter fw = new FileWriter("testOutput.txt");
            String str = "";
            int i;

            // Citire caracter cu caracter din fișierul de intrare până la EOF
            while ((i = fr.read()) != -1) {

                // Storing every character in the string
                str += (char)i;
            }
            System.out.println(str);

            // Scriere conținut în fișierul de ieșire
            fw.write(str);

            fr.close();
            fw.close();

        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}