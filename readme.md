# Java Factorial

A small Java repository containing a simple command-line program that computes the factorial of a non-negative integer using BigInteger for large results.

## Files

- `factorial.java` - Console program that prompts for a non-negative integer and prints its factorial.
 - `calculator.java` - Interactive basic calculator (add, subtract, multiply, divide) with input validation.

## Requirements

- Java 8 or later

## Build & Run

Compile and run programs from the repository root.

Factorial:

```bash
javac factorial.java
java factorial
```

Calculator:

```bash
javac calculator.java
java calculator
```

Example run:

```
Enter a non-negative integer: 20
20! = 2432902008176640000
```

Calculator example session:

```
Basic Calculator

Choose operation:
1) Add (+)
2) Subtract (-)
3) Multiply (*)
4) Divide (/)
5) Quit
Enter choice (1-5): 1
Enter first number: 4.5
Enter second number: 2
4.5 + 2.0 = 6.5
```

## Notes

- The program uses `BigInteger` to support large factorials that exceed 64-bit range.
- Input is validated for non-integer and negative values.

## Contributing

Contributions are welcome — open an issue or submit a pull request.

## License

This repository has no license specified. Add a LICENSE file if you want to set one.
