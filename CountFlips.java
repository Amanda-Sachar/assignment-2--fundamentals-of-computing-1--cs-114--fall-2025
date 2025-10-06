public class CountFlips {
  public static void main(String[] args) {

    int timesRan;
    int headCounter = 0;
    Coin coin = new Coin();

    for (timesRan = 0;timesRan < 100;timesRan++) {
      coin.flip();
      if (coin.isHeads()) {
        ++headCounter;
      }
    }

    if (timesRan >= 100) {
      System.out.println("Heads was flipped " + headCounter + " times");
      System.out.println("Tails was flipped " + (100-headCounter) + " times");
      System.out.println("the coin was flipped " + timesRan + " times overall");
    }
  }
}
