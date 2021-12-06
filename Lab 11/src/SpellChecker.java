import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;
/**
 * SpellChecker class that uses a dictionary file and performs 
 * spellchecking on English words, returning the top 3 suggested
 * spellings for misspelled words based on their usage frequency
 * and within a maximum edit distance of 1. The total suggestions
 * returned and the maximum edit distance used are configurable.
 * 
 * @author Xavier Goudeaux
 *
 */
public class SpellChecker
{
	private int maxEditDistance;
	private int totalSuggestions;
	Map<String, Long> dictionary;

	/**
	 * Constructs a SpellChecker object using the provided path
	 * to a dictionary file. Initializes default behavior with
	 * total suggestions of 3 and max edit distance of 1
	 * 
	 * @param path dictionary file path
	 * @throws FileNotFoundException 
	 */
	public SpellChecker(String path) throws FileNotFoundException
	{
		// Initialize defaults for each
		// call readDictionaryFile
		maxEditDistance = 1;
		totalSuggestions = 3;
		dictionary = new TreeMap<String, Long>();
		readDictionaryFile(path);
	}

	/**
	 * Reads a dictionary file and stores it in a map.
	 * Each line in the dictionary contains a string and a long integer value.
	 * The string is the word and the long is the frequency the word occurs
	 * in the English language relative to other words. The larger the frequency
	 * value, the more commonly used the word is.
	 * 
	 * If reading fails for any reason, a message should be printed to the
	 * console that indicates there was a problem reading the file along
	 * with the message obtained from any exception that was caught.
	 * 
	 * @param path dictionary file path
	 * @throws FileNotFoundException 
	 */
	private void readDictionaryFile(String path) throws FileNotFoundException
	{
		// implement me
		 Scanner scanner = new Scanner(new File(path));
		 
		 
	
		 while(scanner.hasNext()) {
			 String line = scanner.nextLine();
			 
			 char[] array = line.replaceAll(" ", "").toCharArray();
			 
			 String key = "";
			 String frequency = "";
			 
			 for(int i = 0; i < array.length; i++) {
				if(Character.isLetter(array[i])) {
					key += array[i];
				}
				if(Character.isDigit(array[i])) {
					frequency += array[i];
				}
			 }
			 
			 dictionary.put(key , Long.parseLong(frequency)); 
		 }
		 scanner.close();
		 
	}

	/**
	 * Sets the maxEditDistance instance variable.
	 * @param maxEditDistance the max edit distance
	 */
	public void setMaxEditDistance(int maxEditDistance)
	{
		this.maxEditDistance = maxEditDistance;
	}

	/**
	 * Sets the totalSuggestions instance variable.
	 * @param totalSuggestions the total number of spelling suggestions to return
	 */
	public void setTotalSuggestions(int totalSuggestions)
	{
		// implement me
		this.totalSuggestions = totalSuggestions;
	}

	/**
	 * Gets the frequency value for the specified word.
	 * @param word word to lookup
	 * @return frequency value as a long integer
	 */
	public long getFrequencyForWord(String word)
	{
		// implement me
		return dictionary.get(word);
	}
	
	/**
	 * Returns the number of words in the dictionary.
	 * @return number of words in dictionary
	 */
	public int size()
	{
		// implement me
		return dictionary.size();
	}

	/**
	 * Returns a list of the misspelled words in the provided array of words.
	 * @param words words to check
	 * @return list of misspelled words found in the array
	 */
	public List<String> listMisspellings(String[] words)
	{
		List<String> misspellings = new ArrayList<String>();
		for(String word: words) {
			if(dictionary.get(word) == null) {
				misspellings.add(word);
			}
		}
		
		return misspellings;
	}

	/**
	 * Returns a list of suggested words for a misspelled word.
	 * It limits the number of words returned to the maximum number
	 * indicated by totalSuggestions. Further, it returns up to 
	 * totalSuggestions in the list orders from largest to smallest
	 * frequency.
	 * 
	 * @param word the word to return correct spelling suggestions for
	 * 
	 * @return list of up to totalSuggestions in number of suggested 
	 * correct spellings, ordered from highest to lowest frequency.
	 */
	public List<String> makeSuggestions(String word)
	{
		List<String> suggestions = new ArrayList<String>();
		List<Long> orderedFreq = new ArrayList<Long>();
		List<String> trueList = new ArrayList<String>();
	
		for(String key : dictionary.keySet()) {
			if(editDistance(word, key) <= maxEditDistance) {
				suggestions.add(key);
			}
		}
		
		for(int i = 0; i < suggestions.size(); i++) {
			orderedFreq.add(dictionary.get(suggestions.get(i)));
		}
		Collections.sort(orderedFreq, Collections.reverseOrder()); //sorts frequencies
		
		for(Long value: orderedFreq) {
			for(String suggested: suggestions) {
				if(value == dictionary.get(suggested)) {
					trueList.add(suggested);
				}
			}
			if(trueList.size() == totalSuggestions) {
				break;
			}
				
		}
		
		return trueList;
	}

	///////////////////////////////////////////////////////////////////////
	///////////////// NO CHANGES NEEDED BEYOND THIS POINT /////////////////

	/**
	 * Returns a string representing information about the size of the dictionary.
	 */
	public String toString()
	{
		return "There are " + dictionary.size() + " words in the dictionary";
	}

	/**
	 * Calculates the "edit distance" between two strings. This is the count of 
	 * the number of individual characters that one must remove, add, or change 
	 * to transform the first string into the second string.
	 * 
	 * @param str1 First string
	 * @param str2 Second string
	 * @return edit distance between two strings
	 */
	public int editDistance(String str1, String str2)
	{
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();

		// memoize only previous line of distance matrix
		int[] prev = new int[s2.length + 1];

		for (int j = 0; j < s2.length + 1; j++)
		{
			prev[j] = j;
		}

		for (int i = 1; i < s1.length + 1; i++)
		{
			// calculate current line of distance matrix
			int[] curr = new int[s2.length + 1];
			curr[0] = i;

			for (int j = 1; j < s2.length + 1; j++)
			{
				int d1 = prev[j] + 1;
				int d2 = curr[j - 1] + 1;
				int d3 = prev[j - 1];
				if (s1[i - 1] != s2[j - 1])
				{
					d3 += 1;
				}
				curr[j] = Math.min(Math.min(d1, d2), d3);
			}

			// define current line of distance matrix as previous
			prev = curr;
		}
		return prev[s2.length];
	}
}
