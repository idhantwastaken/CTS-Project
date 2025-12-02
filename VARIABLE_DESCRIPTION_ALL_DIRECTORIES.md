# Variable Description Tables - All Directories

---

## ARRAYS DIRECTORY

### 1. ZigZag.java

| DataType | Name | Purpose |
|----------|------|---------|
| `int` | `n` | Stores the size of the array |
| `int[]` | `A` | Array to store the input elements |
| `Scanner` | `sc` | Static Scanner object for reading user input |
| `int` | `size` | Parameter in constructor to initialize array size `n` |
| `int` | `i` | Loop counter for iterating through array elements |
| `int` | `temp` | Temporary variable for swapping array elements |

---

### 2. SymmetricMatrix.java

| DataType | Name | Purpose |
|----------|------|---------|
| `int` | `M` | Stores the order (size) of the square matrix |
| `int[][]` | `A` | 2D array to store the matrix elements |
| `Scanner` | `sc` | Static Scanner object for reading user input |
| `int` | `mm` | Parameter in constructor to initialize matrix size `M` |
| `int` | `i` | Loop counter for iterating through rows |
| `int` | `j` | Loop counter for iterating through columns |
| `int` | `Ldiag` | Stores the sum of the left diagonal (main diagonal) |
| `int` | `Rdiag` | Stores the sum of the right diagonal (anti-diagonal) |

---

### 3. MatrixPrimeSum.java

| DataType | Name | Purpose |
|----------|------|---------|
| `int` | `M` | Stores the number of rows in the matrix |
| `int` | `N` | Stores the number of columns in the matrix |
| `int[][]` | `A` | 2D array to store the matrix elements |
| `int` | `mm` | Parameter in constructor to initialize rows `M` |
| `int` | `nn` | Parameter in constructor to initialize columns `N` |
| `int` | `i` | Loop counter for iterating through rows |
| `int` | `j` | Loop counter for iterating through columns |
| `int` | `num` | Parameter in `isPrime()` method; stores the number to check |
| `int` | `f` | Counter to count the number of divisors in `isPrime()` |
| `int` | `maxRow` | Stores the maximum sum of primes found in a row |
| `int` | `maxCol` | Stores the maximum sum of primes found in a column |
| `String` | `rowIndex` | Stores the index/indices of row(s) with maximum prime sum |
| `String` | `colIndex` | Stores the index/indices of column(s) with maximum prime sum |
| `int` | `sum` | Accumulates the sum of prime numbers in current row/column |

---

### 4. EquilibriumIndices.java

| DataType | Name | Purpose |
|----------|------|---------|
| `int[]` | `A` | Array to store the input elements |
| `int` | `L` | Stores the size/length of the array |
| `Scanner` | `sc` | Static Scanner object for reading user input |
| `int` | `ll` | Parameter in constructor to initialize array size `L` |
| `int` | `i` | Loop counter for iterating through array elements (outer loop) |
| `int` | `j` | Loop counter for calculating left sum (elements before index i) |
| `int` | `k` | Loop counter for calculating right sum (elements after index i) |
| `int` | `ls` | Stores the sum of elements at lower indices (left sum) |
| `int` | `rs` | Stores the sum of elements at higher indices (right sum) |
| `boolean` | `first` | Flag to track if the first equilibrium index has been found |
| `int` | `count` | Counter to track the number of equilibrium indices found |

---

### 5. RotateMatrix.java

| DataType | Name | Purpose |
|----------|------|---------|
| `Scanner` | `sc` | Static Scanner object for reading user input |
| `int[][]` | `A` | 2D array to store the original matrix elements |
| `int` | `m` | Stores the number of rows in the matrix |
| `int` | `n` | Stores the number of columns in the matrix |
| `int` | `mm` | Parameter in constructor to initialize rows `m` |
| `int` | `nn` | Parameter in constructor to initialize columns `n` |
| `int` | `i` | Loop counter for iterating through rows |
| `int` | `j` | Loop counter for iterating through columns |
| `int` | `sum` | Stores the sum of all odd elements in the matrix |
| `int[][]` | `rotmat` | 2D array to store the rotated matrix |
| `int` | `M` | Stores the number of rows input by the user |
| `int` | `N` | Stores the number of columns input by the user |
| `int[][]` | `arr` | Parameter in `display()` method; matrix to be displayed |

