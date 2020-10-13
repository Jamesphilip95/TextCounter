# Text Counter

Written by James Philip 13/10/2020

----

## Project Description

This API, written in Java, reads the contents of a plain text file and displays the total number of words, the average word length, the most frequently occurring word length and a list of the number of words of each length.

----

## Instillation Instructions

- Unzip file or clone from gitHub https://github.com/Jamesphilip95/TextCounter.git
- Open the folder in your IDE of choice.
- Add the text files you wish to count into the resources folder.  
- To count one of the text files (only one file can be counted at a time). Type the file name in quotation marks into the countText method in the starter class located in the controller package.
    - For example: The file HolyBible.txt -> countText("HolyBible.txt")
- To run the program, run the starter class. The results will be outputted into the terminal.
- If you want to count large text files you may have to change your IDE's settings. For IntelliJ. Click 'Help' -> 'Edit Custom Properties' -> then type in "idea.max.intellisense.filesize=999999" into the properties file -> restart IntelliJ

----

# Assumptions

- All letters in the alphabet and whole numbers are counted as letters.
- Special characters are not counted as letters. The only specials charactors not omitted are:
  - "-", counts as a letter. i.e "part-time" is  one word, 9 letters.
  - "&", counts as a one letter word. 
  - "/", counts as letter. It can be used to join words together i.e "one/two" is one word, 7 letters. Or date format i.e "09/07/2020" is one word, 10 letters.
  - "£" and "$" are characters that are counted when money is present i.e "£20,000" is 1 word, 6 letters and "£1.60" is 1 word, 4 letters (comma/dot not counted).
  - "%" are counted for percentages i.e "78%" is one word, 3 letters.
  - "+" and "-" are counted for scientific numbers i.e "1.23E+10" is one word, 7 letters. 
  
- Blank spaces, new lines and new tabs are all not counted as letters or words.
