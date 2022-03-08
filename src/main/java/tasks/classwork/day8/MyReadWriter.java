package tasks.classwork.day8;

import java.io.*;

public class MyReadWriter {

    public void read() throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("file.txt"));
        String line;
        while ((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }

    public void write() throws IOException {

        BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt"));
        out.write("мама мыла раму");
        out.close();
    }


    public void readWriter(String fileFrom, String fileTo) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(fileFrom));
        BufferedWriter out = new BufferedWriter(new FileWriter(fileTo));

        String line;
        while ((line = in.readLine()) != null) {
            out.append(line);
            out.newLine();
        }
        in.close();
        out.close();
    }

}
