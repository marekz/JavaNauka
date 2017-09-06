/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

/**
 *
 * @author mzdybel
 */
public class OperationClass {
    public static Operations generate(String operationName, double valueA, double valueB){
        switch(operationName){
//            add subtraction multiply divide
            case "+" : return new AddOperation(valueA, valueB);
            case "-" : return new SubtractionOperation(valueA, valueB);
            case "*" : return new MultiplyOperation(valueA, valueB);
            case "/" : return new DivideOperation(valueA, valueB);
            
            default : return null;
        }
    }
}

class AddOperation extends Operations {
    
    private double valueA;
    private double valueB;
    
    public AddOperation(double valueA, double valueB){
        this.valueA = valueA;
        this.valueB = valueB;
    }

    @Override
    public double result() {
        return valueA + valueB;
    }

}

class SubtractionOperation extends Operations {
    
    private double valueA;
    private double valueB;
    
    public SubtractionOperation(double valueA, double valueB){
        this.valueA = valueA;
        this.valueB = valueB;
    }

    @Override
    public double result() {
        return valueA - valueB;
    }

}

class MultiplyOperation extends Operations {
    
    private double valueA;
    private double valueB;
    
    public MultiplyOperation(double valueA, double valueB){
        this.valueA = valueA;
        this.valueB = valueB;
    }

    @Override
    public double result() {
        return valueA * valueB;
    }

}

class DivideOperation extends Operations {
    
    private double valueA;
    private double valueB;
    
    public DivideOperation(double valueA, double valueB){
        this.valueA = valueA;
        this.valueB = valueB;
    }

    @Override
    public double result() {
        return valueA / valueB;
    }

}

  

