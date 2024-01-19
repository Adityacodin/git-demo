import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.lang.Math;

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
        try (FileWriter writes = new FileWriter(filename)) {
            writes.write(Contents);
            System.out.println("Operation successful");
        }
        catch(IOException e){
            System.out.println("error occured try again");
        }
    }

    static String readFile(String filename)throws FileNotFoundException{
        File obj = new File(filename);
        Scanner sc = new Scanner(obj);
        // ArrayList<String> data = new ArrayList<>();
        String dat = new String();
        while(sc.hasNextLine()){
            dat += sc.nextLine();
        }
        sc.close();
        return dat;
    }

    static int getkey(){
        // int a[] = {1,2,3,4,5,6,7,8,9,10};
        final int key = (int)(10 * Math.random()+1);
        return key ;
    }
    static int encryptFile(String FileToEncrypt)throws IOException{
        int key = getkey();
        String preEncode = readFile(FileToEncrypt);
        char[] charConvert = preEncode.toCharArray();
        String sentence = new String();
        for(char c: charConvert){
            c+=key;
            sentence += c;
        }
        editFile(FileToEncrypt, sentence);
        return key;
    }

    
    static void decryptFile(int key, String FileToDecrypt)throws FileNotFoundException,  IOException{
        String decode = readFile(FileToDecrypt);
        char[] codeConvert = decode.toCharArray();
        String sentence = new String();
        for(char c: codeConvert){
            c -= key;
            sentence += c;
        }
        editFile(FileToDecrypt,sentence);
    }
    

    public static void main(String[] args)throws IOException, FileNotFoundException{
        System.out.println("\t\t\t\tFile Encryption/Decryption");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("This program is defined to encrypt or decrypt the contents of a text file.\nThe user can perform both encryption and decryption of a text file by providing\nthe absolute path of the respective text file and the key in case of decryption ");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\tMENU");
        System.out.println("1. Create a file\n2. Edit a file\n3.Encrypt a file\n4.Decrypt the file(key needed)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println();
        System.out.print("Enter your choice: ");
        int choice = Integer.parseInt(br.readLine());
        switch(choice){
            case 1 : //create file
                     System.out.print("Name your File: ");
                     String name = br.readLine();
                    //  String Path = createFile(name);
                     System.out.println("Do you want to edit/write in the file: ");
                     String ans = br.readLine();
                     boolean decision = Pattern.matches("yes", ans.toLowerCase());
                    //  System.out.println(decision);2
                    if(decision){
                        System.out.print("Enter the text you want to add to your text file: ");
                        String contents = br.readLine();
                        editFile(name+".txt",contents);
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
            System.out.print("Please enter name of your .txt file: ");
            String FileToEncrypt = br.readLine();
            int EncryptKey = encryptFile(FileToEncrypt+".txt");
            System.out.println(EncryptKey + " is the key to decrypt the file. Do not share the key.");
            break; 

            case 4 : //decrypt a file and copy the contents in a new file
            System.out.print("Please enter the name of your .txt file: ");
            String FileToDecrypt = br.readLine();
            System.out.println("Enter the key: ");
            int DecryptKey = Integer.parseInt(br.readLine());
            decryptFile(DecryptKey, FileToDecrypt+".txt");
            break;
        }
    }
}
