public class Euler19

{
    public static void main (String arms [])
    {
        int year=1901;
        int tDay =0;
        int sundays =0;
        while (year!=2000)
        {
            int month =1;
            while(month<=12)
            {
                int day =1;
                int monthL=31;
                if (month == 2)
                {
                    int k= year%4;
                    if (k==0)
                    {
                        monthL=29;
                    }
                    else
                    {
                        monthL=28;
                    }

                } 
                else if (month == 4||month ==9 || month ==11|month == 6)
                {
                    monthL=30;
                } 

                while(day<monthL)
                {
                    tDay++;
                    int monday = tDay&7;
                    if (monday==0 && day==1)
                    {
                        sundays++;

                    }
                    day++;

           
                }
                System.out.println(year + "\t"+ month +"\t" + day + "\t"+sundays);
                month++;
            }
            year++;

        }
        System.out.println(tDay);
    }
}

