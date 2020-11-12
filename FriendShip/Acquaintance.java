package FriendShip;

class Acquaintance{
        String name;

        Acquaintance(String name){
          this.name = name;
        }

        public void getStatus(){
          System.out.println(name + " is just an acquaintance.");
        }
}

class Friend extends Acquaintance {
  String homeTown;

  Friend(String name, String homeTown) {
    super(name);
    this.homeTown = homeTown;
  }

  public void getStatus(){
    System.out.println(name + " is a friend and he is from " + homeTown + ".");
  }
}

class BestFriend extends Friend {
  String favouriteSong;

  BestFriend(String name, String homeTown, String favouriteSong) {
    super(name, homeTown);
    this.favouriteSong = favouriteSong;
  }

  public void getStatus(){
    System.out.println(name + " is my best friend. He is from " + homeTown + " and his favorite song is " + favouriteSong +".");
  }
}