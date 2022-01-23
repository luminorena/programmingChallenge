import java.io.IOException;
import java.util.Random;
public class randomGenerator {
    public enum type {
        NUMBER("число"),
        STRING("строка"),
        ARRAY("массив");
        private final String title;

        type(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString() {
            return title;
        }
    }

    public static int getRandomNumber(int from, int to) {
        return (int) (Math.random() * (from - to)) + to;
    }

    public static void numberCalc(int from, int to) {
        int x = getRandomNumber(from, to);
        System.out.print(x + " ");
    }

    public static void arrayCalc(int to) {
        for (int i = 0; i < to; i++) {
            int x = (int) (Math.random() * (100));
            System.out.print(x + " ");
        }
    }

    public static String getRandomString(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws IOException {
        try {
            getInput.input();
        } catch (BadParamException e) {
            System.out.print(e.getMessage());
        }
    }
}
