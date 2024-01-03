import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Day1 {

  public static int getCalibrationNumber(String input) {
    char digit1 = ' ';
    char digit2 = ' ';
    for(char c : input.toCharArray()) {
      if (Character.isDigit(c)) {
        if(digit1 == ' ') {
          digit1 = c;
        }
        digit2 = c;
      }
    }

    int result = Integer.parseInt((digit1 + Character.toString(digit2)));

    return result;

  }

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new FileReader(args[0]));

    String line = reader.readLine();
    int sum = 0;
    while(line != null) {
      System.out.println(line);
      sum += getCalibrationNumber(line);
      line = reader.readLine();
    }

    System.out.println(sum);
  }

}
