/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.to.array;

import java.io.*;
import java.io.BufferedReader;

/**
 *
 * @author Michael
 */
public class StringToArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        StringBuilder builder = new StringBuilder();
        String test = "','";
        int i = 0;
        
        BufferedReader br = new BufferedReader(new FileReader("file1.txt"));
        try {
            String line;
            
            while ((line = br.readLine()) != null) {
                builder.append('[');
                builder.append("'");
                line = line.replaceAll("[,]", test);
                builder.append(line);
                builder.append("'");
                builder.append(']');
                System.out.println(builder.toString());
                builder = new StringBuilder();
                i++;
            }
        } finally {
            br.close();
            System.out.println(i);
        }        
    }
        
}