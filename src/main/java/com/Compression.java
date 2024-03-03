package com;
import java.io.*;
import java.util.HashMap;
import utils.Constants;

public class Compression{
    public static HashMap<Character, Integer> getFrequency(String path) throws IOException{
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        // Create a FileReader object
        FileReader reader = new FileReader(path);

        // Read each character from the file
        int character;
        while ((character = reader.read()) != -1) {
            if(charFrequency.containsKey((char)character)){
                charFrequency.put((char)character, charFrequency.get((char)character) + 1);
            }else{
                charFrequency.put((char)character, 1);
            }
        }
        // Close the FileReader
        reader.close();
        return charFrequency;
    }

    public static void main(String[] args){
        
        try {
            HashMap<Character, Integer> charFrequency = getFrequency(Constants.DATA_PATH);
            //TEMP printing hashmap
            for (char c : charFrequency.keySet()) {
                System.out.println("Character: " + c + ", Frequency: " + charFrequency.get(c));
            }
        } catch (IOException e) {
            // Printing error stack if we cannot open specified file
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            e.printStackTrace();
        }      
    }
}