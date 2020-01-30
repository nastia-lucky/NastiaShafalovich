package by.belhard.j19.Homeworks.MyProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOService {
    private static final String MENU =
            "1. add Pet\n"
                    + "2. add host\n"
                    + "3. get pets without vaccination\n"
                    + "4. delete pet\n"
                    + "5. get host Info\n"
                    + "6. get pet Info\n"
                    + "e. exit\n";

    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void printMainMenu() {

        System.out.println(MENU);
    }

    public String getInputString() throws IOException {

        return reader.readLine();
    }

    public int getInputInt() throws IOException, NumberFormatException {

        return Integer.parseInt(reader.readLine());
    }

}
