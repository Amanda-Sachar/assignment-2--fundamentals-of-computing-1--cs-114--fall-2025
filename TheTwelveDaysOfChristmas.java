import java.util.Scanner;

public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Please enter the day of Christmas:");
    int day= scan.nextInt();
    java.util.ArrayList<String> Gifts = new java.util.ArrayList<String>();

    switch (day) {
      case 12: Gifts.add("Twelve drummers drumming, ");
      case 11: Gifts.add("Eleven pipers piping, ");
      case 10: Gifts.add("Ten lords a-leaping, ");
      case 9: Gifts.add("Nine ladies dancing, ");
      case 8: Gifts.add("Eight maids a-milking, ");
      case 7: Gifts.add("Seven swans a-swimming, ");
      case 6: Gifts.add("Six geese a-laying, ");
      case 5: Gifts.add("Five golden rings, ");
      case 4: Gifts.add("Four calling birds, ");
      case 3: Gifts.add("Three French hens, ");
      case 2: Gifts.add("Two turtle doves, and");
      case 1: Gifts.add("A partridge in a pear tree");

break;
    };
    if (day==1){
      System.out.println("On the "+day+"st day of Christmas my true love gave to me "+
    Gifts);}
    else if (day==2){
      System.out.println("On the "+day+"nd day of Christmas my true love gave to me "+
    Gifts);
    }else if (day==3){
      System.out.println("On the "+day+"rd day of Christmas my true love gave to me "+Gifts);
    }else{
      System.out.println("On the "+day+"th day of Christmas my true love gave to me "+Gifts);
    }
    scan.close();
  }
}
