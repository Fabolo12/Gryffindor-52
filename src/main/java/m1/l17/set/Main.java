package m1.l17.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Main {
    static void main() {
        final List<String> wordsList = new ArrayList<>();
        wordsList.add("Hello");
        wordsList.add("Hello");
        wordsList.add("World");
        wordsList.add("From");
        wordsList.add("Java");
        System.out.println(wordsList);

        final Set<String> wordsSet = new HashSet<>();
        wordsSet.add("Hello");
        wordsSet.add("Hello");
        wordsSet.add("World");
        wordsSet.add("From");
        wordsSet.add("Java");
        System.out.println(wordsSet);

        removeMethodOne(wordsList, "Hello");
        System.out.println(wordsList);
        removeMethodTwo(wordsList, "World");
        System.out.println(wordsList);
        removeMethodThree(wordsList, "From");
        System.out.println(wordsList);
    }

    private static void removeMethodOne(final List<String> wordsList, final String wordToRemove) {
        final List<String> newList = new ArrayList<>(wordsList.size());
        for (String word : wordsList) {
            if (word.equals(wordToRemove)) {
                continue;
            }
            newList.add(word);
        }
        wordsList.clear();
        wordsList.addAll(newList);
    }

    private static void removeMethodTwo(final List<String> wordsList, final String wordToRemove) {
        final Iterator<String> iterator = wordsList.iterator();
        while (iterator.hasNext()) {
            final String word = iterator.next();
            if (word.equals(wordToRemove)) {
                iterator.remove();
            }
        }
    }

    private static void removeMethodThree(final List<String> wordsList, final String wordToRemove) {
        for (int i = 0; i < wordsList.size(); i++) {
            final String word = wordsList.get(i);
            if (word.equals(wordToRemove)) {
                wordsList.remove(i);
            }
        }
    }
}
