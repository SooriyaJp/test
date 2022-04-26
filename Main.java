import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Sooriya got placed in TCS Digital");
        Scanner sc=new Scanner(System.in);
        System.out.println("If You want Briyani?");
        String s=sc.next();
        if(s.equalsIgnoreCase("yes"))
        {
            System.out.println("Eat Briyani");
        }
        else
        {
            System.out.println("Eat sambar rice");
        }
    }

}