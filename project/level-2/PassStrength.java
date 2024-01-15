import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PassStrength extends PasswordGenerator{

    static short StrengthCount = 10;
    
    static boolean checkSmallAlphabets(String pass){
        Pattern Alpha = Pattern.compile("[a-z]");
        Matcher match = Alpha.matcher(pass);
        return match.find();
    }

    static boolean checkBigAlphabets(String pass){
        Pattern Alpha = Pattern.compile("[A-Z]");
        Matcher match = Alpha.matcher(pass);
        return match.find();
    }

    static boolean checkNumeric(String pass){
        Pattern Alpha = Pattern.compile("[0-9]");
        Matcher match = Alpha.matcher(pass);
        return match.find();
    }

    static boolean CheckSpecChar(String pass){
        Pattern Alpha = Pattern.compile("[!@#$%^&*_]"); 
        Matcher match = Alpha.matcher(pass);
        return match.find();
    }
    public static void main(String[] args)throws IOException{
        System.out.println("\t\t\t\tPASSWORD STRENGTH CHECKER");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("This is a Password Strength Analyser. The sole reason of this application program\n is to make sure that each individual's cloud data remains safe by ensuring that \nyour passwords are not easily decoded by any decoding algorithm easily");
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println();
        System.out.print("Please Enter your Password :");
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String passcode = bf.readLine();
        System.out.println();
        int lengthOfPass = passcode.length();
        System.out.println("ROUND-1 -> ANALYSING THE PASSWORD");
        System.out.println();
        System.out.println("Length of the password -> " + lengthOfPass + " digits");
        if(checkSmallAlphabets(passcode)){
            System.out.println("Lower-Case alphabets -> PRESENT");
            ;
        }
        else{
            System.out.println("Lower-Case alphabets -> ABSENT");
            StrengthCount -= 1;
        }
        if(checkBigAlphabets(passcode)){
            System.out.println("Upper-Case alphabets -> PRESENT");
            
        }
        else{
            System.out.println("Upper-Case alphabets -> ABSENT");
            StrengthCount -= 2;
        }
        if(checkNumeric(passcode)){
            System.out.println("Numerical digits -> PRESENT");
            
        }
        else{
            System.out.println("Numerical digits -> ABSENT");
            StrengthCount -= 2;
        }
        if(CheckSpecChar(passcode)){
            System.out.println("Special Characters -> PRESENT");
        }
        else{
            System.out.println("Special Characters -> ABSENT");
            StrengthCount -= 2;
        }
        System.out.println();
        System.out.println("ROUND-2 -> CHECKING THE PASSWORD FOR REPEATEDLY OCCURING CHARACTERS");
        System.out.println();
        HashSet<Character> Char = new HashSet<>();
        for(int i=0; i<lengthOfPass-1; i++){
            for(int j=i+1; j<lengthOfPass; j++){
                if(passcode.charAt(i) == (passcode.charAt(j))){
                    Char.add(passcode.charAt(i));
                }
            }
        }
        if(!Char.isEmpty()){
            if(Char.size()==1){
            System.out.println("The Character "+Char+" Occured more than once");
            System.out.println();
            StrengthCount -= 1;
            }
            else{
                System.out.println("The Characters "+Char+" Occured more than once");
                System.out.println();
                StrengthCount -= 2 ;
            }
        }
        else{
            System.out.println("Repeatedly occuring characters not found");
            System.out.println();
            
        }
        
        System.out.println("Password Strength : " + StrengthCount + " out of 10");
        String decision = null;
        if(StrengthCount <= 4){
            decision = "POOR";
        }else if(StrengthCount>=5 && StrengthCount<7){
            decision = "MODERATE";
        }
        else{
            decision = "Strong";
        }
        System.out.println("Passsword Quality : "+decision);
        
        System.out.println("Suggestions ->");
        boolean[] responses = {true,true,true,true};
        String pas = getPass(lengthOfPass, responses);
        System.out.println("1. "+ pas);
        System.out.println("2. "+ getPass(lengthOfPass, responses));
        System.out.println("3. "+ getPass(lengthOfPass, responses));
        System.out.println("4. "+ getPass(lengthOfPass, responses));
        System.out.println("5. "+ getPass(lengthOfPass, responses));

    }
}
