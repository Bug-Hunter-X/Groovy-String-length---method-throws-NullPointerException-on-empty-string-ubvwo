```groovy
def myMethod(String input) {
  if (input == null) {
    return "Null input"
  } else if (input.size() == 0) {
    return "Empty input"
  } else {
    return input.toUpperCase()
  }
}

println myMethod(null) // Output: Null input
println myMethod("") // Output: Empty input
println myMethod("hello") // Output: HELLO
```