---

### 6. DoublyMarkov.java

| DataType | Name | Purpose |
|----------|------|---------|
| `int` | `N` | Stores the order (size) of the square matrix |
| `double[][]` | `M` | 2D array to store the matrix elements |
| `Scanner` | `sc` | Static Scanner object for reading user input |
| `int` | `nn` | Parameter in constructor to initialize matrix size `N` |
| `int` | `i` | Loop counter for iterating through rows |
| `int` | `j` | Loop counter for iterating through columns |
| `boolean` | `flag` | Flag to track whether the matrix is doubly Markov |
| `double` | `rowsum` | Stores the sum of elements in the current row |
| `double` | `colsum` | Stores the sum of elements in the current column |
| `double[]` | `i` | Enhanced for loop variable to iterate through each row |
| `double` | `j` | Enhanced for loop variable to iterate through each element |

---

## NUMBERS DIRECTORY

### 1. DigitCipher.java

| DataType | Name | Purpose |
|----------|------|---------|
| `int` | `n` | Stores the input number to be ciphered |
| `String` | `k` | Stores the key as a string |
| `int` | `l` | Represents the number of digits in input number `n` |
| `int[]` | `ar` | Array to store the rearranged digits of ciphered number |
| `char` | `c` | Temporarily holds a character from the key |
| `int` | `d` | Represents the numeric value of character `c` from the key |
| `int` | `i` | Loop counter for iterating through the key string |

---

### 2. DistinctPrime.java

| DataType | Name | Purpose |
|----------|------|---------|
| `int` | `n` | Stores the input number to be checked |
| `String` | `str` | Stores the string representation of input number `n` |
| `int` | `i` | Loop counter to iterate through each character in string |
| `char` | `ch` | Stores the current character (digit) being checked |

---

### 3. Fascinating.java

| DataType | Name | Purpose |
|----------|------|---------|
| `int` | `num` | Stores the input number to be checked |
| `boolean[]` | `freq` | Array to track which digits (0-9) appear |
| `int` | `n` | Parameter in `extract()` method; number being processed |
| `int` | `r` | Stores the remainder (last digit) when extracting digits |
| `int` | `i` | Loop counter to check if all digits 1-9 are present |
| `int` | `a` | Stores the user input number in `main()` method |

---

### 4. GoldBach.java

| DataType | Name | Purpose |
|----------|------|---------|
| `int` | `n` | Parameter in `isPrime()` method; number to check primality |
| `int` | `i` | Loop counter in `isPrime()` method to check divisibility |
| `int` | `p1` | Stores the first prime number in the Goldbach pair |
| `int` | `p2` | Stores the second prime number (n - p1) |
| `int` | `a` | Stores the user input number in `main()` method |

---

### 5. KeithNumber.java

| DataType | Name | Purpose |
|----------|------|---------|
| `int` | `n` | Stores the input number to be checked |
| `int` | `l` | Stores the number of digits in input number `n` |
| `int[]` | `seq` | Array to store digits of `n` and generated sequence values |
| `int` | `temp` | Temporary variable to extract digits from `n` |
| `int` | `next` | Stores the sum of all elements in current `seq` array |
| `int` | `i` | Loop counter used to iterate through `seq` array |

---

### 6. Hamming.java

| DataType | Name | Purpose |
|----------|------|---------|
| `int` | `n` | Stores the input number to be checked |
| `int[]` | `counter` | Array with 3 elements to count powers of 2, 3, and 5 |
| `int` | `temp` | Temporary variable to store original value of `n` |

---

### 7. UniqueNumbers.java

