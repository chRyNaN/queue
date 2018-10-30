package com.chrynan.queue

object EmptyDeque : Deque<Nothing>,
        MutableDeque<Nothing> {

    override fun getFirst() = throw NoSuchElementException("Empty Deque has no items.")

    override fun getLast() = throw NoSuchElementException("Empty Deque has no items.")

    override fun descendingIterator() = EmptyIterator

    override val size = 0

    override fun contains(element: Nothing) = false

    override fun containsAll(elements: Collection<Nothing>) = elements.isEmpty()

    override fun isEmpty() = true

    override fun iterator() = EmptyIterator

    override fun addFirst(element: Nothing) = throw IllegalStateException("Cannot add elements to an Empty Deque.")

    override fun addLast(element: Nothing) = throw IllegalStateException("Cannot add elements to an Empty Deque.")

    override fun addAllFirst(elements: Collection<Nothing>) = throw IllegalStateException("Cannot add elements to an Empty Deque.")

    override fun addAllLast(elements: Collection<Nothing>) = throw IllegalStateException("Cannot add elements to an Empty Deque.")

    override fun removeFirst() = throw IllegalStateException("Cannot remove elements from an Empty Deque.")

    override fun removeLast() = throw IllegalStateException("Cannot remove elements from an Empty Deque.")

    override fun removeFirstOccurrence(element: Nothing) = throw IllegalStateException("Cannot remove elements from an Empty Deque.")

    override fun removeLastOccurrence(element: Nothing) = throw IllegalStateException("Cannot remove elements from an Empty Deque.")

    override fun removeAllOccurrences(element: Nothing) = throw IllegalStateException("Cannot remove elements from an Empty Deque.")
}