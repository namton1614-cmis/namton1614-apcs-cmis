public class MapDriver
{
    public static void main( String[] args )
    {
        int grid[][] = new int[][] {{0,1,2,3,4},{5,6,7,8,9},{0,1,2,3,4}};
        for ( int y = 0; y < grid.length; y++ )
        {
            for ( int x = 0; x < grid[y].length; x++)
            {
                System.out.print(grid[y][x]);
            }
            System.out.println();
        }
        System.out.println();
        
        
        Map m;
        if (args.length != 0)
        {
            m = new Map(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        }
        else
        {
            m = new Map(10, 10);
        }
        System.out.println(m);
    }
}