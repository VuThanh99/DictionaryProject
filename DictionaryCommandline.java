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
public class DictionaryCommandline {
    public void showAllWords(Dictionary Dic)
    {
        System.out.println("NO  | English   | Vietnamese");
        for(int i=0;i<Dic.getArray().size();i++)
        {
            System.out.println(i+1+"   | "+Dic.getArray().get(i).getWordTarget()+"  | "+Dic.getArray().get(i).getWordExplain());
        }
    }
    public void dictionaryBasic()
    {
        DictionaryManagement input=new DictionaryManagement();
        Dictionary word=new Dictionary();
        word=input.insertFromFile();
        DictionaryCommandline output=new DictionaryCommandline();
        output.showAllWords(word);
    }
    public void dictionaryAdvanced()
    {
        DictionaryManagement input=new DictionaryManagement();
        Dictionary word=new Dictionary();
        word=input.insertFromFile();
        DictionaryCommandline output=new DictionaryCommandline();
        output.showAllWords(word);
        String Word;
        if((Word=input.dictionaryLookup(word))!=null)
        {
            System.out.println("This word mean: "+Word);
        }
        else
        {
            System.out.println("This word isn't in Dictionary");
        }
    }
}
