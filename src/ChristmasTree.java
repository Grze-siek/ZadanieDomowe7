import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proszę podać liczbę poziomów choinki od 1-20:");
        int number = scanner.nextInt();
        while (number < 1 || number > 20) {
            System.out.println("Proszę wprowadzić cyfrę z przedziału 1-20:");
            number = scanner.nextInt();
        }
        ChristmasTree tree = new ChristmasTree();
        tree.drawChristmasTree(number);
    }

     void drawChristmasTree(int number) {
        int[][] array = new int[number][];
        for (int i = 0; i < number; i++) {
            array[i] = new int[(i + 1) * 2 - 1];
            for (int j = 0; j < (i + 1) * 2 - 1; j++) {
                array[i][j] = 0;
            }
        }
        showChristmasTree(array, number);
    }

     private void showChristmasTree(int[][] array, int number) {
        int k = number;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                while (k > 0) {
                    System.out.print(" ");
                    k--;
                }
                System.out.print(array[i][j]);
            }
            System.out.println();
            k = --number;
        }
    }
}
