import java.util.ArrayList;
import java.math.BigInteger;
public class Solution
{
    public static void main(String [] args) {
        ArrayList<BigInteger> distinctTerms = new ArrayList<BigInteger>();
        BigInteger temp;
        for(int i = 2; i <= 100; i++) {
            for(int j = 2; j <= 100; j++) {
                temp = BigInteger.valueOf(i).pow(j);
                if(!distinctTerms.contains(temp)) {
                    distinctTerms.add(temp);
                }
            }
        }
        System.out.println("Number of distinct terms: " + distinctTerms.size());
    }
}