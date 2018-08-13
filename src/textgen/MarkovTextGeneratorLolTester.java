package textgen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.Random;


public class MarkovTextGeneratorLolTester {
    MarkovTextGeneratorLoL markovTextGeneratorLoL;


    @Before
    public void setUp() {
        markovTextGeneratorLoL = new MarkovTextGeneratorLoL(new Random(42));

    }

    @Test
    public void testTrain() {
        String text1 = "How are you";
        markovTextGeneratorLoL.train(text1);
        assertEquals("Train: create correct number of ListNode object", 3, markovTextGeneratorLoL.getWordListSize());
    }
}


