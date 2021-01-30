package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double var1){
        firstNumber = var1;
    }
    public void setSecondNumber(double var1){
        secondNumber = var1;
    }
    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }
    public double getDivisionResult(){
        if(secondNumber == 0){
            return 0;
        }
        return firstNumber / secondNumber;
    }




}
