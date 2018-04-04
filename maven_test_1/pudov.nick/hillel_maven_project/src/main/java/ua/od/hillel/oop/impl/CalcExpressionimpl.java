package ua.od.hillel.oop.impl;

import ua.od.hillel.oop.CalcExpression;

public class CalcExpressionimpl implements CalcExpression {
    private double result;
    private double op1;
    private String op2;
    private double op3;

    CalcExpressionimpl(double op1, String op2, double op3){
        this.op1 = op1;
        this.op2 = op2;
        this.op3 = op3;
    }



    public void add()
    {

    }

    public void divide()
    {

    }

    public void multiply()
    {

    }

    public void substraction()
    {

    }

    public void moduleDiv()
    {

    }

    public void setOperation(String op)
    {

    }

    public double getOperation()
    {
        return 0;
    }

    public double getResult()
    {
        return 0;
    }
}
