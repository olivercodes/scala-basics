## File Linter Kata

The goal of this kata, is to create an executable script, that prints all lines and their line numbers.

### Requirements

1. All lines in the file are printed
2. Line number is provided on the left column
3. Line length is also provided on the left column
4. You must calculate the padding required, such that the left column is properly aligned for the entire output

### Input

The program should accept 1 input, a file name

` ./code-output <file_path>/<file_name>`

### Output

Output, should be as follows

Note: in the first line below, 22 is the line length, 1 is the line number
```
22 1 | import scala.io.Source
41 2 | import scala.collection.immutable.Treemap
 0 3 | 
```

### Error

Error cases that should be handled

1. File not found
