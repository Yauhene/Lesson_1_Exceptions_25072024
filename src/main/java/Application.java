import java.io.*;

public class Application {
    public static void main(String[] args) {
//        System.out.print(getFileSize(new File("123")));
//        System.out.print(getFileSize(new File("D:/Java II/Исключения/Уроки/Урок 1. Обработка ошибок в программировании/TestFile.txt")));
//        System.out.println(" байт");

//        System.out.println(divide(30, 10));


    }

    public static void a() {

    }

    public static void b() {

    }

    public static void c() {
        int ints[] = new int[10];
        System.out.println(ints[1000]);
    }
// ==  Пример полной лажи, работать будет, но может вернуть -1 и как результат, и как код ошибки
//    public static int divide(int a1, int a2) {
//        if (a2 == 0) {
//            return -1;
//        }
//        return a1 / a2;
//    }
// ==

// === лажа-отсебятина, тупо поиграться
//    public static String divide(int a1, int a2) {
//        int result;
//        String strResult = "";
//        try {
//            result = a1/a2;
//            strResult = String.valueOf(result);
//        } catch (ArithmeticException e) {
//            System.out.println("Косяк, однако, делим на ноль, паршивец !!! Кажучы на сакавiтай аглiцкай мове, " + e.getMessage());;
//        }
//        return strResult;
//    }
// ===



    public static long getFileSize(File file) {
        if (!file.exists()) {
            return -1L;
        }

        return file.length();
    }

}
