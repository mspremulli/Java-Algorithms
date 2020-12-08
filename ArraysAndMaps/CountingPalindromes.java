package ArraysAndMaps;

public class CountingPalindromes {

  public static int countPalindromes(String s) {
    int length = s.length();
    int counter = length;

    //todo change to multitheading
    for (int i = 0; i < length; i++) {
      for (int j = i; j < length - 1; j++) {
        if(isPalindrome(s.substring(i,length - j + i))) counter++;
//        System.out.println(s.substring(i,length - j + i));
      }
    }

    return counter;
  }

  public static boolean isPalindrome(String str){
    int length = str.length() - 1;
    for(int i = 0; i <= length / 2; i++){
      if(str.charAt(i) != str.charAt(length - i)){
        return false;
      }
    }
    return true;
  }

  public static void main(String [] args){
    System.out.println(countPalindromes("tacocat"));
    System.out.println(countPalindromes("aaa"));
  }
}
