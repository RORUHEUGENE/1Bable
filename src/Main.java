// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 31, 53, 16, 24, 57, 42, 74, 55, 36};
        System.out.println(Arrays.toString(array));
        //boolean isSorted = false;
        //while (! isSorted){
        //isSorted = true;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[i - 1];
            array[i - 1] = temp;
            //isSorted = false;
        }
    }
            System.out.println(Arrays.toString(array));
        }

