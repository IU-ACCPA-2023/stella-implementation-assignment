# stella-implementation-assignment
Template for an assignment of implementing Stella programming language.

[Documentation](doc/) for this language and its syntax structure can be found in the corresponding folder.

This template contains skeleton implementations for an interpreter of Stella implemented in several languages:
* [C++](C++/)
* [Java](Java/)
* [JavaScript](JavaScript/)
* [OCaml](OCaml/)
* [Python](Python/)

Your task is to select any of these languages and complete it, making the tests pass. Alternatively, you may implement a new interpreter in any language of your choice from scratch, if you wish.


### Building and running the interpreter

1. Change the first line in the [Makefile](Makefile) to match the language of your choice.

2. To build the interpreter run:

```sh
make
```

This typically involves running BNFC converter, and compiling the project in the chosen language,
resulting in an executable `${LANGUAGE}/interpreter` that you can now use to interpret untyped expressions with functions.

3. Now, to run the type checker:

```sh
make typecheck
```

This starts the type checker waiting to input the program.

4. To run the interpreter:

```sh
make interpret <filename>
```

This starts the interpreter reading the program from the input file and waiting for the input of the argument for the _main_ function.

### Generating the PDF with syntax description

Run BNF converter with `--latex` option and use `pdflatex` or `latexmk` to compile a PDF.
Assuming you have `latexmk` and `pdflatex` installed, you can simply run

```sh
make syntax-pdf
```

This will generate PDF files `${LANGUAGE}/doc/Syntax/Normal.pdf` and `${LANGUAGE}/doc/Syntax/Nameless.pdf`.

