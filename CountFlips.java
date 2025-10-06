public class CountFlips {
  public static void main(String[] args) {
//have computer choose 0 or 1, 0=headCount+1, 1=tailCount+1
//or just skip tail count and do 100-headCount
    int timesRan;
    int headCounter=0;
    int flipResult;

    for (timesRan=0; timesRan<100;timesRan++){
      flipResult=(int) (Math.random() * 2);
      if (flipResult==0){
        ++headCounter;
      }

    }
/*I know I should have used Coin.java for this but I was having
 * difficulty figuring out how to use it here. So I ended up
 * creating my own way to do it. I will redo all of this if
 * doing so is not allowed
 * EDIT: I have found how to do it through the examples Repo,
 * but I feel like just changing all my work to be what is done there
 * feels like cheating or that the work isn't mine if all I do
 * is make some minor adjustments*/
    if (timesRan>=100){
      System.out.println("Heads was flipped "+headCounter+" times");
      System.out.println("Tails was flipped "+(100-headCounter)+" times");
      System.out.println("the coin was flipped "+timesRan+" times overall");
    }
  }
}
