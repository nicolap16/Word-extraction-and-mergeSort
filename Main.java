import java.io.*;
import java.util.*;

class Main {
  public static void main (String[]args){
      ArrayList<String> matchingWords = Compare.compareTexts();

      int arraySize = matchingWords.size();

      System.out.println("\nThere are " + arraySize + " words within the comparison text that matched those within the source text\n");

      System.out.println(matchingWords + "\n");
  
      //  Method for confirming data type from https://docs.oracle.com/javase/8/docs/api/java/lang/Class.html accessed on the 28th July 2022.
      System.out.println("Here we can confirm that the type of result: " +(matchingWords.getClass().getSimpleName()));

      // Result must be converted to an array of strings in order to use MergeSort algorthim
      String [] matchingWordsArray = matchingWords.toArray(new String[arraySize]);

      // Code for timing algorithms from May 2021 CMT 219 Data and Algorithms lab exercises Week 7
      long start = System.nanoTime();
      
      MergeSort.mergeSort(matchingWordsArray, 0, arraySize-1);

      long end = System.nanoTime();
      long timeTaken = (end - start);
      System.out.println("\nTime taken for the MergeSort algorithm to sort a string array with " + arraySize + " strings is " + timeTaken + " ns.");

      System.out.println("\nHere are those words sorted using a MergeSort algorithm:\n\n" + Arrays.toString(matchingWordsArray));

  }
}