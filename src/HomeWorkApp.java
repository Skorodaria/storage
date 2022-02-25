public class HomeWorkApp {
    public static void main(String[] agrs) {
        Main2();
        printThreeWords();
        printColor();
        checkSumSign();
        compareNumbers();
    }


        public static void Main2() {
        System.out.println("I love samoyeds");

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void printColor() {
        int value = 149;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
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

    public static void compareNumbers() {
        int a = 6;
        int b = 152;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}


