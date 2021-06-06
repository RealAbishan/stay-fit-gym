package sample;

import java.io.*;
import java.util.*;

public class readFile
{

    private Scanner fileInput;

    public void readFile()
    {
        try
        {
            fileInput = new Scanner(new File("stayFilDataBase.txt"));
        }

        catch (FileNotFoundException e) {
           System.out.println("Could Not Find the File");
        }
    }
    
    
    public void readFileFromDb()
    {
        while (fileInput.hasNext())
        {
            String membershipNumber = fileInput.next();
            String memberName = fileInput.next();
            String membershipStartDate = fileInput.next();
            String nicNumber = fileInput.next();
            String mobileNumber = fileInput.next();

        }
    }

}
