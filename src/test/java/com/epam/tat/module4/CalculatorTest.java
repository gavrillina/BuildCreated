package com.epam.tat.module4;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {

    Calculator calculator=new Calculator();



    @Test(dataProvider = "longParam")
    public void summTest(long a, long b) {
        long expectRes = a + b;
        long res = calculator.sum(a, b);
        Assert.assertEquals(expectRes, res);
    }

    @Test(dataProvider = "doubleParam")
    public void summTest(double a, double b) {
        double expectRes = a + b;
        double res = calculator.sum(a, b);
        Assert.assertEquals(expectRes, res);
    }

    @Test(dataProvider = "doubleParam")
    public void subTest(double a, double b) {
        double expectRes = a - b;
        double res = calculator.sub(a, b);
        Assert.assertEquals(expectRes, res);
    }

    @Test(dataProvider = "longParam")
    public void subTest(long a, long b) {
        long expectRes = a - b;
        long res = calculator.sub(a, b);
        Assert.assertEquals(expectRes, res);
    }

    @Test(dataProvider = "doubleParam")
    public void multTest(double a, double b) {
        double expectRes = a * b;
        double res = calculator.mult(a, b);
        Assert.assertEquals(expectRes, res);
    }

    @Test(dataProvider = "longParam")
    public void multTest(long a, long b) {
        long expectRes = a * b;
        long res = calculator.mult(a, b);
        Assert.assertEquals(expectRes, res);
    }

    @Test(dataProvider = "doubleParam")
    public void divTest(double a, double b) {
        double expectRes = a / b;
        double res = calculator.div(a, b);
        Assert.assertEquals(expectRes, res);
    }

    @Test(dataProvider = "longParam")
    public void divTest(long a, long b) {
        long expectRes = a / b;
        long res = calculator.div(a, b);
        Assert.assertEquals(expectRes, res);
    }


    @Test(expectedExceptions = NumberFormatException.class)
    public void divLongTetsException() throws NumberFormatException {
      calculator.div(1,0);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divDoubleTetsException() throws NumberFormatException {
        calculator.div(1,0);
    }

    @Test(dataProvider = "doubleParam")
    public void powTest(double a, double b) {
        double expectRes = Math.pow(a,b);
        double res = calculator.pow(a, b);
        Assert.assertEquals(expectRes, res);
    }
    @Test(dataProvider = "doubleParamOne")
    public void sqrtTest(double a){
        double expectedRes=Math.sqrt(a);
       double res=calculator.sqrt(a);
        Assert.assertEquals(expectedRes,res );
    }

    @Test(dataProvider = "doubleParamOne")
    public void tgTest(double a){
        double expectedRes=Math.tan(a);
        double res=calculator.tg(a);
        Assert.assertEquals(expectedRes,res );
    }

    @Test(dataProvider = "doubleParamOne")
    public void ctgTest(double a){
        double expectedRes=Math.cos(a)/Math.sin(a);
        double res=calculator.ctg(a);
        Assert.assertEquals(expectedRes,res );
    }

    @Test(dataProvider = "doubleParamOne")
    public void cosTest(double a){
        double expectedRes=Math.cos(a);
        double res=calculator.cos(a);
        Assert.assertEquals(expectedRes,res );
    }


    @Test(dataProvider = "doubleParamOne")
    public void sinTest(double a){
        double expectedRes=Math.sin(a);
        double res=calculator.sin(a);
        Assert.assertEquals(expectedRes,res );
    }

    @Test(dataProvider = "longParamOne")
    public void isPositiveTest(long a){
       boolean expectedRes=true;
       if(a==0L){
           expectedRes=false;
       }else {expectedRes=a>0;}
       boolean res=calculator.isPositive(a);
        Assert.assertEquals(expectedRes,res );
    }

    @Test(dataProvider = "longParamOne")
    public void isNegativeTest(long a){
        boolean expectedRes=true;
        if(a==0L){
            expectedRes=false;
        }else{expectedRes=a<0;}
        boolean res=calculator.isNegative(a);
        Assert.assertEquals(expectedRes,res );
    }

    @DataProvider
    public Object[][] longParam() {
        return new Object[][]{
                {1, 2},
                {-1,9}
        };
    }

    @DataProvider
    public Object[][] doubleParam() {
        return new Object[][]{
                {1.2, 2.3},
                {2.25, 3.98}
        };
    }


    @DataProvider
    public Object[][] doubleParamOne() {
        return new Object[][]{
                {1.2},
                {-99.9}
        };
    }

    @DataProvider
    public Object[][] longParamOne() {
        return new Object[][]{
                {0},
                {1},
                {-1}
        };
    }
}

