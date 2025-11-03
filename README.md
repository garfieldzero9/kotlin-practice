# Kotlin Practice

A collection of Kotlin programming exercises and solutions for learning and practicing Kotlin.

## 📋 Overview

This project serves as a personal practice ground for learning Kotlin programming language. It contains various coding challenges, algorithms, and data structure implementations to improve Kotlin proficiency.

## 🛠️ Tech Stack

- **Language:** Kotlin
- **Build Tool:** Gradle 9.1.0
- **Java Version:** 17
- **Testing Framework:** Kotlin Test 2.2.0

## 📁 Project Structure

```
kotlin-practice/
├── app/
│   ├── src/
│   │   ├── main/kotlin/org/example/
│   │   │   ├── App.kt              # Main application entry point
│   │   │   └── easy/
│   │   │       └── TwoSum.kt       # Two Sum problem implementations
│   │   └── test/kotlin/org/example/
│   │       └── easy/
│   │           └── TwoSumTest.kt   # Tests for Two Sum
│   └── build.gradle.kts
├── gradle/
├── gradlew
├── gradlew.bat
└── settings.gradle.kts
```

## 🚀 Getting Started

### Prerequisites

- Java Development Kit (JDK) 17 or higher
- Gradle (included via wrapper)

### Running the Application

```bash
./gradlew run
```

### Running Tests

```bash
./gradlew test
```

### Building the Project

```bash
./gradlew build
```

## 📚 Practice Problems

### Easy

- **Two Sum** - Find two numbers in an array that add up to a target value
  - Implementation 1: Brute force approach (O(n²))
  - Implementation 2: Hash map approach (O(n))

## 🧪 Testing

Tests are written using Kotlin Test framework and can be found in the `app/src/test` directory. Each solution includes corresponding test cases to verify correctness.

## 📝 Learning Resources

- [Kotlin Official Documentation](https://kotlinlang.org/docs/home.html)
- [Kotlin Koans](https://play.kotlinlang.org/koans)
- [LeetCode](https://leetcode.com/) - Algorithm practice problems

## 🎯 Goals

- Practice Kotlin syntax and idioms
- Implement common algorithms and data structures
- Improve problem-solving skills
- Write clean, idiomatic Kotlin code
- Learn testing best practices in Kotlin

## 📄 License

This project is licensed under the terms specified in the LICENSE file.

## 🤝 Contributing

This is a personal practice repository. Feel free to fork it for your own learning purposes!

---

**Note:** This is a work in progress. New problems and solutions will be added regularly as part of ongoing Kotlin learning journey.