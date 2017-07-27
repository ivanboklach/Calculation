/**
 * Created by macbook on 27.07.17.
 */
public class Oper {
    public double addition (double x , double y){
        return x+y;
    }
    public double substraction (double x, double y) {
        return x-y;
    }
    public  double division (double x, double y){
        return x/y;
    }
    public double multiplication (double x, double y)
    {
        return x*y;
    }
    public Double action (double x , double y , String operator) {
        switch (operator) {
            case "+":
                return this.addition(x, y);
            case "-":
                return this.substraction(x, y);
            case "*":
                return this.multiplication(x, y);
            case "/":
                if (y != 0) {
                    return this.division(x, y);
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

