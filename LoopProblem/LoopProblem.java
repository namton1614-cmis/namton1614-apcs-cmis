/*
Question: Why won't this compile? How can it be fixed?
When you know the answer, create a secret gist and send the link to me.
*/
/*
Answer: Using number variables must have a declaration that it is an integer/double/float.

*/
public class LoopProblem
{
    public static void main ( String argv[] )
    {
        for ( int i = 1; i < 20; i++ )
        {
            System.out.println(i);
        }
    }
}