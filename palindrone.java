public class palindrone {
  static boolean checkPalindrome(String inputString) {
    int length = inputString.length() - 1;
    for(int i = 0; i <= length / 2; i++){
      if(inputString.charAt(i) != inputString.charAt(length - i)){
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args){
    System.out.println(checkPalindrome("aabaa"));
    System.out.println(checkPalindrome("aaba"));
  }

}
