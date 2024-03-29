This repo hosts code following the course [Data structures: Measuring and Optimizing Performance](https://www.coursera.org/learn/data-structures-optimizing-performance) 

| ![](https://raw.githubusercontent.com/duyhustvn/java_datastruct_algo_ide/master/images/ide.gif) |
|:--:| 
|*demo.gif*|


## REQUIREMENT 
1. Oracle jdk 8 

## How to run
### Using command line
1. Go to the root of project
2. Compile the application

``` sh
javac -cp src:lib/hamcrest-core-1.3.jar:lib/richtextfx-fat-0.6.10.jar src/application/MainApp.java
```
3. Run 

``` sh
java -cp src:lib/hamcrest-core-1.3.jar:lib/richtextfx-fat-0.6.10.jar application.MainApp
```

### Using eclipse 
1. Create a new Java Project in your workspace 
2. Import the starter files: File -> Import -> Select "File System" -> Next -> Browse and set root directory to folder contents of zip were extracted to -> Finish

NOTE: App will load file data/dict.txt for list of words. You can add words to the file 

## FILES BY WEEK 

Below are the files introduced in each week and used in each week
of the course. See file for description...

Week 1 : Introduction and Working with Strings
==============================================
document.Document.java
document.BasicDocument.java

Week 2 : Efficiency Analysis and Benchmarking
=============================================
document.EfficientDocument.java

Week 3 : Interfaces, Linked Lists vs. Arrays, and Correctness
=============================================================
textgen.MyLinkedList*.java
textgen.MarkovTextGenerator.java
textgen.MarkovTextGenerator*.java

Week 4 : Trees! (including Binary Search Trees and Tries)
=========================================================
spelling.SpellingSuggest.java
spelling.AutoComplete.java
spelling.Dictionary.java
spelling.Dictionary*.java
spelling.AutoCompleteDictionaryTrie.java
spelling.TrieNode.java

Week 5 : Hash Maps and Edit Distance
====================================
spelling.WordPath.java
spelling.NearbyWords.java
spelling.WPTree.java

Feel free to use another IDE or manually compile and run your programs.
If you need help, google is your friend.

-----------------------------------------------------[ ACKNOWLEDGEMENTS]--

A big thank you to Tomas Mikula for creating RichTextFX 
which was used as the text area in the GUI application.
(Link: https://github.com/TomasMikula/RichTextFX)


