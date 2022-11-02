import java.util.Scanner;

public class CalcRunner
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String expresion = input.nextLine();

        int divide = expresion.indexOf("/");
        int multiply = expresion.indexOf("*");
        int add = expresion.indexOf("+");
        int subtract = expresion.indexOf("-");
        int mod = expresion.indexOf("%");
        int power = expresion.indexOf("^");


        if (divide > 0)
        {
            String num1 = expresion.substring(0, divide-1);
            String num2 = expresion.substring(divide + 2);
            Calculator x = new Calculator(Double.parseDouble(num1), Double.parseDouble(num2));
            x.toDivide();
        }
        else if (multiply > 0)
        {
            String num1 = expresion.substring(0, multiply-1);
            String num2 = expresion.substring(multiply + 2);
            Calculator x = new Calculator(Double.parseDouble(num1), Double.parseDouble(num2));
            x.toMultiply();
        }
        else if (add > 0)
        {
            String num1 = expresion.substring(0, add-1);
            String num2 = expresion.substring(add + 2);
            Calculator x = new Calculator(Double.parseDouble(num1), Double.parseDouble(num2));
            x.toAdd();
        }
        else if (subtract > 0)
        {
            String num1 = expresion.substring(0, subtract-1);
            String num2 = expresion.substring(subtract + 2);
            Calculator x = new Calculator(Double.parseDouble(num1), Double.parseDouble(num2));
            x.toSubtract();
        }
        else if (mod > 0)
        {
            String num1 = expresion.substring(0, mod-1);
            String num2 = expresion.substring(mod+ 2);
            Calculator x = new Calculator(Double.parseDouble(num1), Double.parseDouble(num2));
            x.toMod();
        }
        else
        {
            String num1 = expresion.substring(0, power-1);
            String num2 = expresion.substring(power + 2);
            Calculator x = new Calculator(Double.parseDouble(num1), Double.parseDouble(num2));
            x.toPower();
        }
    }
}
