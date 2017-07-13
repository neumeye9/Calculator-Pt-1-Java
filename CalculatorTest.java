class CalculatorTest{
    public static void main(String[] args){
        Calculator a = new Calculator();
        a.setOperandOne("12.50");
        a.setOperation("+");
        a.setOperandTwo("7.00");
        
        a.performOperation();
        a.getResult();

        Calculator b = new Calculator();
        b.setOperandOne("27.6");
        b.setOperation("-");
        b.setOperandTwo("15.4");

        b.performOperation();
        b.getResult();
    }
}