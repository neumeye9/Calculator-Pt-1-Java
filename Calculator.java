import java.util.*;

class Calculator implements java.io.Serializable{
    private double operandOne;
    private String operation;
    private double operandTwo;

    public Calculator(){
    }

    public void setOperandOne(String opOne){
        this.operandOne = Double.parseDouble(opOne);
    }

    public void setOperation(String operation){
        this.operation = operation;
    }

    public void setOperandTwo(String opTwo){
        this.operandTwo = Double.parseDouble(opTwo);
    }

    public double performOperation(){
        double result = 0;

        if(this.operation == "-"){
            result = this.operandOne - this.operandTwo;
        }
        else if(this.operation == "+"){
            result = this.operandOne + this.operandTwo;
        }
        else{
            System.out.println("The operation you entered cannot be performed.");
        }
        return result;
    }

    public double getResult(){
        double result = this.performOperation();
        System.out.println("The result of this operation is: " + result);
        return result;
    }
   
}