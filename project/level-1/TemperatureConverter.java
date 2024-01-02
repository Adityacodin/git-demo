import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TemperatureConverter{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE TEMPERATURE: ");
        float temp = sc.nextFloat();
        System.out.print("ENTER THE UNIT OF MEASUREMENT OF THE ABOVE MENTIONED TEMPERATURE: ");
        String Unit = sc.next();
        Pattern pattern = Pattern.compile("celsius",Pattern.CASE_INSENSITIVE);
        Matcher match = pattern.matcher(Unit);
        boolean IsCel = match.find();
        boolean IsFahr=false;
        sc.close();
        //System.out.print(IsCel);
        if(!IsCel){
            Pattern pattern2 = Pattern.compile("fahrenheit",Pattern.CASE_INSENSITIVE);
            Matcher match2 = pattern2.matcher(Unit);
            IsFahr = match2.find();
            //System.out.print(IsFahr);
        }
        if(IsCel){
            System.out.println("CONVERTING TO FAHRENHEIT..............");
            float FahrUnit = (temp * 9/5)+32;
            System.out.println("TEMPERATURE IN FAHRENHEIT: " + FahrUnit+"\u00b0F");
        }
        else if(IsFahr){
            System.out.println("CONVERTING TO CELSIUS.................");
            float CelUnit = ((temp-32)*5)/9;
            System.out.println("TEMPERATURE IN CELSIUS: " + CelUnit + "\u00b0C");
        }
    }
}