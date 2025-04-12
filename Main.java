import java.security.Principal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Principal: ");
        Double principle = s.nextDouble();
        System.out.print("Enter Rate: ");
        Double rate = s.nextDouble();
        System.out.print("Enter TimeCompound: ");
        Integer TimeCompound = s.nextInt();
        System.out.print("Enter Year: ");
        Integer year = s.nextInt();

        Double Amount = principle * Math.pow(1 + rate / TimeCompound, TimeCompound*year);

        System.out.println("The Compound Interest of Your Input are "+Amount);
    }
}