public class SBuilder {
    public static void main(String[] args) {
        //Introduction
        StringBuilder sb = new StringBuilder("Manav");// the advantage of string builder over strings is that string builder is mutable while strings create a new variable, change the pointer location and delete the old one 
        System.out.println(sb);

        //setCharAt
        sb.setCharAt(4, 'n');
        System.out.println(sb);

        //insert
        sb.insert(5, 'A');
        System.out.println(sb);

        //delete
        sb.delete(5, 6);
        System.out.println(sb);

        //append
        sb.append(" Arya");
        System.out.println(sb);
    }
}