| DataType | Name | Purpose |
|----------|------|---------|
| `int` | `a` | Stores the number to be checked for unique digits |
| `boolean[]` | `digits` | Array to track which digits (0-9) have appeared |
| `int` | `d` | Stores the remainder (last digit) when extracting digits |
| `int` | `m` | Stores the starting number of the range (inclusive) |
| `int` | `n` | Stores the ending number of the range (inclusive) |
| `String` | `output` | Accumulates the unique-digit integers as formatted string |
| `int` | `count` | Counter to track total unique-digit integers found |
| `int` | `i` | Loop counter to iterate through the range from `m` to `n` |

---

## STRING DIRECTORY

### 1. Anagram.java

| DataType | Name | Purpose |
|----------|------|---------|
| `String` | `s1` | Stores the first input string |
| `String` | `s2` | Stores the second input string |
| `String` | `x` | Parameter in `validate()` and `format()` methods |
| `int` | `i` | Loop counter for iterating through string characters |
| `char` | `c` | Temporarily holds a character from the string in `validate()` |
| `String` | `temp` | Temporary string to build formatted and sorted string |
| `char[]` | `arr` | Array to store characters for sorting in `format()` |
| `int` | `j` | Inner loop counter for bubble sort in `format()` method |
| `char` | `n` | Temporary variable for swapping characters during sort |

---

### 2. InsertWord.java

| DataType | Name | Purpose |
|----------|------|---------|
| `String` | `str` | Parameter in validation, deletion, and insertion methods |
| `String` | `word` | Temporary string to build result in various methods |
| `int` | `i` | Loop counter for iterating through string characters |
| `String` | `temp` | Temporary string to accumulate characters in `insert()` |
| `int` | `count` | Counter to track spaces found in `insert()` method |
| `String` | `wrd` | Stores the word to be inserted |
| `int` | `ind` | Stores the position where the word should be inserted |
| `int` | `j` | Loop counter for copying remaining characters |
| `String` | `sent` | Stores the input sentence |

---

### 3. Pangram.java

| DataType | Name | Purpose |
|----------|------|---------|
| `Scanner` | `sc` | Static Scanner object for reading user input |
| `String` | `sent` | Stores the input sentence |
| `String` | `s` | Parameter in constructor to initialize `sent` |
| `int` | `i` | Loop counter for validation and character checking |
| `String` | `alpha` | String containing all 26 alphabets (ABCD...XYZ) |
| `StringTokenizer` | `st` | Tokenizer to split sentence into words |
| `String` | `temp` | Temporary variable to store current token/word |
| `String` | `lng` | Stores the longest word in the sentence |
| `String` | `sht` | Stores the shortest word in the sentence |

---

### 4. KeywordCipher.java

| DataType | Name | Purpose |
|----------|------|---------|
| `String` | `keyword` | Stores the keyword for cipher decryption |
| `String` | `text` | Stores the text to be decoded |
| `String` | `str` | Parameter in `key()` method; string to process |
| `String` | `word` | Temporary string to build unique characters from input |
| `int` | `i` | Loop counter for iterating through string |
| `String` | `A` | Stores the decryption dictionary mapping |
| `char` | `alpha` | Character variable to track alphabet for dictionary |
| `String` | `decTXT` | Stores the decrypted text being built |

---

### 5. PangrammaticLipo.java

| DataType | Name | Purpose |
|----------|------|---------|
| `Scanner` | `sc` | Static Scanner object for reading user input |
| `String` | `sent` | Stores the input sentence |
| `String` | `s` | Parameter in constructor to initialize `sent` |
| `int` | `i` | Loop counter for validation and character checking |
| `int` | `count` | Counter to track missing alphabets |
| `String` | `alpha` | String containing all 26 alphabets |
| `String` | `missing` | Stores the missing alphabets in the sentence |

---

### 6. SnowBall.java

