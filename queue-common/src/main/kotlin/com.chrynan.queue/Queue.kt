package com.chrynan.queue

interface Queue<out T : Any> : Collection<T> {

    fun peek(): T

    fun peekOrNull(): T?
}