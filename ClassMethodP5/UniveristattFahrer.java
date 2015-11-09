public class UniveristattFahrer {
    public static void main (String argMaster [])
    {

        String school1 = new String ( "MIT" ); 
        String school2 = new String ( "Caltec" ); 
        String school3 = new String ( "Cornell" ); 
        System.out.println( school1.compareTo( school2 )); 
        System.out.println( school2.compareTo( school3 )); 

    }
}
/* 1. It simply displays the integer 10. It seems it is telling the difference in alphabetical
 *    positioning between the first letters of the two strings i.e. M=13, C=3, M-C=10. It subtracts 
 *    the string in the compareTo() from the one outside.
 *    
 * 2. It displays the integer -14. Same thing is happening, however it calculates for the to letters
 *    after the first one as the first one is the same. A=1, O=15, A-O=-14
 *  
 */