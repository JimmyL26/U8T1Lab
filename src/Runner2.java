import java.util.Arrays;

public class Runner2
{
    public static void main(String[] args)
    {
//        System.out.println("PROBLEM 1:");
//
//        int[][] testArr1 = {{1, 2}, {3, 4}, {5, 6}};
//        // write code below that uses nested INDEX-BASED for loops
//        // to print each element in testArr1 in ROW-MAJOR order; i.e. 1, 2, 3, 4, 5, 6
//
//        /* WRITE CODE HERE! */
//        for (int i = 0; i < testArr1.length; i++)
//        {
//            for (int j = 0; j < testArr1[i].length; j++)
//            {
//                System.out.println(testArr1[i][j]);
//            }
//        }
//
//        System.out.println("---------");
//        // now, write code below that uses nested ENHANCED for loops
//        // to print each element in testArr1 in row-major order AGAIN; i.e. 1, 2, 3, 4, 5, 6
//
//        /* WRITE CODE HERE! */
//        for (int[] row : testArr1)
//        {
//            for (int column : row)
//            {
//                System.out.println(column);
//            }
//        }
//
//        System.out.println("---------");
//        // lastly, write code below that uses nested INDEX-BASED for loops
//        // to print each element in testArr1 in COLUMN-MAJOR order; i.e. 1, 3, 5, 2, 4, 6
//
//        /* WRITE CODE HERE! */
//        for (int i = 0; i < testArr1[0].length; i++)
//        {
//            for (int j = 0; j < testArr1.length; j++)
//            {
//                System.out.println(testArr1[j][i]);
//            }
//        }
//
//        /* --- PROBLEM 2 --- */
//        System.out.println("---------");
//        System.out.println("PROBLEM 2:");
//
//        String[][] testArr2 = {{"ant", "bird", "camel"}, {"dog", "elephant", "fish"}};
//        // write code below using a nested ENHANCED for loop to print each element in
//        // testArr2 in ROW-MAJOR order; i.e. ant, bird, camel, dog, elephant, fish
//
//        /* WRITE CODE HERE! */
//        for (String[] row : testArr2)
//        {
//            for (String column : row)
//            {
//                System.out.println(column);
//            }
//        }
//
//        System.out.println("---------");
//        // write code below using an INDEX-BASED nested for loop to print each element in
//        // testArr2 in COLUMN-MAJOR order; i.e. ant, dog, bird, elephant, camel, fish
//
//        /* WRITE CODE HERE! */
//        for (int i = 0; i < testArr2[0].length; i++)
//        {
//            for (int j = 0; j < testArr2.length; j++)
//            {
//                System.out.println(testArr2[j][i]);
//            }
//        }

        // TEST CODE FOR average
        int[][] testArr1 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(FunWith2DArrays.average(testArr1));
        int[][] testArr2 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
        System.out.println(FunWith2DArrays.average(testArr2));
        int[][] testArr3 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
        System.out.println(FunWith2DArrays.average(testArr3));
        int[][] testArr4 = {{4}, {7}, {8}, {2}};
        System.out.println(FunWith2DArrays.average(testArr4));
        int[][] testArr5 = {{4}};
        System.out.println(FunWith2DArrays.average(testArr5));

        // TEST CODE FOR indexFound
        String[][] words = {{"hi", "bye", "stuff", "go"}, {"time", "up", "you", "good"}, {"map", "low", "bow", "mom"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "stuff")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "good")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "map")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words, "cat")));
        System.out.println("--------------");

        String[][] words2 = {{"time", "up", "bye"}, {"hi", "hit", "up"}, {"map", "bam", "low"}, {"bow", "mom", "joy"}};
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "time")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "joy")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "bam")));
        System.out.println(Arrays.toString(FunWith2DArrays.indexFound(words2, "cat")));
    }
}
