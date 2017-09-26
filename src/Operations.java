import operations.Addition;
import operations.Division;
import operations.Multiplication;
import operations.Subtraction;

import java.io.IOException;

/**
 * Created by macbook on 24.09.17.
 */
public class Operations {
    Double getResultNumber(String[] expressionArgs) throws IOException {
        if (expressionArgs.length == 3) {
            double num1 = Integer.parseInt(expressionArgs[0]);
            String markOperation = String.valueOf(expressionArgs[1]);
            double num2 = Integer.parseInt(expressionArgs[2]);
            return operations(num1, markOperation, num2);
        } else {
            System.out.println("Введи пример через пробел!");
        }
        return null;
    }

    private Double operations(Double num1, String markOperation, Double num2) {
        switch (markOperation) {
            case "+":
                return Addition.getCalculationResult(num1, num2);
            case "-":
                return Subtraction.getCalculationResult(num1, num2);
            case "*":
                return Multiplication.getCalculationResult(num1, num2);
            case "/":
                if (num2 != 0) {
                    return Division.getCalculationResult(num1, num2);
                } else {
                    System.out.println("Делить на 0 нельзя!");
                }
                break;
            default:
                System.out.println("Неверная операция!");
                break;
        }
        return null;
    }
}
