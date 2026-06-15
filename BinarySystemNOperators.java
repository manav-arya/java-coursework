public class BinarySystemNOperators {
    public static void main(String[] args) {
        //Arthematic Operators
        //+, -, *, /, % -----> We all know what these do

        //Unary operator
        //++ ----> variable = variable + 1
        int i = 1;
        i++;
        System.out.println("i = "+i);
        //same for --
        //Increment operator has 2 types, pre increment ++i, and post increment i++
        //example
        int a = 10;
        int b = a++;//here, value increases after the assignement
        System.out.println("a = "+a+", b = "+b);
        a = 10;
        b=++a;//here, value changes before assignement
        System.out.println("a = "+a+", b = "+b);

        //relational operators
        /// ==, !=, >, < >=, <= 
        
        // logical operators
        /* 
            &&(logical AND)
            ||(logical OR)
            !(logical NOT)
            All of these act the same as AND, OR and NOT operator in python
        */

        // Bitwise Operators(For Binary)
        // Binary AND(&)
        // Binary OR(|)
        //  Binary XOR(^)
        // Binary Complement (~)(Converts 1 to 0 and 0 to 1)
        // These Convert the number into binary and do the same stuff as the name suggests(Logic gate from physics are being used as a reference)
        //Binary left shift
        int x = 5;
        int y = x<<1;//10
        System.out.println(y);
        //Binary Right Shift
        y = x>>1;//10
        System.out.println(y);//2

        // Assignement operators are the same as java
    }
}
