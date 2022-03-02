public class FunWith2DArrays
{
    public static int totalElements(int[][] ints)
    {
        int count = 0;
        for(int[] row : ints)
        {
            for (int column : row)
            {
                count++;
            }
        }
        return count;
    }

    public static void fourCorners(String[][] strings)
    {
        String corner1 = strings[0][0];
        String corner2 = strings[0][strings[0].length - 1];
        String corner3 = strings[strings.length - 1][0];
        String corner4 = strings[strings.length - 1][strings[0].length - 1];
        System.out.println(corner1);
        System.out.println(corner2);
        System.out.println(corner3);
        System.out.println(corner4);
    }
}
