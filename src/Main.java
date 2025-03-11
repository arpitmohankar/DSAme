import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");
        System.out.println("Hello World");
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
            System.out.println("Hi learned to connect github with intellij");
        }
        try {
            File obj =new File("test.txt");
            FileWriter obj1 =new FileWriter(obj);

        obj1.write("Hello World arpit");
        obj1.close();
        Scanner scanner= new Scanner(obj);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());

        }
        scanner.close();
        }
        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}