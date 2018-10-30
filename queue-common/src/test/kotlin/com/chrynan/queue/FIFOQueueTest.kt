package com.chrynan.queue

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

class FIFOQueueTest {

    @Test
    fun peekShouldReturnsTheCorrectItem() {
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
    fun peekOrNullReturnsTheCorrectItem() {
        val queue = queueOf("One", "Two", "Three")

        assertEquals("One", queue.peekOrNull())
    }

    @Test
    fun peekOrNullReturnsNullForEmptyQueue() {
        val queue = queueOf<String>()

        assertNull(queue.peekOrNull())
    }
}