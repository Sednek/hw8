package homework;

public class hw {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1(){
        System.out.println("Task 1: ");
        int [] arr = generateRandomArray();
        int sum = 0;

        for (int elem : arr) {
            sum = sum + elem;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");

        System.out.println(" ");
    }
    public static void task2(){
        System.out.println("Task 2: ");
        int [] arr = generateRandomArray();
        int min = 200000;
        int max = -1;

        for (int elem:arr) {
            if (elem > max){
                max = elem;
            }
        }
        for (int elem:arr) {
            if (elem < min){
                min = elem;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей.");

        System.out.println(" ");
    }
    public static void task3(){
        System.out.println("Task 3: ");
        int [] arr = generateRandomArray();
        var median = 0d;
        double sum = 0;

        for (int elem: arr){
            sum = sum + elem;
        }
        median = sum / 30;

        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", median);

        System.out.println(" ");
    }
    public static void task4(){
        System.out.println("Task 4: ");
        char [] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.printf("%c", reverseFullName[i]);
        }

        System.out.println(" ");
    }
}
