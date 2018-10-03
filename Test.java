/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        DictionaryManagement in = new DictionaryManagement();
        DictionaryCommandline out=new DictionaryCommandline();
        Dictionary Words=new Dictionary();
        Words=in.insertFromFile();
        out.showAllWords(Words);
        
    }
}
