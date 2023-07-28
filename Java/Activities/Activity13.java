
import java.util.*;

public class Activity13 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random indexGen = new Random();

        System.out.print("Enter integers please ");
        System.out.println("(EOF or non-integer to terminate): ");

        while(scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        Integer nums[] = list.toArray(new Integer[0]);
        int index = indexGen.nextInt(nums.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + nums[index]);

        scan.close();
    }
}
Activity 14
        In this activity we use FileUtils to perform file I/O operations.

        Create a new text file using the default File Class.
        Use the createNewFile() method to create a file.
        Write some text into the text file.
        File file = new File("filepath");
        boolean fStatus = file.createNewFile();
        Activity 14
        Use the FileUtils.getFile() method to get the file object.
        To read the file the method is readFileToString().
//get the file Object
        File fileUtil = FileUtils.getFile("filepath");
//Read file
        System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
        Next, we create a new directory named resources.
        Copy the text file into this directory using the copyFileToDirectory() method.
//Create directory
        File destDir = new File("resources");
//Copy file to directory
        FileUtils.copyFileToDirectory(file, destDir);
        Installing Apache POI
        For regular project using JARs

        45 . 4


