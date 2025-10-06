import java.util.Scanner;

public class TheTwelveDaysOfChristmas {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter the day of Christmas:");

    int day= scan.nextInt();

    String Poem="\n";

    switch (day) {
      case 12: Poem += "Twelve drummers drumming, \n";
      case 11: Poem += "Eleven pipers piping, \n";
      case 10: Poem += "Ten lords a-leaping, \n";
      case 9: Poem += "Nine ladies dancing, \n";
      case 8: Poem += "Eight maids a-milking, \n";
      case 7: Poem += "Seven swans a-swimming, \n";
      case 6: Poem += "Six geese a-laying, \n";
      case 5: Poem += "Five golden rings, \n";
      case 4: Poem += "Four calling birds, \n";
      case 3: Poem += "Three French hens, \n";
      case 2: Poem += "Two turtle doves, and\n";
      case 1: Poem += "A partridge in a pear tree";

break;

    default:
      System.out.println("Invalid Day Entered");
    };

    if (day == 1) {
      System.out.println("On the " + day + "st day of Christmas my true love gave to me " +
    Poem);
    }else if (day == 2) {
      System.out.println("On the " + day + "nd day of Christmas my true love gave to me " +
    Poem);
    }else if (day == 3) {
      System.out.println("On the " + day + "rd day of Christmas my true love gave to me " + Poem);
    }else if (day > 0 && day < 13) {
      System.out.println("On the " + day + "th day of Christmas my true love gave to me " + Poem);
    }

    scan.close();
  }
}
