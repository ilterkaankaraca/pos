package com.iltermon.decorator.lowercaseinputstream;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.File;
import java.io.FileInputStream;

public class LowerMain {
    public static void main(String[] args) throws IOException {
        File data = new File("test.txt");
        InputStream file = new FileInputStream(data);
        InputStream lower = new LowerCaseInputStream(file);
        int c =0;  
        while((c=lower.read())!=-1){  
            System.out.print((char)c);  
        }
        file.close();  
        lower.close();    
    }
}