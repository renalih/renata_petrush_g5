package tasks.classwork.day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {

    public static void main(String[] args) throws IOException, InterruptedException {

        BufferedWriter out = new BufferedWriter(new FileWriter("new_file.txt"));
        out.write("мама мыла раму");

/*        while (true){
            Thread.sleep(1000);
        }*/

        out.close();
    }
}
