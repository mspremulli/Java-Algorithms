package java30DaysOfCode;

public class day16 {
}

public class Solution {

    public static void main(String[] args) throws NumberFormatException {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{

            System.out.println(Integer.parseInt(S));
        }
        catch(NumberFormatException e){
            System.out.println("Bad String");
        }
    }

}

