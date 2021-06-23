package Assignment11;

import java.io.*;
import java.util.HashMap;

public class CharacterCount {
    public void characterCount(File file) throws IOException {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int c = 0;
        while((c = bufferedReader.read()) != -1){
            char ch = (char) c;
            if(!hm.containsKey(ch)){
                hm.put(ch,1);
            }else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        FileWriter fileWriter = new FileWriter("src/Assignment11/output.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(Character ch : hm.keySet()){
            bufferedWriter.append(String.valueOf(ch)).append(" ").append(String.valueOf(hm.get(ch)));
            bufferedWriter.append("\n");
        }
        bufferedWriter.close();
    }

    public static void main(String[] args) throws IOException {
        // Creation of file descriptor for input file
        File file = new File("src/Assignment11/input.txt");
        CharacterCount obj = new CharacterCount();
        obj.characterCount(file);
    }
}
