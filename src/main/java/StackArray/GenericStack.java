package StackArray;

import java.util.Stack;

/**
 * Expand the ArrayList implementation of stack here to use an E[] array.  Still implement push, pop, and isEmpty.
 * Remember, you might need to resize the stack in the push method.
 * @param <E>
 */
public class GenericStack<E> extends Stack<E> {
    private E[] elements;
    private int size;

    public GenericStack() {
        elements = (E[])new Object[8];
        size = 0;
    }


    public E push(E nextElement) {
        if (size != elements.length) {
            elements[size] = nextElement;
        } else {
            elements = doubleCapacity();
        }
        size++;
        return nextElement;
    }

    private E[] doubleCapacity() {
        E[] temp = (E[])new Object[elements.length * 2];
        for (int i = 0; i < elements.length; i++) {
            temp[i] = elements[i];
        }
        return temp;
    }

    public E pop() {
        E returned = elements[size-1];
        elements[size-1] = null;
        size--;
        return returned;
    }

    public boolean isEmpty() {
        return size == 0;
    }

}
