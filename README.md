# Groovy String length() method throws NullPointerException on empty string

This repository demonstrates a subtle bug in Groovy related to the `length()` method of the `String` class.  When called on an empty string (""), it unexpectedly throws a `NullPointerException` instead of returning 0.

## Bug Description
The `length()` method of Groovy's String class does not behave as expected when the string is empty.  Instead of gracefully returning 0, it throws a `NullPointerException`.

## Bug Reproduction
The `bug.groovy` file contains code that reproduces this issue. Run this script to see the exception.

## Solution
The `bugSolution.groovy` file provides a corrected version using the `size()` method, which correctly handles empty strings and returns 0.

## Lessons Learned
This highlights the importance of carefully considering edge cases and using appropriate methods for string manipulation in Groovy.  The `size()` method offers more robust handling of empty strings compared to `length()`.
