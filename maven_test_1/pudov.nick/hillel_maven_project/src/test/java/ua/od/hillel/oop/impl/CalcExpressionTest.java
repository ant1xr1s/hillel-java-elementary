package ua.od.hillel.oop.impl;

import org.junit.Before;
import org.junit.Test;
import ua.od.hillel.oop.CalcExpression;

import static org.junit.Assert.assertTrue;

public class CalcExpressionTest {
    private CalcExpressionimpl calcExpressionimpl1;
    private CalcExpressionimpl calcExpressionimpl2;
    private CalcExpressionimpl calcExpressionimpl3;
    private CalcExpressionimpl calcExpressionimpl4;
    private CalcExpressionimpl calcExpressionimpl5;
    private CalcExpressionimpl calcExpressionimpl6;
    
    @Before
    void init() {
        this.calcExpressionimpl1 = new CalcExpressionimpl(10, CalcExpression.ADD, 234) ;
        this.calcExpressionimpl2 = new CalcExpressionimpl(12, CalcExpression.DIVIDE, 234340);
        this.calcExpressionimpl3 = new CalcExpressionimpl(222, CalcExpression.MULTIPLY, 3434);
        this.calcExpressionimpl4 = new CalcExpressionimpl(355, CalcExpression.SUBSTRACTION, 270);
        this.calcExpressionimpl5 = new CalcExpressionimpl(0, CalcExpression.SUBSTRACTION, 283);
        this.calcExpressionimpl6 = new CalcExpressionimpl(355, CalcExpression.SUBSTRACTION, 0);
        
    }
    @Test
    public void addTest()
    {
        calcExpressionimpl1.add();
    }
    @Test
    public void divideTest()
    {
        calcExpressionimpl2.divide();
    }
    @Test
    public void multiplyTest()
    {

    }
    @Test
    public void substractionTest()
    {

    }
    @Test
    public void moduleDivTest()
    {

    }
    @Test
    public void setOpGetOp(){
        calcExpressionimpl1.setOperation(CalcExpression.ADD);
        assertTrue ("ok", calcExpressionimpl1.getOperation().equals(CalcExpression.ADD));
    }
    
}
