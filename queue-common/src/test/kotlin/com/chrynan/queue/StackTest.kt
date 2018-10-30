package com.chrynan.queue

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith
import kotlin.test.assertNull

class StackTest{

    @Test
    fun peekShouldReturnsTheLastItem() {
        val stack = stackOf("One", "Two", "Three")

        assertEquals("Three", stack.peek())
    }

    @Test
    fun peekShouldThrowNoSuchElementExceptionForEmptyQueue() {
        val stack = stackOf<String>()

        assertFailsWith(NoSuchElementException::class) {
            stack.peek()
        }
    }

    @Test
    fun peekOrNullReturnsTheLastItem() {
        val stack = stackOf("One", "Two", "Three")

        assertEquals("Three", stack.peekOrNull())
    }

    @Test
    fun peekOrNullReturnsNullForEmptyQueue() {
        val stack = stackOf<String>()

        assertNull(stack.peekOrNull())
    }

    @Test
    fun removeShouldReturnsTheLastItem() {
        val stack = mutableStackOf("One", "Two")

        assertEquals("Two", stack.remove())
        assertEquals(mutableStackOf("One"), stack)
    }

    @Test
    fun removeShouldThrowNoSuchElementExceptionForEmptyQueue() {
        val stack = mutableStackOf<String>()

        assertFailsWith(NoSuchElementException::class) {
            stack.remove()
        }
    }

    @Test
    fun removeOrNullReturnsTheLastItem() {
        val stack = mutableStackOf("One", "Two")

        assertEquals("Two", stack.removeOrNull())
        assertEquals(mutableStackOf("One"), stack)
    }

    @Test
    fun removeOrNullReturnsNullForEmptyQueue() {
        val stack = mutableStackOf<String>()

        assertNull(stack.removeOrNull())
    }

    @Test
    fun pollOrNullReturnsTheLastItem() {
        val stack = mutableStackOf("One", "Two")

        assertEquals("Two", stack.poll())
        assertEquals(mutableStackOf("One"), stack)
    }

    @Test
    fun pollOrNullReturnsNullForEmptyQueue() {
        val stack = mutableStackOf<String>()

        assertNull(stack.poll())
    }

    @Test
    fun popOrNullReturnsTheLastItem() {
        val stack = mutableStackOf("One", "Two")

        assertEquals("Two", stack.pop())
        assertEquals(mutableStackOf("One"), stack)
    }

    @Test
    fun popOrNullReturnsNullForEmptyQueue() {
        val stack = mutableStackOf<String>()

        assertNull(stack.pop())
    }

    @Test
    fun addShouldAddElementsToTheEndOfTheQueue() {
        val stack = mutableStackOf("One")

        stack.add("Two")
        stack.add("Three")

        assertEquals(mutableStackOf("One", "Two", "Three"), stack)
    }

    @Test
    fun addShouldAddElementToEmptyQueue() {
        val stack = mutableStackOf<String>()

        stack.add("One")
        stack.add("Two")

        assertEquals(mutableStackOf("One", "Two"), stack)
    }

    @Test
    fun pushShouldAddElementsToTheEndOfTheQueue() {
        val stack = mutableStackOf("One")

        stack.push("Two")
        stack.push("Three")

        assertEquals(mutableStackOf("One", "Two", "Three"), stack)
    }

    @Test
    fun pushShouldAddElementToEmptyQueue() {
        val stack = mutableStackOf<String>()

        stack.push("One")
        stack.push("Two")

        assertEquals(mutableStackOf("One", "Two"), stack)
    }

    @Test
    fun addAllShouldAddAllElementsToTheEndOfTheQueue(){
        val stack = mutableStackOf("One", "Two")

        stack.addAll(listOf("Three", "Four", "Five"))

        assertEquals(mutableStackOf("One", "Two", "Three", "Four", "Five"), stack)
    }

    @Test
    fun pushAllShouldAddAllElementsToTheEndOfTheQueue(){
        val stack = mutableStackOf("One", "Two")

        stack.pushAll(listOf("Three", "Four", "Five"))

        assertEquals(mutableStackOf("One", "Two", "Three", "Four", "Five"), stack)
    }
}