import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class getInput {
    public static void input() throws IOException, BadParamException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число от: ");
        String a = reader.readLine();
        int from = Integer.parseInt(a);
        if (from < 0)
            throw new BadParamException("Введённое число меньше нуля ", from);
        System.out.println("Введите число до: ");
        String b = reader.readLine();
        int to = Integer.parseInt(b);
        if (to < 0)
            throw new BadParamException("Введённое число меньше нуля ", to);
        if (from > to) {
            int temp = from;
            from = to;
            to = temp;
            System.out.println("Вы ввели ОТ больше ДО. Значения поменяны местами");
            System.out.println("ОТ = " + from);
            System.out.println("ДО = " + to);
        }
        System.out.println("Выберите тип генератора случайных данных: ");
        randomGenerator.type[] types = randomGenerator.type.values();
        for (randomGenerator.type s : types) {
            System.out.println(s);
        }
        String d = reader.readLine();
        for (randomGenerator.type s : types) {
            if (s.getTitle().equals(d) && s.ordinal() == 0) {
                System.out.println("Число не больше " + to + " и не меньше " + from);
                randomGenerator.numberCalc(from, to);
            } else if (s.getTitle().equals(d) && s.ordinal() == 1) {
                System.out.println("Строка не больше " + to + " и не меньше " + from);
                System.out.println(randomGenerator.getRandomString(to));
            } else if (s.getTitle().equals(d) && s.ordinal() == 2) {
                System.out.println("Массив, в котором чисел не больше " + to + " и не меньше " + from);
                randomGenerator.arrayCalc(to);
            }
        }
    }
}
