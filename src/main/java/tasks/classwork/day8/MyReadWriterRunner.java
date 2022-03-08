package tasks.classwork.day8;

import java.io.IOException;

public class MyReadWriterRunner {

    public static void main(String[] args) throws IOException {

        MyReadWriter myReadWriter = new MyReadWriter();

        myReadWriter.read();
        myReadWriter.write();
        //myReadWriter.readWriter("", "");
    }
}