| DataType | Name | Purpose |
|----------|------|---------|
| `Scanner` | `sc` | Scanner object for reading user input |
| `String` | `str` | Stores the input string |
| `boolean` | `flag` | Flag to track if string is a snowball string |
| `StringTokenizer` | `ob` | Tokenizer to extract words from string |
| `int` | `i` | Loop counter for iterating through tokens |

---

## DATE & TIME DIRECTORY

### 1. Calender.java

| DataType | Name | Purpose |
|----------|------|---------|
| `Scanner` | `sc` | Scanner object for reading user input |
| `int` | `year` | Stores the year input by user |
| `String` | `mon` | Stores the month name input by user |
| `String` | `day` | Stores the weekday name input by user |
| `String[]` | `mNames` | Array containing names of all 12 months |
| `int[]` | `dd` | Array containing number of days in each month |
| `String[]` | `wDays` | Array containing names of all 7 weekdays |
| `int` | `mdex` | Stores the index of the month in `mNames` array |
| `int` | `wdex` | Stores the index of the weekday in `wDays` array |
| `int` | `i` | Loop counter for searching month/weekday index |
| `int` | `d` | Loop counter for iterating through calendar days |

---

### 2. TimeConverter.java

| DataType | Name | Purpose |
|----------|------|---------|
| `Scanner` | `sc` | Scanner object for reading user input |
| `String` | `input` | Stores the time input in 12-hour format |
| `String` | `check` | Stores the AM/PM portion extracted from input |
| `String` | `sthour` | Stores the hour portion as string |
| `String` | `stmin` | Stores the minute portion as string |
| `int` | `hour` | Stores the hour value as integer |
| `int` | `min` | Stores the minute value as integer |

---

### 3. TimeWord.java

| DataType | Name | Purpose |
|----------|------|---------|
| `Scanner` | `sc` | Scanner object for reading user input |
| `int` | `hour` | Stores the hour input by user (1-12) |
| `int` | `min` | Stores the minute input by user (0-59) |
| `String[]` | `no` | Array containing word representation of numbers |
| `int` | `nexthour` | Stores the next hour for "quarter to" cases |

---

### 4. daytodate.java

| DataType | Name | Purpose |
|----------|------|---------|
| `Scanner` | `sc` | Scanner object for reading user input |
| `int` | `d` | Stores the day number input by user |
| `int` | `year` | Stores the year input by user |
| `int` | `dd` | Parameter in `Date()` method; day number to convert |
| `int[]` | `mDays` | Array containing number of days in each month |
| `String[]` | `mNames` | Array containing names of all 12 months |
| `boolean` | `leap` | Boolean to track if year is a leap year |
| `int` | `i` | Loop counter for iterating through months |
| `int` | `daySum` | Accumulates the sum of days up to current month |
| `int` | `date` | Stores the date within the month |
| `String` | `day` | Stores the formatted date string to return |

---

### 5. IDK.java

| DataType | Name | Purpose |
|----------|------|---------|
| `Scanner` | `sc` | Scanner object for reading user input |
| `int` | `d` | Stores the day number input by user |
| `int` | `year` | Stores the year input by user |
| `int` | `n` | Stores the number of days to add |
| `int` | `dd` | Parameter in `Date()` method; day number to convert |
| `int[]` | `mDays` | Array containing number of days in each month |
| `String[]` | `mNames` | Array containing names of all 12 months |
| `boolean` | `leap` | Boolean to track if year is a leap year |
| `int` | `i` | Loop counter for iterating through months |
| `int` | `daySum` | Accumulates the sum of days up to current month |
| `int` | `date` | Stores the date within the month |
| `String` | `dateStr` | Stores the formatted current date string |
| `int` | `nD` | Stores the calculated day number after adding `n` days |
| `int` | `nYear` | Stores the year after adding `n` days |
| `String` | `nDateStr` | Stores the formatted future date string |

---

**Summary:** This comprehensive document contains variable descriptions for all 23 Java programs across 4 directories (Arrays, Numbers, String, Date&Time), with detailed tables organized by directory and file.
