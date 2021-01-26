package Review;

class ListNode<T> {
  ListNode(T x) {
    value = x;
  }
  T value;
  ListNode<T> next;
}

public class RemoveKFromList {

  public static ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    ListNode<Integer> newList = l;

    if(l == null) return null;
    while(l.value == k){
      l = l.next;
      if (l == null) return null;
    }

    while(newList.next != null){
      if ((newList.next.value) == k) newList.next = newList.next.next;
      else newList = newList.next;
    }
    return l;
  }

  public static void main(String[] args) {
    System.out.println(removeKFromList(new ListNode<>(2) , 1));
  }
}
