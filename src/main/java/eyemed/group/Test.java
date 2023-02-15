package eyemed.group;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {


  private static final int DIGITS_GROUP_LENGTH = 4;

  public static void main(String[] args) {
    int[] original = new int[] {1, 4, 3, 2};
    int[] desired = new int[] {1, 2, 4, 3};
    System.out.println(null + "ddd");
    int value = minPieces(original, desired);
    System.out.println(value);

  }

  public static List<Integer> getOneBits(int n) {
    List<Integer> result = new ArrayList<>();
    String binaryString = Integer.toBinaryString(n);
    for (int i = 0; i < binaryString.length(); i++) {
      int val = Integer.parseInt("" + binaryString.charAt(i));
      if (val == 1) {
        result.add(i + 1);
      }
    }
    result.add(0, result.size());
    return result;
  }

  public static void connectSql() {

    String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=CliftonIMS;user=cliftonUser;password=password";

    try (Connection connection = DriverManager.getConnection(connectionUrl);) {
      // Code here.
    }
    // Handle any errors that may have occurred.
    catch (SQLException e) {
      e.printStackTrace();
    }
  }

  public static String format(String prefix, long barcode) {
    StringBuilder sb = new StringBuilder(prefix);
    String s = Long.toString(barcode);
    int beginIndex = 0;
    int endIndex = s.length() % DIGITS_GROUP_LENGTH;
    while (endIndex <= s.length()) {
      if (endIndex > 0) {
        sb.append(' ');
        sb.append(s, beginIndex, endIndex);
      }
      beginIndex = endIndex;
      endIndex += DIGITS_GROUP_LENGTH;
    }
    return sb.toString();
  }


  private static Integer getIntegerValue(String value) {
    if (value != null) {
      return new BigDecimal(value).intValue();
    }
    return 0;
  }


  private static int minPieces(int[] original, int[] desired) {
    int count = 0;
    for (int i = 0; i < desired.length; i++) {
      int currentIndex = -1;
      int presentIndex = i;
      int sequenceCount = 0;
      for (int j = 0; j < original.length; j++) {
        if (desired[i] == original[j]) {
          currentIndex = j;
          break;
        }
      }
      while (currentIndex >= 0) {
        if (presentIndex < desired.length
            && currentIndex < original.length
            && desired[presentIndex] == original[currentIndex]) {
          if (sequenceCount > 0) {
            i++;
          }
          sequenceCount++;
          presentIndex++;
          currentIndex++;
        } else {
          currentIndex = -1;
          count++;
        }
      }
    }
    return count;
  }


}
