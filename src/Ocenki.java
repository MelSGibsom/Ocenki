/**
 * Created by Alexander on 14.06.2015.
 */

public class Ocenki {
    public static void main(String args[])
            throws java.io.IOException {
        char choice;
                for (int i = 0; i < 4; i++) {
            System.out.println("Введите букву,получите оценку:");
            System.out.println("A:");
            System.out.println("B:");
            System.out.println("C:");
            System.out.println("D:");
            System.out.println("E:");

            choice = (char) System.in.read();


            switch (choice) {
                case 'a':
                case 'A':
                    System.out.println("Вы получили 5\n");
                    break;
                case 'b':
                case 'B':
                    System.out.println("Вы получили 4\n");
                    break;

                case 'c':
                case 'C':
                    System.out.println("Вы получили 3\n");
                    break;
                case 'd':
                case 'D':
                    System.out.println("\"Вы получили 2\n");
                    break;
                case 'e':
                case 'E':
                    System.out.println("\"Вы получили 1\n");
                    break;
                default:
                    System.out.println("Нет такой оценки:(\n");
                    break;

            }
            System.in.read();
            }



    }
}




