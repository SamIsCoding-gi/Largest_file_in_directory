import java.io.File;
import java.util.Scanner;

public class files_size {

    //class to find the largest file in a directory including sub directories
    static File largest_File(String nameOfFolder)
    {
        Long LargestFile = 0L;
        File Dir = new File(nameOfFolder);
        if (Dir.isFile()) {
            return Dir;
        } else {
            File largestFile = null;

            // recursive loop to find file
            for (File file : Dir.listFiles()) {

                File possiblyLargeFile = largestFile(file);
                if (possiblyLargeFile != null) {
                    if (largestFile == null || possiblyLargeFile.length() > largestFile.length()) {
                        largestFile = possiblyLargeFile;
                    }
                }
            }
            return largestFile;
        }
    }

    //returns largest file for the for loop
    private static File largestFile(File file) {
        return file;
    }

    //Prints out largest file through user input
    public static void main (String[] args){
        System.out.println("Please enter your directory: ");

    Scanner scan = new Scanner(System.in);
    String path = scan.nextLine();
    System.out.println("Largest file is: " + largest_File(path ) + largest_File(path).length());

    }
}
