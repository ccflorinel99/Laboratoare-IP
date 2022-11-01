import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteFile {
    public void write(String path)
    {
        try {
            File myObj = new File(path);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
