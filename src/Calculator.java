public class Calculator
{
    private double num1;
    private double num2;

    public Calculator(double num1, double num2)
    {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void toAdd()
    {
        System.out.println(num1 + num2);
    }

    public void toSubtract()
    {
        System.out.println(num1 - num2);
    }

    public void toDivide()
    {
        System.out.println(num1 / num2);
    }

    public void toMultiply()
    {
        System.out.println(num1 * num2);
    }

    public void toPower()
    {
        System.out.println(Math.pow(num1, num2));
    }

    public void toMod()
    {
        System.out.println(num1 % num2);
    }


}
