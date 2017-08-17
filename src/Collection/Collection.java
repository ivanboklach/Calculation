package Collection;

import java.io.*;
import java.util.*;

class CalcWords
{

    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(new File("text.txt"));
        Map<String, Integer> stat = new TreeMap<>();
        while (scanner.hasNext()) {
            String word = scanner.useDelimiter("\\s+").next();
            Integer count =  stat.get(word);
            if (count == null) {
                count = 0;
            }
            stat.put(word, ++count);
        }
        System.out.println(stat);
    }
}
