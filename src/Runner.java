import java.util.Arrays;

public class Runner
{
    public static void main(String[] args)
    {
        String[][] seatingChart = {
                {"Abby", "Don", "George", "Kim"},
                {"Brian", "Elenor", "Harry", "Lenny"},
                {"Cathy", "Fred", "Jill", "Matt"}
        };
        for (String[] row : seatingChart)
        {
            System.out.println(Arrays.toString(row));
        }

        seatingChart[1][2] = "Paul";
        for (String[] row : seatingChart)
        {
            System.out.println(Arrays.toString(row));
        }

        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;
        for (String[] row : seatingChart)
        {
            System.out.println(Arrays.toString(row));
        }

        String[] tempRow = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = tempRow;
        for (String[] row : seatingChart)
        {
            System.out.println(Arrays.toString(row));
        }

        System.out.println(seatingChart[0][2] + seatingChart[2][0]);

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];
        for (int[] row : arr1)
        {
            System.out.println(Arrays.toString(row));
        }
        for (int[] row : arr2)
        {
            System.out.println(Arrays.toString(row));
        }

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;
        for (int[] row : arr1)
        {
            System.out.println(Arrays.toString(row));
        }
        arr2[0][0] = 1;
        arr2[1][0] = 2;
        arr2[2][0] = 3;
        arr2[0][1] = 4;
        arr2[1][1] = 5;
        arr2[2][1] = 6;
        for (int[] row : arr2)
        {
            System.out.println(Arrays.toString(row));
        }

        System.out.println(arr1[0][2] + arr2[2][0]);

        int[][] array1 = {
                {5, 2},
                {1, 3},
                {7, 9}
        };
        int[][] array2 = {
                {1, 2, 3},
                {6, 5, 4}
        };
        int[][] array3 = {
                {1, 2, 3, 4},
                {7, 8, 9, 10}
        };
        int[][] array4 = {
                {4, 5, 2},
                {1, 9, 7},
                {8, 10, 13}
        };
        int[][] array5 = {
                {4, 5, 2, 4, 1},
                {1, 9, 7, 8, 2},
                {8, 10, 13, 4, 3}
        };
        int[][] array6 = {
                {4, 5, 2, 4, 8, 9, 10},
                {1, 9, 7, 8, 6, 1, 2}
        };
        int[][] array7 = {
                {4},
                {7},
                {8},
                {2}
        };
        int[][] array8 = {
                {4}
        };
        int[][] array9 = {
                {}
        };
        System.out.println(FunWith2DArrays.totalElements(array1));
        System.out.println(FunWith2DArrays.totalElements(array2));
        System.out.println(FunWith2DArrays.totalElements(array3));
        System.out.println(FunWith2DArrays.totalElements(array4));
        System.out.println(FunWith2DArrays.totalElements(array5));
        System.out.println(FunWith2DArrays.totalElements(array6));
        System.out.println(FunWith2DArrays.totalElements(array7));
        System.out.println(FunWith2DArrays.totalElements(array8));
        System.out.println(FunWith2DArrays.totalElements(array9));

        String[][] stringArr1 = {
                {"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}
        };
        String[][] stringArr2 = {
                {"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}
        };
        String[][] stringArr3 = {
                {"phone", "mouse", "keyboard"}
        };
        String[][] stringArr4 = {
                {"cat"},
                {"dog"},
                {"hamster"},
                {"bird"}
        };
        String[][] stringArr5 = {
                {"time"}
        };
        FunWith2DArrays.fourCorners(stringArr1);
        FunWith2DArrays.fourCorners(stringArr2);
        FunWith2DArrays.fourCorners(stringArr3);
        FunWith2DArrays.fourCorners(stringArr4);
        FunWith2DArrays.fourCorners(stringArr5);
    }
}
