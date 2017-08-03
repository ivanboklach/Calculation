import Operation.Addition;
import Operation.Division;
import Operation.Multiplication;
import Operation.Substraction;

private class Oper {

    private Double action (double x , double y , String operator) {
        switch (operator) {
            case "+":
                return Addition.calculationResult();
            case "-":
                return Substraction.calculationResult();
            case "*":
                return Multiplication.calculationResult();
            case "/":
                if (y != 0) {
                    return Division.calculationResult();
                } else {
                    System.out.println("Делить на 0 нельзя!");
                }
                break;
            default:
                System.out.println("Неверное действие, попробуйте еще раз");
                break;
        }
        return null;

    }

    }

