// Create a java program to search through the home directory and look for files that match a regular
// expression. The program should be able to take inputs repeatedly and should print out the full
// absolute path of the matching files found.

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment1 {
    public void searchFiles(String filePath, String regEx){
        File directory = new File(filePath);
        File[] fileNames = directory.listFiles();
        if(fileNames != null && fileNames.length > 0){
            for(File file : fileNames){
                if(file.isDirectory()){
                    searchFiles(file.getAbsolutePath(),regEx);
                }else if(file.getName().contains(regEx)){
                    System.out.println(file.getAbsolutePath());
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Enter the Regular Expression : ");
            String regEx = br.readLine();
            if(regEx.equals("")){
                break;
            }
            Assignment1 obj = new Assignment1();
            //obj.searchFiles("/","." + regEx);
            obj.searchFiles("C:/Users/Akhil Bommu/IdeaProjects/JavaAssignments/src","." + regEx);
            System.out.println("File Search Done");
        }
    }
}
