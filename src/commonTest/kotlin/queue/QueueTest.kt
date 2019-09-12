package com.chrynan.queue

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

class QueueTest {

    @Test
    fun peekShouldReturnsTheFirstItem() {
        val queue = queueOf("One", "Two", "Three")

        assertEquals("One", queue.peek())
    }

    @Test
    fun peekShouldThrowNoSuchElementExceptionForEmptyQueue() {
        val queue = queueOf<String>()

        assertFailsWith(NoSuchElementException::class) {
            queue.peek()
        }
    }

    @Test
    fun peekOrNullReturnsTheFirstItem() {
        val queue = queueOf("One", "Two", "Three")

        assertEquals("One", queue.peekOrNull())
    }

    @Test
    fun peekOrNullReturnsNullForEmptyQueue() {
        val queue = queueOf<String>()

        assertNull(queue.peekOrNull())
    }

    @Test
    fun removeShouldReturnsTheFirstItem() {
        val queue = mutableQueueOf("One", "Two")

        assertEquals("One", queue.remove())
        assertEquals(mutableQueueOf("Two"), queue)
    }

    @Test
    fun removeShouldThrowNoSuchElementExceptionForEmptyQueue() {
        val queue = mutableQueueOf<String>()

        assertFailsWith(NoSuchElementException::class) {
            queue.remove()
        }
    }

    @Test
    fun removeOrNullReturnsTheFirstItem() {
        val queue = mutableQueueOf("One", "Two")

        assertEquals("One", queue.removeOrNull())
        assertEquals(mutableQueueOf("Two"), queue)
    }

    @Test
    fun removeOrNullReturnsNullForEmptyQueue() {
        val queue = mutableQueueOf<String>()

        assertNull(queue.removeOrNull())
    }

    @Test
    fun pollOrNullReturnsTheFirstItem() {
        val queue = mutableQueueOf("One", "Two")

        assertEquals("One", queue.poll())
        assertEquals(mutableQueueOf("Two"), queue)
    }

    @Test
    fun pollOrNullReturnsNullForEmptyQueue() {
        val queue = mutableQueueOf<String>()

        assertNull(queue.poll())
    }

    @Test
    fun popOrNullReturnsTheFirstItem() {
        val queue = mutableQueueOf("One", "Two")

        assertEquals("One", queue.pop())
        assertEquals(mutableQueueOf("Two"), queue)
    }

    @Test
    fun popOrNullReturnsNullForEmptyQueue() {
        val queue = mutableQueueOf<String>()

        assertNull(queue.pop())
    }

    @Test
    fun addShouldAddElementsToTheEndOfTheQueue() {
        val queue = mutableQueueOf("One")

        queue.add("Two")
        queue.add("Three")

        assertEquals(mutableQueueOf("One", "Two", "Three"), queue)
    }

    @Test
    fun addShouldAddElementToEmptyQueue() {
        val queue = mutableQueueOf<String>()

        queue.add("One")
        queue.add("Two")

        assertEquals(mutableQueueOf("One", "Two"), queue)
    }

    @Test
    fun pushShouldAddElementsToTheEndOfTheQueue() {
        val queue = mutableQueueOf("One")

        queue.push("Two")
        queue.push("Three")

        assertEquals(mutableQueueOf("One", "Two", "Three"), queue)
    }

    @Test
    fun pushShouldAddElementToEmptyQueue() {
        val queue = mutableQueueOf<String>()

        queue.push("One")
        queue.push("Two")

        assertEquals(mutableQueueOf("One", "Two"), queue)
    }

    @Test
    fun addAllShouldAddAllElementsToTheEndOfTheQueue() {
        val queue = mutableQueueOf("One", "Two")

        queue.addAll(listOf("Three", "Four", "Five"))

        assertEquals(mutableQueueOf("One", "Two", "Three", "Four", "Five"), queue)
    }

    @Test
    fun pushAllShouldAddAllElementsToTheEndOfTheQueue() {
        val queue = mutableQueueOf("One", "Two")

        queue.pushAll(listOf("Three", "Four", "Five"))

        assertEquals(mutableQueueOf("One", "Two", "Three", "Four", "Five"), queue)
    }
}