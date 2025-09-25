import java.util.Scanner;
public class PrintVowelsAndNonVowels {
  public static void main(String[] args) {
    System.out.println("Please type a string:");
    Scanner scan = new Scanner(System.in);
    String stringGiven= scan.nextLine();
    System.out.println("string entered is:"+stringGiven);
    int aCounter=0;
    int eCounter=0;
    int iCounter=0;
    int oCounter=0;
    int uCounter=0;
    String stringLeftOver=stringGiven;
    while(stringLeftOver.length()>0){
      if (stringLeftOver.charAt(0)=='a'){
        ++aCounter;}
        else if (stringLeftOver.charAt(0)=='e'){
          ++eCounter;
        }
        else if (stringLeftOver.charAt(0)=='i'){
          ++iCounter;
        }
        else if (stringLeftOver.charAt(0)=='o'){
          ++oCounter;
        }
        else if (stringLeftOver.charAt(0)=='u'){
          ++uCounter;
        }
  stringLeftOver= stringLeftOver.substring(1);
  System.out.println("a="+aCounter+"     e="+eCounter     +"     i="+iCounter+
      "     o="+oCounter+"     u="+uCounter);
  System.out.println("the amount of non-vowels and/or not lowercase characters is:"+ (stringGiven.length()-
      (aCounter+eCounter+iCounter+oCounter+uCounter)) );
      }
    scan.close();
  }
}
