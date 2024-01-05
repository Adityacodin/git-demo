import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.util.Random;


class PasswordGenerator{

    static String getPass(int length,boolean responses[]){
        String allstr=null;
        if(responses[0]){
            allstr = "0123456789";
        }
        if(responses[1]){
            allstr = allstr + "abcdefghijklmnopqrstuvwxyz";
        }
        if(responses[2]){
            allstr = allstr + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if(responses[3]){
            allstr = allstr + "#@!$%&*";
        }

        StringBuilder sbu = new StringBuilder(length);

        for(int i=0; i<length; i++){
            int index =(int)(allstr.length() * Math.random());
            sbu.append(allstr.charAt(index));
        }
        return sbu.toString();
    }
    public static void main(String[] args) throws NumberFormatException, IOException{
        System.out.println("\t\t\tPASSWORD GENERATOR\t\t\t");
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        Pattern pos = Pattern.compile("yes",Pattern.CASE_INSENSITIVE);
        // Pattern neg = Pattern.compile("no", Pattern.CASE_INSENSITIVE);
        System.out.print("Enter the length you want for your passwords(No. of Characters): ");
        int lengthofPass = Integer.parseInt(sc.readLine());
        Matcher posresp;
        // Matcher negresp;
        String res[] = new String[4];
        System.out.print("Should the password contain numbers (YES/NO): ");
        res[0] = sc.readLine();
        System.out.print("Should the password contain lowercase lettes (YES/NO): ");
        res[1] = sc.readLine();
        System.out.print("Should the password contain UPPERCASE LETTERS (YES/NO): ");
        res[2] = sc.readLine();
        System.out.print("Should the password contain Special characters such as (YES/NO): ");
        res[3] = sc.readLine();
        boolean[] responses = new boolean[4];
        for(int i = 0; i<4 ; i++){
            posresp = pos.matcher(res[i]);
            responses[i] = posresp.find();
            // System.out.println(responses[i]);
        }
        String GenPass = getPass(lengthofPass, responses);
        System.out.println("PASSWORD GENERATED SUCCESSFULLY.......");
        System.out.println("PASSWORD: "+ GenPass);
    }
}