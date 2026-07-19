import java.util.Scanner;
public class Medal{
    public static void main(String [] args){
        boolean isStudent=true;

        if(isStudent) {
            Scanner sc=new Scanner(System.in);
            double grade=sc.nextDouble();
            if(grade>=3.5){
                System.out.println("Student should receive a medal");
            }
            else{
                System.out.println("Student shouldn't receive a medal");
            }

        }
        else{
            System.out.println("Person is not a student");
        }
    }
}
