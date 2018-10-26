package com.chrynan.queue

class LIFOQueue<T : Any> : MutableListDeque<T>(),
        Collection<T>,
        Queue<T>,
        MutableQueue<T> {

    override fun iterator() = descendingIterator()

    override fun peek() = peekLast()

    override fun peekOrNull() = peekLastOrNull()

    override fun add(element: T) = addLast(element)

    override fun addAll(elements: Collection<T>) = addAllLast(elements)

    override fun remove() = removeLast()
}