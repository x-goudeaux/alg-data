import java.util.Set;
import java.util.HashSet;

/**
 * Class that finds sets of words that exhibit various characteristics,
 * such as length, first letter, and double-letters. A java.util.HashSet
 * should be used when a set is needed.
 * 
 * @author Xavier Goudeaux
 *
 */
public class WordFinder
{
	/**
	 * Returns a set of all words from the original set of the corresponding length.
	 * @param words set of words
	 * @param length length of words to include
	 * @return set of words of the right length
	 */
	public Set<String> wordsOfLength(Set<String> words, int length)
	{
		Set<String> newSet = new HashSet<String>();
		
		for(String word : words) {
			if(word.length() == length) {
				newSet.add(word);
			}
		}
		
		return newSet;
	}
	
	/**
	 * Returns a set of words from the original set starting with the specified,
	 * letter. The case of the letter should be ignored.
	 * @param words set of words
	 * @param letter first letter of words to include
	 * @return set of words starting with certain letter
	 */
	public Set<String> wordsStartingWithLetter(Set<String> words, char letter)
	{
		Set<String> newSet = new HashSet<String>();
		
		for(String word : words) {
			if((word.charAt(0) + "").equalsIgnoreCase("" + letter)) {
				newSet.add(word);
			}
		}
		return newSet;
	}
	
	/**
	 * Returns a set of words from the original set that contain a
	 * double (two in a row) of the specified letter. Ignore case.
	 * @param words set of words
	 * @param letter letter that appears twice in a row in each word
	 * @return set of words containing the specified double letter
	 */
	public Set<String> wordsContainingDoubleLetter(Set<String> words, char letter)
	{
		Set<String> newSet = new HashSet <String>();
		
		for(String word : words) {
			for(int i = 0; i < word.length() - 1; i++) {
				if((word.charAt(i) + "").equalsIgnoreCase("" + letter) && word.charAt(i) == word.charAt(i+1)) {
					newSet.add(word);
					break;
				}
			}
		}
	
		return newSet;
	}
	
	/**
	 * Returns a set of all words that contain any double letters.
	 * @param words set of words
	 * @return set containing all words with double letters in them
	 */
	public Set<String> allWordsContainingDoubleLetters(Set<String> words)
	{
		Set<String> newSet = new HashSet<String>();
		
		for(String word : words) {
			for(int i = 0; i < word.length() - 1; i++) {
				if(word.charAt(i) == word.charAt(i+1)) {
					newSet.add(word);
					break;
				}
			}
		}
		return newSet;
	}
	
	/**
	 * Returns an array of all sets of words containing double letters,
	 * one set for each letter of the alphabet. There should be a set
	 * for all words containing "aa", one for "bb", etc.
	 * @param words set of words
	 * @return array of sets, one for each doubled letter in the alphabet
	 */
	public Set<String>[] allWordSetsContainingDoubleLetters(Set<String> words)
	{	
		Set<String>[] arrayOfSets = new Set[26];
		int i = 0;
		for(char ch = 'a'; ch <= 'z'; ch++) {
			Set<String> newSet = wordsContainingDoubleLetter(words, ch);
			arrayOfSets[i] = newSet;
			i++;
		}
		
        return arrayOfSets;  
	}

	/**
	 * Returns a set containing all words with two, different double-letters.
	 * @param sets array of all double-letter sets
	 * @return set of all words containing two double-letters
	 */
	public Set<String> wordsContainingTwoDoubleLetters(Set<String>[] sets)
	{
		
		Set<String> newSet = new HashSet<String>();
		Set<String> intersection;
		
		for(Set<String> set1 : sets) {
			for(Set<String> set2: sets) {
				if(set1 != set2){
					intersection = new HashSet<String>(set1);
					intersection.retainAll(set2);
					newSet.addAll(intersection);
				}
			}
		}	
		
		
		return newSet;
	}
	
	/**
	 * Returns a set containing all words with three, different double-letters.
	 * @param sets array of all double-letter sets
	 * @return set of all words containing three double-letters
	 */
	public Set<String> wordsContainingThreeDoubleLetters(Set<String>[] sets)
	{
		Set<String> intersection;
		
		Set<String> newSet = new HashSet<String>();
		
		for(Set<String> set1 : sets) {
			for(Set<String> set2 : sets) {
				for(Set<String> set3 : sets) {
					if(set1 != set2 && set2 != set3 && set1 != set3) {
						intersection = new HashSet<String>(set1);
						intersection.retainAll(set2);
						intersection.retainAll(set3);
						
						newSet.addAll(intersection);
					}
					
				}
			}
		}
		
		return newSet;
	}
}
