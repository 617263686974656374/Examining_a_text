# Examining_a_text
This Java program is designed to analyze a sentence inputted by the user and count different types of characters within it, specifically vowels, consonants, punctuation marks, and spaces. The program defines arrays for vowels and various punctuation marks. When the user inputs a sentence, the program converts it to lowercase and then iterates through each character. 

For each character, the program checks if it is a vowel, punctuation mark, or space, and increments the respective counter. If the character is none of these and is a letter, it increments the consonant counter. This distinction is made using efficient searching techniques for vowels and punctuation marks and the `Character.isLetter` method for consonants. After processing the entire sentence, the program outputs the counts of vowels, consonants, punctuation marks, and spaces.

This program is useful for text analysis, providing basic statistics about the composition of the inputted sentence, which can be applied in fields like linguistics, education, or even programming.
