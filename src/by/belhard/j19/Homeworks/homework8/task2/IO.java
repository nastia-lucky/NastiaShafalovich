package by.belhard.j19.Homeworks.homework8.task2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IO {
    public static void main(String[] args) throws IOException {
        FileReader fileIn = null;
        FileWriter fileOut = null;

        try {
            fileIn = new FileReader("/Users/anastasiyashafalovich/IdeaProjects/NastiaShafalovich/src/by/belhard/j19/Homeworks/homework8/task2/files/fileIn.txt");
            fileOut = new FileWriter("/Users/anastasiyashafalovich/IdeaProjects/NastiaShafalovich/src/by/belhard/j19/Homeworks/homework8/task2/files/fileOut.txt");

            int symbol;
            StringBuilder sb = new StringBuilder();
            while ((symbol = fileIn.read()) != -1) {
                if (symbol != ' ') {
                    sb.append((char)symbol);
                } else {
                    int number = Integer.parseInt(sb.toString());
                    int pow = (int) Math.pow(number, 3);
                    fileOut.write("" + pow + " ");
                    sb = new StringBuilder();
                }
            }

        } finally {
            if (fileIn != null) {
                fileIn.close();
            }
            if (fileOut != null) {
                fileOut.close();
            }
        }

    }
}
