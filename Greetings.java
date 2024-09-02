import java.util.Date;

public class Greetings
{
    public static void main(String[] args) {
        System.out.println("My second program in GIT");
        System.out.println("This program greets you according to the time");
        Date d = new Date();
        int hours = d.getHours();
        System.out.println("the hours is "+hours);
        if(hours<12)
        {
            System.out.println("Good morning....");

        }
        else if(hours<16)
        {System.out.println("Good Afternoon ....");}
        else if(hours<19)
        {
            System.out.println("Good evening ....");;
        }
        else
        {
            System.out.println("Good Night ....");
        }
    }
}