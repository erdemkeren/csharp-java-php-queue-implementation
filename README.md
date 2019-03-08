# csharp-java-php-queue-implementation
Queue implementations utilizing LinkedList provided by the language (System.Collections.Generic, java.util.LinkedList, \SplDoublyLinkedList).

# Inference

**Java Way** `LinkedList.pop()`removes and returns the first element of this list.
In the other hand, in **PHP**, `SplDoublyLinkedList->pop()` pops a node from the end of the doubly linked list regardless of the iterator mode (SplDoublyLinkedList::IT_MODE_FIFO or SplDoublyLinkedList::IT_MODE_LIFO).
And finally; in **C#**, there is no `Pop` method inside the `LinkedList` implementation. Methods like `Push`, `Pop` and `Peek` are the members of `System.Collections.Stack` and that's why you don't have access to these methods from LinkedLists. You can combine and use `void RemoveFirst()` and `TSource First()` to simulate the `Pop` behaviour.
Finally, in **Java** pop is also an alias of `E removeFirst()`. And you don't need to call `E getFirst` explicitly to implement `Pop` since it already returns the `T` variable.
