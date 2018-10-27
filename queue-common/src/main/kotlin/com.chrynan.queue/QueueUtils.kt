@file:Suppress("unused")

package com.chrynan.queue

inline fun <reified T : Any> queueOf(vararg elements: T): Queue<T> = FIFOQueue<T>().apply { addAll(listOf(*elements)) }

inline fun <reified T : Any> stackOf(vararg elements: T): Queue<T> = LIFOQueue<T>().apply { addAll(listOf(*elements)) }

inline fun <reified T : Any> mutableQueueOf(vararg elements: T): MutableQueue<T> = FIFOQueue<T>().apply { addAll(listOf(*elements)) }

inline fun <reified T : Any> mutableStackOf(vararg elements: T): MutableQueue<T> = LIFOQueue<T>().apply { addAll(listOf(*elements)) }

inline fun <reified T : Any> dequeOf(vararg elements: T): Deque<T> = MutableListDeque<T>().apply { addAllFirst(listOf(*elements)) }

inline fun <reified T : Any> mutableDequeOf(vararg elements: T): MutableDeque<T> = MutableListDeque<T>().apply { addAllFirst(listOf(*elements)) }

inline fun <reified T : Any> Deque<T>.toMutableDeque(): MutableDeque<T> {
    val deque = MutableListDeque<T>()

    deque.addAllFirst(toList())

    return deque
}

inline fun <reified T : Any> MutableDeque<T>.toDeque(): Deque<T> {
    val deque = MutableListDeque<T>()

    deque.addAllFirst(toList())

    return deque
}

inline fun <reified T : Any> Queue<T>.toMutableQueue(): MutableQueue<T> {
    val queue = FIFOQueue<T>()

    queue.addAll(toList())

    return queue
}

inline fun <reified T : Any> MutableQueue<T>.toQueue(): Queue<T> {
    val queue = LIFOQueue<T>()

    queue.addAll(toList())

    return queue
}