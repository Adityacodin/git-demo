import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;
import java.util.StringJoiner;

class PalindromeChecker{
    static boolean phraseornot(String s){
        Pattern pattern = Pattern.compile("\u0020");
        Matcher matches = pattern.matcher(s);
        return matches.find();
    }

    static String removeSpaces(String s){
        String[] withoutSpaces = s.split("[ ]");
       // System.out.println(withoutSpaces[0]+withoutSpaces[1]);
        //String nospace = withoutSpaces.toString();
        //System.out.println(returnable);
        StringJoiner joiner = new StringJoiner("");
        for(int i=0; i<withoutSpaces.length; i++){
            joiner.add(withoutSpaces[i]);
        }
        String str = joiner.toString();
        return str;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word/phrase :-");
        String sent = scan.readLine();
        //System.out.println(sent);
        boolean phrase = phraseornot(sent);
        boolean flag = false;
        if(phrase){
            String nee = removeSpaces(sent);           
            //System.out.println(nee);
            for(int i=0; i<nee.length()/2; i++){
              if(nee.charAt(i) == nee.charAt((nee.length()-1)-i))
                flag = true;
              else{
                flag = false;
                break;
              }
            }
            if(flag){
                System.out.println("THE GIVEN PHRASE \u00AB  "+sent+"  \u00BB IS PALINDROME");
            }
            else{
                System.out.println("THE GIVEN PHRASE \u00AB  "+sent+"  \u00BB IS NOT PALINDROME");
            }
        }
        else{
            for(int i=0 ; i<sent.length()/2; i++){
              if(sent.charAt(i) == sent.charAt((sent.length()-1)-i)){
                 flag = true;
              }
              else {
              flag = false;
              break;
              }
            }
            //System.out.println(flag);
            if(flag){
                System.out.println("THE GIVEN WORD \u00AB  "+sent+"  \u00BB IS PALINDROME");
            }
            else{
                System.out.println("THE GIVEN WORD \u00AB  "+sent+"  \u00BB IS NOT");
            }
        }
        
    }
}