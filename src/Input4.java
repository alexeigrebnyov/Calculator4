import java.io.*;
public class Input4 {

    public static String getString() throws IOException {
        String str;
        str = "0";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        str = reader.readLine();

        return str;

    }
}
