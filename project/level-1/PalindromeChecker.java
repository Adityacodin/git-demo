import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

class PalindromeChecker{
    static boolean phraseornot(String s){
        Pattern pattern = Pattern.compile("\u0020");
        Matcher matches = pattern.matcher(s);
        return matches.find();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String sent = scan.readLine();
        //System.out.println(sent);
        boolean phrase = phraseornot(sent);
        if(phrase){
           
        }
        else{
            boolean flag=false;
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
        }
        
    }
}