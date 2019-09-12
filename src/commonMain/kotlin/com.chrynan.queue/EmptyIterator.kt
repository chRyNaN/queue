package com.chrynan.queue

object EmptyIterator : ListIterator<Nothing> {

    override fun hasNext() = false

    override fun hasPrevious() = false

    override fun nextIndex() = 0

    override fun previousIndex() = -1

    override fun next() = throw NoSuchElementException()

    override fun previous() = throw NoSuchElementException()
}