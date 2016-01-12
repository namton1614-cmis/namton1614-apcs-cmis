public class Euler50

{
    public static void main (String arms [])
    {
        int prime=1;
        int primeSum=2;
        int primeCheck=0;
        int primeCheck2=0;
        int primePrimeSum=0;
        System.out.println("2");

        while (primeSum<1000000)
        {
            prime+=2;
            primeCheck=1;	
            for(int i = 3; i * i <= prime; i += 2)
            { 
                if (prime % i == 0) 
                {
                    primeCheck=0;
                }
            }

            if (primeCheck==1)
            {
                primeSum+=prime;
                System.out.println(prime);
                primeCheck2=1;	
                for(int i = 3; i * i <= primeSum; i += 2)
                { 
                    if (primeSum % i == 0) 
                    {
                        primeCheck2=0;
                    }
                }

            }
            if (primeCheck2==1 && (primePrimeSum <primeSum))
            {
                primePrimeSum=primeSum;
            }
        }
        System.out.println(primeSum +"    "+primePrimeSum  );
    }

}

