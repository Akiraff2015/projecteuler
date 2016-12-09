package akiraff.com.euler;

public class Main {
  public static void main(String[] args) {
    ConvertToWord ctw = new ConvertToWord();
    int total = 0;

    for (int i = 1; i <= 1000; i++) {
      System.out.printf("%d: %s", i, ctw.convertToWord(i));
      total += ctw.convertToWord(i).length();
    }
    
    System.out.println(total);
  }
}
