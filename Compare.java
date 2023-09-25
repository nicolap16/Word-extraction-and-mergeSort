import java.io.*;
import java.util.*;

public class Compare{

  // A method to extract words from a comparison text that match the source text
  public static ArrayList<String> compareTexts(){

    HashSet<String> sourceWords = Parse.parseSourceText();
    ArrayList<String> matchingWords = new ArrayList<String>();

    try{

        // NOTE: change the filepath for the comparison text as needed
        Scanner comparisonText = new Scanner (new File("Input219.txt"));

        while(comparisonText.hasNext()){
          String nextCompareWord = comparisonText.next();
          if (sourceWords.contains(nextCompareWord.toLowerCase())){
                matchingWords.add(nextCompareWord);}
              }
        comparisonText.close();
        }

      catch(Exception e){
        System.out.println("The comparison text file was not read correctly");
        }

    return matchingWords;

  }

}