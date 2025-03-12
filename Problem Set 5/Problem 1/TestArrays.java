public class TestArrays {
    public static void printArray(int[] array) {
        System.out.print('<');
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if ((i + 1) < array.length) {
                System.out.print(", ");
            }
        }
        System.out.print('>');
    }

    public static void main(String[] args) {
        int[] array1 = { 2, 3, 5, 7, 11, 13, 17, 19 };
        int[] array2 = array1;

        for(int i = 0; i<array1.length; i++)
        {
            if(i % 2 == 0)
                array2[i] = i;
            else
                array2[i] = array1[i];
        }
        
        printArray(array1);
        System.out.println();
        printArray(array2);
        System.out.println();
        
        int[][] matrix = new int[5][];

        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = new int[i];
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * j;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            System.out.print("matrix[" + i + "] is <");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                if (j < matrix[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(">");
        }
        
    }
    
    
}
