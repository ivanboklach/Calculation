import java.util.Scanner;




public class CalculatorRunner extends Calc{
    public static void main(String arg[]) {
        Oper myCalc = new Oper();
        Double result = 0.0;

        do {
            Scanner calcScan = new Scanner(System.in);
            System.out.println("Введите пример. Например 2+2");

            if (calcScan.findInLine("(-?\\d+\\.?\\d*)?\\s*(\\S)\\s*(-?\\d+\\.?\\d*)")
                    != null) {

                if (calcScan.match().group(1) != null) {
                    Double first = Double.parseDouble(calcScan.match().group(1));
                    Double second = Double.parseDouble(calcScan.match().group(3));
                    result = myCalc.action(first, second, calcScan.match().group(2));

                } else {
                    Double second = Double.parseDouble(calcScan.match().group(3));
                    result = myCalc.action(result, second, calcScan.match().group(2));

                }
                System.out.println(result);

            } else {
                System.out.println("Неверный ввод");
            }

        } while (true);
    }

}

