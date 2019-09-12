@file:Suppress("unused", "NOTHING_TO_INLINE")

package com.chrynan.queue

inline fun <reified T : Any> queueOf(vararg elements: T): Queue<T> = FIFOQueue<T>().apply { addAll(listOf(*elements)) }

inline fun <reified T : Any> stackOf(vararg elements: T): Stack<T> = LIFOQueue<T>().apply { addAll(listOf(*elements)) }

inline fun <reified T : Any> mutableQueueOf(vararg elements: T): MutableQueue<T> = FIFOQueue<T>().apply { addAll(listOf(*elements)) }

inline fun <reified T : Any> mutableStackOf(vararg elements: T): MutableStack<T> = LIFOQueue<T>().apply { addAll(listOf(*elements)) }

inline fun <reified T : Any> dequeOf(vararg elements: T): Deque<T> = MutableListDeque<T>().apply { addAllFirst(listOf(*elements)) }

inline fun <reified T : Any> mutableDequeOf(vararg elements: T): MutableDeque<T> = MutableListDeque<T>().apply { addAllFirst(listOf(*elements)) }

inline fun <reified T : Any> Collection<T>.toMutableDeque(): MutableDeque<T> {
    val deque = MutableListDeque<T>()

    deque.addAllFirst(toList())

    return deque
}

inline fun <reified T : Any> Collection<T>.toDeque(): Deque<T> {
    val deque = MutableListDeque<T>()

    deque.addAllFirst(toList())

    return deque
}

inline fun <reified T : Any> Collection<T>.toMutableQueue(): MutableQueue<T> {
    val queue = FIFOQueue<T>()

    queue.addAll(toList())

    return queue
}

inline fun <reified T : Any> Collection<T>.toQueue(): Queue<T> {
    val queue = LIFOQueue<T>()

    queue.addAll(toList())

    return queue
}

fun <T : Any> emptyDeque(): Deque<T> = EmptyDeque

fun <T : Any> emptyQueue(): Queue<T> = EmptyQueue

inline fun <T : Any> Collection<T>.toStack(): Stack<T> {
    val queue = LIFOQueue<T>()

    queue.addAll(toList())

    return queue
}

fun <T : Any> emptyStack(): Queue<T> = EmptyStack

inline fun <T : Any> Stack<T>.toMutableStack(): MutableStack<T> =
        if (this is LIFOQueue<T>) this else LIFOQueue<T>().apply { addAll(this) }

inline operator fun <T : Any> Stack<T>.plus(other: T): Stack<T> =
        toMutableStack().apply { push(other) }