/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author Admin
 */
public class DictionaryManagement {
    public Word setNewWord()
    {
        Scanner scanner=new Scanner(System.in);
        Word NewWord=new Word();
        System.out.println("Nhap tu:");
        NewWord.setWordTarget(scanner.nextLine());
        System.out.println("Nhap nghia");
        NewWord.setWordExplain(scanner.nextLine());
        return NewWord;
    }
    public Dictionary insertFromCommandline()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input word:");
        int number=scanner.nextInt();
        Dictionary Words=new Dictionary();
        for(int i=0;i<number;i++)
        {
            Words.addWord(setNewWord());
        }
        return Words;
    }
    public Dictionary insertFromFile() 
    {
        try
        {
            Dictionary Word=new Dictionary();
            File file= new File("D:\\Dic1.txt");
            FileReader Reader = new FileReader(file);
            BufferedReader Buffer= new BufferedReader(Reader);
            String count=Buffer.readLine();
            while(count != null)
            {
                Word NewWord= new Word();
                int i= count.lastIndexOf(9);//tab=9
                NewWord.setWordTarget(count.substring(0, i).trim());
                NewWord.setWordExplain(count.substring(i).trim());
                Word.addWord(NewWord);
                count=Buffer.readLine();
            }
            Reader.close();
            Buffer.close();
            return Word;
        }
        catch(Exception ex)
        {
            System.out.println("Error: " +ex);
        }
        return null;
    }
    public String dictionaryLookup(Dictionary word)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap tu:");
        String line=scanner.nextLine();
        for(int i=0;i<word.getArray().size();i++)
        {
            if(line.equals(word.getArray().get(i).getWordTarget()))
            {
                return word.getArray().get(i).getWordExplain();
            }
        }
        return null;
    }
}
