# queue
Stack, Queue, and Deque Data Structures for Kotlin

[![](https://jitpack.io/v/chRyNaN/queue.svg)](https://jitpack.io/#chRyNaN/queue)

## Building

**Kotlin Common:**
```groovy
implementation 'com.github.chRyNaN.queue:queue-common:VERSION'
```

**JVM:**
```groovy
implementation 'com.github.chRyNaN.queue:queue-jvm:v0.1.1'
```

**JS:**
```groovy
implementation 'com.github.chRyNaN.queue:queue-js:v0.1.1'
```

## Using the library

The API is similar to the `kotlin.collections` API.

**Stack (LIFO Queue):**
```kotlin
val stack = stackOf(itemOne, itemTwo, itemThree)
stack.push(itemFour)
val item = stack.pop() // itemFour
```

**Queue (FIFO Queue):**
```kotlin
val queue = queueOf(itemOne, itemTwo, itemThree)
queue.push(itemFour)
val item = queue.pull() // itemOne
```

**Deque (Double-ended Queue):**
```kotlin
val deque = dequeOf(itemOne, itemTwo, itemThree)
deque.removeFirst() // itemOne
deque.removeLast() // itemThree
```