public class Task2 {
    public static void main(String args[]) {
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 & i % 5 != 0 & ((i % 10) + (i / 100) + ((i % 100) / 10)) < 10) {
                System.out.print(i + " ");
            }

        }
    }
}
