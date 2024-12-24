# Palindrome Checker

## Project Description
The **Palindrome Checker** is a Java-based project designed to determine whether a given input (string or number) is a palindrome. A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward, ignoring spaces, punctuation, and capitalization.

---

## Features
- Checks if a string or number is a palindrome.
- Ignores case sensitivity and spaces for string inputs.
- Provides a simple and interactive command-line interface.

---

## Prerequisites
- **Java Development Kit (JDK)**: Ensure that JDK 8 or higher is installed on your system.
- **IDE or Text Editor**: Use IntelliJ IDEA, Eclipse, or a text editor like VS Code.
- **Command Line**: Basic understanding of running Java programs from the terminal.

---

## How to Run the Project

### 1. Clone or Download the Project
- Clone the repository or download the source code file `PalindromeChecker.java`.

### 2. Compile the Program
Open your terminal or command prompt, navigate to the directory where the file is saved, and run:
```bash
javac PalindromeChecker.java
```

### 3. Run the Program
Execute the compiled program using:
```bash
java PalindromeChecker
```

### 4. Input Example
The program will prompt you to enter a string or number to check if it's a palindrome. Examples:

- **Input**: "Madam"
  **Output**: "The input is a palindrome."

- **Input**: "Hello"
  **Output**: "The input is not a palindrome."

- **Input**: "12321"
  **Output**: "The input is a palindrome."

---

## Project Structure
```
PalindromeChecker.java
```
This file contains the entire source code for the project.

---

## Code Explanation
1. **User Input**: Prompts the user to enter a string or number.
2. **Sanitization**: Removes spaces and converts strings to lowercase for accurate checks.
3. **Logic**: Compares the original input with its reversed version.
4. **Output**: Displays whether the input is a palindrome.

---

## Example Code Snippet
```java
public static boolean isPalindrome(String input) {
    String sanitizedInput = input.replaceAll("\\s+", "").toLowerCase();
    String reversed = new StringBuilder(sanitizedInput).reverse().toString();
    return sanitizedInput.equals(reversed);
}
```

---

## Enhancements
### Future Improvements
- Add support for ignoring punctuation and special characters.
- Implement a graphical user interface (GUI).
- Enable batch processing for multiple inputs.

---

## License
This project is open-source and available under the MIT License. You are free to use, modify, and distribute the code with proper attribution.

---

## Contact
For queries or suggestions, please contact:
- **Name**: Karthik
- **Email**: karthikchilukoti2004@gmail.com

