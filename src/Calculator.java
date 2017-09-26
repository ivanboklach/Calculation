/**
 * Created by macbook on 26.07.17.
 */
import java.io.IOException;


public class Calculator {

    public static void main(String[] args) throws IOException {
        do {
            String[] expressionArgs = readOperation();
            Double result = new Operations().getResultNumber(expressionArgs);
            if (result != null) System.out.println(result);

        } while (repeat());
        new Console().console().close();
    }

    static String[] readOperation() throws IOException {
        System.out.print("Введите ваш пример через пробел: ");
        String expression = read();
        return expression.split("\\s+");
    }

    static boolean repeat() throws IOException {
        System.out.println("Продолжить работу? ( да / нет )");
        String nextOperation = read();
        return ("да").equals(nextOperation);
    }

    private static String read() throws IOException {
        return new Console().console().readLine();
    }
}


