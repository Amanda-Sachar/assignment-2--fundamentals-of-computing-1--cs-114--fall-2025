import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter number of repeats:");

    int repeats= scan.nextInt();

    for (int timesCalled=0; timesCalled < repeats;){
      System.out.print(Integer.toString(100-timesCalled) + " bottles of beer on the wall\n"+
      Integer.toString(100-timesCalled) + " bottles of beer\n"+
      "If one of those bottles should happen to fall\n"+
      Integer.toString(100-(++timesCalled))+" bottles of beer on the wall\n\n");
    };

    scan.close();
  }
}
