public class BitManupilations {
    public static void main(String[] args) {
        //Get Bit Operation
        // Question from lecture
        int n = 5;//0101
        int pos = 1;
        int bitMask = 1<<pos; //1000
        if((bitMask& n)==0){
            System.out.println("bit is 0");
        }

        // Set Bit
        if((bitMask|n)==0){
            System.out.println("bit is 0");
        }else{
            System.out.println("bit is one");
        }

        // Clear Bit
        if((~bitMask&n)==0){
            System.out.println("bit is 0");
        }else{
            System.out.println("bit is one");
        }

        //update bit ---> reffer to lecture
        
    }
}
