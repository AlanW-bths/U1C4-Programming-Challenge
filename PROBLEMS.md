# Programming Challenge: Problems

Write each method below in `src/main/java/Solution.java`. Every method
**returns** its answer - do not print anything and do not read input with a
`Scanner`. The official tests call your methods directly and check what they
return.

Do not change any method's name or parameters, or the tests won't be able to
call it.

You can use the Java reference sheet (See Google Classroom)

Run `mvn clean test` at any time to see which tests pass.

## Problem 1: Ends in "ly"

```java
public boolean endsLy(String x)
```

Return `true` if the string ends in `"ly"`, otherwise return `false`.

The string can be empty `""`

```java
endsLy("oddly");   // returns true
endsLy("y");       // returns false
endsLy("oddy");    // returns false
```

Hint: a string shorter than 2 characters can't end in `"ly"`.

---

## Problem 2: Concatenation

```java
public String conCat(String s1, String s2)
```

Append the two strings together (this is called **concatenation**) and
return the result. However, if the last char of `s1` is the same as the first
char of `s2`, leave out one of the doubled chars.

```java
conCat("abc", "cat");   // returns "abcat"
conCat("dog", "cat");   // returns "dogcat"
conCat("abc", "");      // returns "abc"
```

Hint: either string might be empty.

---

## Problem 3: Without X

```java
public String withoutX(String s1)
```

If the first or last char is `'x'`, return the string without those `'x'`
chars. Otherwise return the string unchanged.
`s1` will always have at least 2 chars.

```java
withoutX("xHix");   // returns "Hi"
withoutX("xHi");    // returns "Hi"
withoutX("Hxix");   // returns "Hxi"
```

Hint: you don't have to handle every case at once. Check the front first,
then check the end of what's left.

---

## Problem 4: Fizz String

```java
public String fizzString(String s1)
```

If the string starts with `"f"`, return `"Fizz"`. If the string ends with
`"b"`, return `"Buzz"`. If **both** are true, return `"FizzBuzz"`. In all
other cases, return the string unchanged.
`s1` will always have at least 1 char.

```java
fizzString("fig");   // returns "Fizz"
fizzString("dib");   // returns "Buzz"
fizzString("fib");   // returns "FizzBuzz"
```

---

## Problem 5: Fizz String 2

```java
public String fizzString2(int x)
```

Return the number as a String followed by `"!"`, so `6` gives `"6!"`.
Except:

- if the number is divisible by 3, use `"Fizz"` instead of the number
- if the number is divisible by 5, use `"Buzz"` instead of the number
- if the number is divisible by **both** 3 and 5, use `"FizzBuzz"`

```java
fizzString2(1);    // returns "1!"
fizzString2(2);    // returns "2!"
fizzString2(3);    // returns "Fizz!"
fizzString2(5);    // returns "Buzz!"
fizzString2(15);   // returns "FizzBuzz!"
```

Hint: the `%` (mod) operator gives the remainder after division, so
`23 % 10` is `3`. What is the remainder when one number divides **evenly**
into another?
