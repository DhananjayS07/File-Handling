package dj;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // Create directories for the classes in the dj package
        File additionDir = new File("dj\\Addition");
        boolean b1 = additionDir.mkdirs();
        System.out.println(b1);

        File subtractionDir = new File("dj\\Subtraction");
        boolean b2 = subtractionDir.mkdirs();
        System.out.println(b2);

        File multiplicationDir = new File("dj\\Multiplication");
        boolean b3 = multiplicationDir.mkdirs();
        System.out.println(b3);

        File divisionDir = new File("dj\\Division");
        boolean b4 = divisionDir.mkdirs();
        System.out.println(b4);

        // Create Java files inside the directories
        File additionFile = new File(additionDir, "Addition.java");
        boolean b5 = additionFile.createNewFile();
        System.out.println(b5);

        File subtractionFile = new File(subtractionDir, "Subtraction.java");
        boolean b6 = subtractionFile.createNewFile();
        System.out.println(b6);

        File multiplicationFile = new File(multiplicationDir, "Multiplication.java");
        boolean b7 = multiplicationFile.createNewFile();
        System.out.println(b7);

        File divisionFile = new File(divisionDir, "Division.java");
        boolean b8 = divisionFile.createNewFile();
        System.out.println(b8);
    }
}

