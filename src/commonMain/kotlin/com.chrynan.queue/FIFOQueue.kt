package com.chrynan.queue

class FIFOQueue<T : Any> : MutableListDeque<T>(),
        Collection<T>,
        Queue<T>,
        MutableQueue<T> {

    override fun peek() = peekFirst()

    override fun peekOrNull() = peekFirstOrNull()

    override fun add(element: T) = addLast(element)

    override fun addAll(elements: Collection<T>) = addAllLast(elements)

    override fun remove() = removeFirst()
}