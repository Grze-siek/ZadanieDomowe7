import java.util.Arrays;

public class PalindromArray {
    public static void main(String[] args) {
        int[] array = {3,5,7,5,3};
        System.out.println(Arrays.toString(array));
        System.out.println("Czy to palidrom? " + PalindromArray.isItPalindrom(array));
    }
    public static boolean isItPalindrom(int[] tablica)
    {
        for (int index = 0; index <= tablica.length/2 - 1; index++) {
            if(tablica[index] != tablica[tablica.length - index - 1]) {
                return false;
            }
        }
        return true;
    }
}
