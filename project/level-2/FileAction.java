import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class FileAction {
    public static String createFile(String Filename)throws IOException{
        File obj = new File(Filename + ".txt");
        if(obj.createNewFile()){
            System.out.println(Filename + ".txt has been succesfully created");
            System.out.println("You can find your file at " + obj.getAbsolutePath());
        }
        else{
            System.out.println("Error occured");
        }
        return obj.getAbsolutePath();
    }

    static void editFile(String filename, String Contents)throws IOException{
        try (FileWriter writes = new FileWriter(filename+".txt")) {
            writes.write(Contents);
            System.out.println("Operation successful");
        }
        catch(IOException e){
            System.out.println("error occured try again");
        }
    }
    public static void main(String[] args)throws IOException, FileNotFoundException{
        System.out.println("\t\t\t\tFile Encryption/Decryption");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("This program is defined to encrypt or decrypt the contents of a text file.\nThe user can perform both encryption and decryption of a text file by providing\nthe absolute path of the respective text file and the key in case of decryption ");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\tMENU");
        System.out.println("1. Create a file\n2. Edit a file\n3.Encrypt a file\n4.Decrypt the file(key needed)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int choice = Integer.parseInt(br.readLine());
        switch(choice){
            case 1 : //create file
                     System.out.print("Name your File: ");
                     String name = br.readLine();
                     String Path = createFile(name);
                     System.out.println("Do you want to edit/write in the file: ");
                     String ans = br.readLine();
                     boolean decision = Pattern.matches("yes", ans.toLowerCase());
                    //  System.out.println(decision);
                    if(decision){
                        System.out.print("Enter the text you want to add to your text file: ");
                        String contents = br.readLine();
                        editFile(name,contents);
                    }   
            break;

            case 2 : //edit an existing file
            System.out.print("Enter the file name: ");
            String nam = br.readLine();
            System.out.println("Now you can proceed to enter th information that you want to place inside the file:-");
            String info = br.readLine();
            editFile(nam, info);
            break;

            case 3 : //encyrpt a file and generate the key
            break; 

            case 4 : //decrypt a file and copy the contents in a new file
            break;
        }
    }
}
