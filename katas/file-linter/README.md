## File Linter Kata

The goal of this kata, is to create an executable script, that lints files for line length.

### Requirements

1. Lines must not exceed 80 characer spaces long
2. Lines that do exceed 80, are printed to the output
3. Outputted lines, print the Line Number, Line Length

Bonus: accept a flag that optionally allows user to print the actual line content

### Input

The program should accept 1 input, a file name

` ./linter <file_path>/<file_name>`

### Output

Output, should be as follows

```
Lines greater than 55 Characters Long
#####################################

ln: 4, length: 55
ln: 7, length: 101
ln: 30, length: 72
```

### Error

Error cases that should be handled

1. File not found
