package gr.aueb.cf.cp9;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class IOApp {
    public static void main(String[] args) {
        String filePathInput = "C:/temp/locations.txt";
        String pathOut = "C:/temp/locationsOut.txt";
        String line;
        String[] title = new String[3];


        try (BufferedReader bf = new BufferedReader(new FileReader(filePathInput))) {

            while ((line = bf.readLine()) != null) {
                String[] tokens = line.split(",");

                if (tokens[0] != null && tokens[0].equals("Location")) {
                    title = tokens;
                    tokens=null;
                }

                if(tokens==null) {
                    continue;
                }

                try (PrintStream ps = new PrintStream( new FileOutputStream(pathOut,true))) {
                    print(ps, title, tokens);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Print input data formatted
     * @param ps PrintStream
     * @param title Title of data
     * @param tokens data
     */
    public static void print(PrintStream ps, String[] title, String[] tokens) {
            ps.printf("{ %s : '%s', %s: %s, %s: %s },\n", title[0].toLowerCase(), tokens[0], title[1].toLowerCase(), tokens[1], title[2].toLowerCase(), tokens[2]);
            //console print for testing
            System.out.printf("{ %s : '%s', %s: %s, %s: %s },\n", title[0].toLowerCase(), tokens[0], title[1].toLowerCase(), tokens[1], title[2].toLowerCase(), tokens[2]);
    }
}
