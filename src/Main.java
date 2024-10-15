public class Main {
    public static void main(String[] args) {

        int f0 = 1;
        int f1 = 1;
        int sum = f0 + f1;

        while (true) {
            int next = f0+f1;
            if (f1 > 1000) {
                break;
            }
            sum += next;

            f0 = f1;
            f1 = next;
        }

        System.out.println(sum);
    }
    }



