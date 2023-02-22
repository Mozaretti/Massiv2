import java.util.Arrays;

public class Main
    {public static void main(String[] args){
    task1();
    task2();
}
     public static int[] generateRandomArray() {
            java.util.Random random = new java.util.Random();
            int[] arr = new int[30];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100_000) + 100_000;
            }
            return arr;}
     public static void task1() {
        int[] arr = generateRandomArray();
         System.out.println(Arrays.toString(arr));
        int sum = 0;
         for (int i = 0; i < arr.length; i++) {
             sum = sum + arr[i];
         }
         System.out.println("Сумма трат за месяц составила " +sum+ " рублей");
         System.out.println();
    }
    public static void task2(){
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        int max = arr[0];
        for (int number : arr){
            if (number < min){
                min = number;
            }
            if (number > max){
                max = number;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + min + " рублей.");
        System.out.println("Максимальная сумма трат за день составила " + max + " рублей.");
    }

}