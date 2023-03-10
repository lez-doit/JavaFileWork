import java.io.*;

public class Main {
    public static void main(String[] args) {
        //class File

        File file = new File("file.txt");

        if (file.exists()) {
            System.out.println("That file exists!");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
        }
        else {
            System.out.println("That file doesn't exist!");
        }

        //class FileWriter

        try {
            FileWriter writer = new FileWriter("file.txt");
            writer.write("Roses are red \nViolets are blue \nSome text here \nLast line of file");
            writer.append("\n(A poem for testing)");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //class FileReader

        try {
            FileReader reader = new FileReader("file.txt");
            int data = reader.read();

            while (data != -1) {
                System.out.print((char)data);
                data = reader.read();
            }
            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}