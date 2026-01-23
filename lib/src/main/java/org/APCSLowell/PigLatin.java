package org.APCSLowell;

public class PigLatin {
    public int findFirstVowel(String sWord) {
        //precondition: sWord is a valid String of length greater than 0.
        //postcondition: returns the position of the first vowel in sWord.  If there are no vowels, returns -1
	    for(int i=0; i<word.length();i++){
    if(sWord.substring(i,i+1).equals("a"))
    return i;
    if(sWord.substring(i,i+1).equals("e"))
    return i;
    if(sWord.substring(i,i+1).equals("i"))
    return i;
    if(sWord.substring(i,i+1).equals("u"))
    return i;
    if(sWord.substring(i,i+1).equals("o"))
    return i;
  }
        return -1;
    }

    public String pigLatin(String sWord) {
        //precondition: sWord is a valid String of length greater than 0
        //postcondition: returns the pig latin equivalent of sWord
		for (int i=0; i<sWord.length(); i++){
			if (findFirstVowel(sWord)==0)
				return sWord + "way";
			return (sWord.substring(findFirstVowel(sWord),sWord.length())+sWord.substring(0,findFirstVowel(sWord))+"ay");
		}
        return null;
    }
}
