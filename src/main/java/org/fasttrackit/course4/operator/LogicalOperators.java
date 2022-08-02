package org.fasttrackit.course4.operator;

public class LogicalOperators {
    public static void main(String[] args) {
       int op11 =1;
       int op12 = 1;
       boolean opb11 = op11>op12;//false
       int op13= 4;
       int op14= 4;
       boolean opb12 = op13==op14;//true

        boolean opb13 = opb11 & opb12; //both have to be true
        boolean opb14 = opb11 | opb12; // one or both have to be true

        System.out.println("Result 1(opb 13): " + opb13);
        System.out.println("Result 2(opb 14): " + opb14);



        int op21 =1;
        int op22 = 2;
        int op23= 3;
        int op24= 4;
        boolean opb21 = (op21<op22)&(op23 <op24);
        System.out.println("Result 3(opb21) " + opb21); //true
        System.out.printf("\n (op21,op22,op23,op24): %d, %d, %d, %d\n",
                op21, op22, op23, op24);//1,2,3,4

        boolean opb22 = (op21++ < op22) & (op23++ < op24);// simple AND(&)
        System.out.println("Result 4 (opb22) " + opb22);//true
        System.out.printf("\n (op21,op22,op23,op24): %d, %d, %d, %d\n",
                op21, op22, op23, op24);//2,2,4,4

        boolean opb32 = (op21++ < op22) && (op23++ < op24);//SHORT-CIRCUIT AND(&&)
        System.out.println("Result 5 (opb32) " + opb32);
        System.out.printf("\n (op21,op22,op23,op24): %d, %d, %d, %d\n",
                op21, op22, op23, op24);//3,2,4,4?
        // Reason: Short circuiting does not evaluete the rest of the statement if it already know the answer
        // Because the first part (2<2) is FALSE, the whole operation can no longer result in TRUE
        // In that case, the part with (4<4) is no longer evaluate and so "op23++" is no longer triggerred

        // In other words, when evaluating
        //1. Evaluate(op21++ < op22) => FALSE
        //2. Increment op21, because it was evalueted
        //3. See if the right part of && has any sense to be evalueted
        //4. If not, return result
        //4.1. If it has sense for the right part && to be evaluated, evaluate that
        //4.2 If right part is evaluated, increment op23++


        int op31 =1;
        int op32 = 2;
        int op33= 3;
        int op34= 4;
        boolean result31 = (op31++>op32)||(op33++>op34);// first are evaluated(1>2)||(3>4), after increments
        System.out.println("Result (op31++>op32)||(op33++>op34) " + result31);
        System.out.printf("\n (op31,op32,op33,op34): %d, %d, %d, %d\n",
                op31, op32, op33, op34);



        int op41 =1;
        int op42 = 2;
        int op43= 3;
        int op44= 4;
        boolean result41 = (++op41 >= op42)&&(++op43 >= op44);
        //Steps 1. Left part is evaluated(++op41>= op42) as follows:
        //1.1 ++op41 = 1 is incremented to 2
        //1.2 (++op41 >= op42)=>2>=2 => TRUE
        //2. If left side of && is TRUE, than we evaluate right side
        // The right side is evaluated (++op43 >= op44) as follows:
        //2.1 ++op43 => 3 is increments to 4
        //2.2 (++43>=op44) => 4>=4 => TRUE
        //3. TRUE && TRUE => TRUE as result


        System.out.println("Result (++op41>=op42)&&(++op43>=op44) " + result41);
        System.out.printf("\n (op41,op42,op43,op44): %d, %d, %d, %d\n",
                op41, op42, op43, op44);


        System.out.println("\n ?: Ternary operator");
        int op51 =1;
        int op52 = 2;
        int op53= 3;
        int op54= 4;

        String finalResult = (++op51>=--op53) ? "este adevarat" : "fals ca vocea mea";
        // ternary operation: (boolean Evaluation) ? (resultForTrue) : (resultForFalse)
        System.out.println("Result (++op51>=--op53) " + finalResult);





    }

}
