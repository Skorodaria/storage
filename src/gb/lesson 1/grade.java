package gb.lesson_1;

public class grade {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {

        int a = 9;
        int b = 7;
        int c = (a + b);

        if (c >= 0) {
            System.out.println("Сумма положительная");
        }
        if (c <= 0) {
            System.out.println("Сумма отрицательная");

        }
        System.out.println("проверка завершена");
    }
}