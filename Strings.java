public class Strings {
    public static void main(String args[]){
        //charAt method
        String firstName = "Manav";
        for(int i = 0; i<firstName.length(); i++){
            System.out.println(firstName.charAt(i));
        }

        //comaparing two strings
        String name2 = "Manav";
        if(firstName.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }

        // .substring
        String name = firstName.substring(2, firstName.length());
        System.out.println(name);

        //ParseInt
        String number = "123";
        int num = Integer.parseInt(number);//int will be 123
        System.out.println(num);//To do the opposite, use toString instead of parseInt
    }
}
