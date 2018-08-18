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
        String text1 = "How are How";
        markovTextGeneratorLoL.train(text1);
        assertEquals("Train: create correct number of ListNode object", 2, markovTextGeneratorLoL.getWordListSize());

        markovTextGeneratorLoL = new MarkovTextGeneratorLoL(new Random(42));
        String text2 = "Hello?  Hello there.  This is a test.  Hello there.  Hello Bob.  Test again.";
        markovTextGeneratorLoL.train(text2);
        assertEquals("Train: create correct number of ListNode object", 10, markovTextGeneratorLoL.getWordListSize());
    }

    @Test
    public void testGeneratorText() {
        markovTextGeneratorLoL = new MarkovTextGeneratorLoL(new Random(42));
        String text2 = "You say yes, I say no, "+
                "You say stop, and I say go, go, go, "+
                "Oh no. You say goodbye and I say hello, hello, hello, "+
                "I don't know why you say goodbye, I say hello, hello, hello, "+
                "I don't know why you say goodbye, I say hello. "+
                "I say high, you say low, "+
                "You say why, and I say I don't know. "+
                "Oh no. "+
                "You say goodbye and I say hello, hello, hello. "+
                "I don't know why you say goodbye, I say hello, hello, hello, "+
                "I don't know why you say goodbye, I say hello. "+
                "Why, why, why, why, why, why, "+
                "Do you say goodbye. "+
                "Oh no. "+
                "You say goodbye and I say hello, hello, hello. "+
                "I don't know why you say goodbye, I say hello, hello, hello, "+
                "I don't know why you say goodbye, I say hello. "+
                "You say yes, I say no, "+
                "You say stop and I say go, go, go. "+
                "Oh, oh no. "+
                "You say goodbye and I say hello, hello, hello. "+
                "I don't know why you say goodbye, I say hello, hello, hello, "+
                "I don't know why you say goodbye, I say hello, hello, hello, "+
                "I don't know why you say goodbye, I say hello, hello, hello,";
        markovTextGeneratorLoL.train(text2);
        assertEquals("generatorText: Create correct number of text ", 20, markovTextGeneratorLoL.generateText(30));
    }
}


