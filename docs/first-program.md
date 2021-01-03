## Lets write a program

### Prerequisites

If you haven't done the `install` and `overview` pages of this guide yet, do those first:

- https://github.com/olivercodes/programming-intro/blob/master/README.md
- https://github.com/olivercodes/programming-intro/blob/master/sec-2-tools-overview.md

### Getting Started

- First, open VS Code. 
- Go to the top of your screen, click `File > New File`
- On your keyboard, type `cmd + s`(command and s) which is a shortcut for save
- Give the file a name, lets call it `my_first_program.js`

### About our program

You may have noticed the .js at the end of that file name.

That extension is short for javascript. We are going to write some JavaScript!

### How to run Javascript

To run JavaScript in VS Code, we need either a JavaScript runtime, or a VS Code Extension that will run it. In our case, for this example, we are going to use the extension.
Click the box on the left side (it looks like a box floating away from 3 other boxes). In the search bar, type `code runner`

The first result should show a program called Code Runner, and have a logo that has `.run`in the middle of it. Click that program, and then click `install` in Code Runners main page on the right. 

Now go back to your `my_first_program.js` file, and we can get to the coding.


### Lets write some code!

In your new file, put the following lines of code

```
// this is a hello world program
console.log('Hello World');
```

Make sure you save (cmd+s)! Then type `control + option + n` (ignore the pluses, just meant to show you need to press all 3 keys).

On the bottom of your screen, a small window should open that says "Output", and beneath that you should see something like this:
```
[Running] node "/Users/a6277/my_first_program.js"
hello world!

[Done] exited with code=0 in 0.039 seconds
```

If so, CONGRATULATIONS, you have just run your first program.
