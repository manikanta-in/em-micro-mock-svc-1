package eyemed.group;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {


    public static void main(String[] args) {
        //List<Integer> result =  getOneBits(161);
        //System.out.println(result);
        //connectSql();
       // System.out.println(this);

        String code = format("PKG",0);
        System.out.println(code);

    }

    public static List<Integer> getOneBits(int n) {
        List<Integer> result = new ArrayList<>();
        String binaryString = Integer.toBinaryString(n);
        for(int i = 0;i< binaryString.length();i++) {
            int val = Integer.parseInt(""+binaryString.charAt(i));
            if( val ==1 ) {
                result.add(i+1);
            }
        }
        result.add(0,result.size());
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

    private static final int DIGITS_GROUP_LENGTH = 4;
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






}
