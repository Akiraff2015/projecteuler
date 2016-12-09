package akiraff.com.euler;

public class ConvertToWord {
  final String[] numNames = {
      "one",      // 1
      "two",      // 2
      "three",    // 3
      "four",     // 4
      "five",     // 5
      "six",      // 6
      "seven",    // 7
      "eight",    // 8  
      "nine",     // 9
      "ten",      // 10
      "eleven",     // 11
      "twelve",   // 12
      "thirteen",   // 13
      "fourteen",   // 14
      "fifteen",    // 15
      "sixteen",    // 16
      "seventeen",  // 17
      "eighteen",   // 18
      "nineteen"    // 19
  };
  
  final String[] doubleDigits = {
      "ten",      //10
      "twenty",     //20
      "thirty",     //30
      "forty",    //40
      "fifty",    //50
      "sixty",    //60
      "seventy",    //70
      "eighty",     //80
      "ninety"    //90
  };
  
  final String[] baseDigits = {
    "hundred",      // 100
    "thousand"      // 1000
  };

  public String convertToWord(int i) {
    String digitToString = Integer.toString(i);
    
    // Numbers 1-19   
    if (i <= 19) {
      return numNames[i-1];
    }

    // 2 digit values ending with 0's
    else if (i % 10 == 0 && i < 100) {
      return doubleDigits[(i/10)-1];
    }
    
    //Numbers 21 - 99 (without the 0's)   
    else if (digitToString.length() == 2) {
      return doubleDigits[Character.getNumericValue(digitToString.charAt(0))-1] + 
          numNames[Character.getNumericValue(digitToString.charAt(1))-1];
    }
    
    //3 Digit values ending with 0's
    else if (digitToString.length() == 3 && digitToString.charAt(1) != '0' && digitToString.charAt(2) == '0') {
      return numNames[Character.getNumericValue(digitToString.charAt(0))-1] + baseDigits[0] + "and" + 
          doubleDigits[Character.getNumericValue(digitToString.charAt(1))-1];
    }
    
    //3 Digit values between n11 - n19 (Where n = 1-9)
    else if (digitToString.length() == 3 && Character.getNumericValue(digitToString.charAt(1)) == 1) {
      return numNames[Character.getNumericValue(digitToString.charAt(0)-1)] + baseDigits[0] + "and" +
          numNames[Character.getNumericValue(digitToString.charAt(2)+16)];
    }
    
    //4 Digit n000 (Where n = 1-9)
    else if (digitToString.length() == 4 && digitToString.charAt(1) == '0' && digitToString.charAt(2) == '0' && digitToString.charAt(3) == '0') {
      return numNames[Character.getNumericValue(digitToString.charAt(0))-1] + baseDigits[1];
    }
    
    //3 digits n00 (Where n = 1-9)
    else if (digitToString.charAt(1) == '0' && digitToString.charAt(2) == '0') {
      return numNames[Character.getNumericValue(digitToString.charAt(0))-1] + baseDigits[0];
    }
    
    //3 digits n0n (Where n = 1-9)
    else if (digitToString.length() == 3 && digitToString.charAt(1) == '0') {
      return numNames[Character.getNumericValue(digitToString.charAt(0))-1] + baseDigits[0] + "and" +
          numNames[Character.getNumericValue(digitToString.charAt(2))-1];
    }
    
    //If nothing else meets
    else if (digitToString.length() == 3) {
      return numNames[Character.getNumericValue(digitToString.charAt(0))-1] + baseDigits[0] + "and" +
          doubleDigits[Character.getNumericValue(digitToString.charAt(1)-1)] +
          numNames[Character.getNumericValue(digitToString.charAt(2)-1)]; 
    }

    return null;
  }
}
