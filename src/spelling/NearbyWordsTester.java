package spelling;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class NearbyWordsTester {

    Dictionary d ;
    NearbyWords nearbyWords;
    List<String> currentList = new ArrayList<String>();
    @Before
    public void setUp() {
        d = new DictionaryBST();
        nearbyWords = new NearbyWords(d);

    }

//    @Test
//    public void testSubstituation() {
//        String word = "hello";
//        d.addWord(word);
//        nearbyWords = new NearbyWords(d);
//        nearbyWords.substitution("hellp", currentList, true);
//        System.out.println(currentList);
//        assertEquals("Test substituation ", "hello", currentList.get(0));
//    }

//    @Test
//    public void testInsertion() {
//        String word = "hello";
//        d.addWord(word);
//        d.addWord("shell");
//        nearbyWords = new NearbyWords(d);
//        nearbyWords.insertions("hell", currentList, true);
//        System.out.println(currentList);
//        assertEquals("Test insertion: ", "hello" , currentList.get(0));
//    }

//    @Test
//    public void testDelete() {
//        String word = "hello";
//        d.addWord(word);
//        nearbyWords = new NearbyWords(d);
//        nearbyWords.deletions("hello", currentList, false);
//        System.out.println(currentList);
//        assertEquals("Test insertion: ", "hello" , currentList.get(0));
//    }

    @Test
    public void testSuggestion() {
        String word = "hellp";
        DictionaryLoader.loadDictionary(d, "data/dict.txt");
        nearbyWords = new NearbyWords(d);
        long startTime = System.nanoTime();
        nearbyWords.suggestions(word, 10);
        long endTime = System.nanoTime();
        System.out.println("it take " + (endTime - startTime) / 1000000000.0 + " seconds");
    }
}
