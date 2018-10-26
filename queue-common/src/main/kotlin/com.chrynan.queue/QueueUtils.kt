@file:Suppress("unused")

package com.chrynan.queue

inline fun <reified T : Any> queueOf(vararg elements: T) = FIFOQueue<T>().apply { addAll(listOf(*elements)) }

inline fun <reified T : Any> stackOf(vararg elements: T) = LIFOQueue<T>().apply { addAll(listOf(*elements)) }

inline fun <reified T : Any> mutableQueueOf(vararg elements: T) = FIFOQueue<T>().apply { addAll(listOf(*elements)) }

inline fun <reified T : Any> mutableStackOf(vararg elements: T) = LIFOQueue<T>().apply { addAll(listOf(*elements)) }

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