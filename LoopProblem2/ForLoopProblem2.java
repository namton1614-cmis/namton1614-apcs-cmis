/*
This won't compile! Why not?
*/
/*
Answer: There should not be a semicolon after the for declaration.

*/
public class ForLoopProblem2
{
    public static void main ( String argv[] )
    {
        for ( int i = 1; i < 20; i++ )
        {
            System.out.println(i);
        }
    }
}

