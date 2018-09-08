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

    @Test
    public void testSubstituation() {
        String word = "hello";
        d.addWord(word);
        nearbyWords = new NearbyWords(d);
        nearbyWords.substitution("hellp", currentList, true);
        assertEquals("Test substituation ", "hello", currentList.get(0));
    }
}
