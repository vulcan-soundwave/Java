package objectAnalyzer;

import java.util.ArrayList;

/**
 * This program uses reflection to spy on objects.
 * @version 1.12 2018-03-12 Mon.
 * @author soundwave
 */

public class ObjectAnalyzerTest
{
   public static void main(String[] args)
   {
      ArrayList<Integer> squares = new ArrayList<>();
      for (int i = 1; i <= 5; i++)
         squares.add(i * i);
      System.out.println(new ObjectAnalyzer().toString(squares));
   }
}