package org.fasttrackit.course4.tema4;

public class Calculator {
//2.1. Create a calculator class with 4 basic operations:
//Add, Subtract,Multiply,Divide
    // +, -, /, *
//2.2. The calculator receives 3 parameters:
//Operator 1, Operator 2, Operation type
//2.3. The input is given from a psvm method.

// A mathematics operation has the following:
// terms(imput data), operations sign(action), result(output)

static double doOperation(int operator1, int operator2, String operationType){ // de ce avem nevoie de String OperationsType?
double result = 0;
switch (operationType){
    case "+":
        result = operator1 + operator2;
        break;
    case "-":
        result = operator1 - operator2;
        break;
    case "*":
        result = operator1 * operator2;
        break;
    case"/":
        result = operator1 / operator2;
        break;
}
    return result;
}

    public static void main(String[] args) {
       double result =  doOperation(10, 3,"-");
        System.out.println(result);
    }
}
