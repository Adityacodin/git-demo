import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// import java.math.RoundingMode;
import java.text.DecimalFormat;

class GradeCalculator{

    private static final DecimalFormat df = new DecimalFormat("0.00");
    static String getGrade(float percentage){
        if(percentage >= 85.0F)
          return "A+";
        else if(percentage >= 80.0F)
          return "A";
        else if(percentage >= 75.0F)
          return "B+";
        else if(percentage >= 70.0F)
          return "B";
        else if(percentage >= 65.0F)
          return "B-";
        else if(percentage >= 60.0F)
          return "C+";
        else if(percentage >=55.0F)
          return "C";
        else if(percentage >=50.0F)
          return "C-";
        else if(percentage >=45.0F)
          return "D";
        else if(percentage >= 40.0F)
          return "D";
        else 
          return "F";

      }
    static void printPerSgpGra(int total,int sum){
        //System.out.println(sum + " " + total);
        float per = ((float)sum/(float)total)*100F;
        System.out.println("PERCENTAGE: "+per);
        float sgpa = per/9.3F;
        System.out.println("SGPA SCORE: "+ df.format(sgpa));
        // System.out.println(per);
        // return per;
        String grade = getGrade(per);
        System.out.println("GRADE: "+grade);
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\t\t\tSTUDENT GRADE CALCULATOR\t\t\t\n");
        System.out.print("Enter the no. of theory subjects in your curriculm: ");
        final int theorySub = Integer.parseInt(scan.readLine());
        System.out.print("Enter the maximum marks for evaluation: ");
        final int TheoMax = Integer.parseInt(scan.readLine());
        final int Totalmarks = TheoMax*theorySub;
        System.out.println("Now pls proceed to enter the name of subjects one by one:");
        String[] subName = new String[theorySub];
        for(int i=1; i<=theorySub; i++){
            subName[i-1] = scan.readLine();
        }
        System.out.println("Subject log succecsful..........");
        System.out.println("Now proceed to enter the marks one by one");
        int[] marks = new int[theorySub];
        for(int i=0; i<theorySub; i++){
            System.out.print("Marks you got in " + subName[i].toUpperCase() + " out of " + TheoMax+" :");
            marks[i] = Integer.parseInt(scan.readLine());
            if(marks[i] > TheoMax){
                System.out.println("Processed stopped...Enter correct marks again ");
                System.exit(0);
            }
        }
        System.out.println("Marks log succesfull");
        int sum = 0;
        for (int mark : marks) {
          sum += mark;
        }
        System.out.println("TOTAL MARKS SCORED : " + sum+"/"+Totalmarks);
        printPerSgpGra(Totalmarks,sum);
        System.out.println("AVERAGE MARKS SCORED : " + (sum/theorySub) + " out of "+ TheoMax);        
    }
}