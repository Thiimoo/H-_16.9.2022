import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EratosthenesPrimeSieve {

    private static int max = 0;
    private static List<Integer> primNumbers = new ArrayList<>();
    
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("hello world");
        System.out.println("geben sie den höchstwert ein bis zu welchem sie primzahlen berechnen wollen:");
        max = s.nextInt();
        printNumbers(max);

    }

    public static void printNumbers(int max)
    {
        for (int i = 2;i<max;i++)
        {
            System.out.print(i+"  ");
            if(i%10==0)
            {
                System.out.println("\n");
            }
        }
        System.out.println(max);
    }



}
