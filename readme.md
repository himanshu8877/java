# Java Factorial

A small Java repository containing a simple command-line program that computes the factorial of a non-negative integer using BigInteger for large results.

## Files

- `factorial.java` - Console program that prompts for a non-negative integer and prints its factorial.

## Requirements

- Java 8 or later

## Build & Run

Compile and run from the repository root:

```bash
javac factorial.java
java factorial
```

Example run:

```
Enter a non-negative integer: 20
20! = 2432902008176640000
```

## Notes

- The program uses `BigInteger` to support large factorials that exceed 64-bit range.
- Input is validated for non-integer and negative values.

## Contributing

Contributions are welcome — open an issue or submit a pull request.

## License

This repository has no license specified. Add a LICENSE file if you want to set one.
