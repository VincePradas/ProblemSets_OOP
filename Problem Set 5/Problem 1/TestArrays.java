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
        int[] array2 = new int[array1.length];

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
    }
}