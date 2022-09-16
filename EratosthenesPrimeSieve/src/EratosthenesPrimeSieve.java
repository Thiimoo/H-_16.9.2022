import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EratosthenesPrimeSieve implements PrimeSieve{

    private static int max = 0;
    private static List<Integer> primNumbers = new ArrayList<>();
    private static boolean[] prüfeArrayPrimzahlen = new boolean[max];
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("hello world");
        System.out.println("geben sie den höchstwert ein bis zu welchem sie primzahlen berechnen wollen:");
        max = s.nextInt();
        printNumbers(max);
        markPrimzahl();
        printPrimnumbers();
    }

    public EratosthenesPrimeSieve(int max)
    {
        this.max = max;
    }

    public static void markPrimzahl()
    {
        prüfeArrayPrimzahlen = new boolean[max + 1];
        for(int i = 2; i <= max; i++)
        {
            if (prüfeArrayPrimzahlen[i] == false) {
                calcVielfache(i);
            }
        }

    }

    public static void calcVielfache(int p)
    {
        primNumbers.add(p);
        for (int i1 = 0;i1<=max; i1++)
        {
            if (i1%p==0)
            {
                prüfeArrayPrimzahlen[i1] = true;
            }
        }
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

    @Override
    public boolean isPrime(int p) {
        if(p < 2) {
            return false;
        }
        for(int i = 2; i < p; i++) {
            if(p % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimnumbers()
    {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Primzahlen: ");

        for (int i : primNumbers)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");

    }

    @Override
    public void printPrimes() {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Primzahlen: ");

        for (int i : primNumbers)
        {
            System.out.print(i+" ");
        }
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }
}
