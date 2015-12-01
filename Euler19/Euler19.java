public class Euler19

{
    public static void main (String arms [])
    {
        int year=1901;
        int tDay =0;
        while (year!=2000)
        {
            int month =1;
            while(month<=12)
            {
                int day =1;
                
                 if (month == 2)
                {
                    int monthL=28;
                    
                } 
                else if (month == 4||month ==9 || month ==11|month == 6)
                {
                    int monthL=30;
                } 
                else 
                {
                   int monthL=31;
                
                }

                if(day!=31)
                {
                    day++;
                    tDay++;
                }
                month++;
            }
            year++;
        }
        System.out.println(tDay);
    }
}

