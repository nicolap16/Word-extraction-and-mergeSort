import java.io.*;
import java.util.*;

public class Parse {

  // A method to extract words from a source text into an array list for easier comparison
  public static HashSet<String> parseSourceText(){

    HashSet<String> sourceWords = new HashSet<String>();

    try{
      
        // NOTE: change the filepath for the source text as needed
        Scanner sourceText = new Scanner (new File("google-10000-english-no-swears.txt"));

        while(sourceText.hasNextLine()){
          String nextSourceWord = sourceText.nextLine().toLowerCase();
          sourceWords.add(nextSourceWord);
          }
        
        sourceText.close();
        }

      catch(Exception e){
        System.out.println("The source text file was not read correctly");
        }

    return sourceWords;

  }

}