public class CountFlips {
  public static void main(String[] args) {
//have computer choose 0 or 1, 0=headCount+1, 1=tailCount+1
//or just skip tail count and do 100-headCount
    int timesRan;
    int headCounter=0;
    int flipResult;
    for (timesRan=0; timesRan<100;)
    {
      flipResult=(int) (Math.random() * 2);
      if (flipResult==0){
        ++headCounter;
      }
      ++timesRan;
    }
    if (timesRan>=100){
      System.out.println("Heads was flipped "+headCounter+" times");
      System.out.println("Tails was flipped "+(100-headCounter)+" times");
      System.out.println("the coin was flipped "+timesRan+" times overall");
    }
  }
}
