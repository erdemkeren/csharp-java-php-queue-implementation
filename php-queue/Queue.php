<?php

class Queue
{
    public $queue;

    public function __construct()
    {
        $this->queue = new SplDoublyLinkedList();
        $this->queue->setIteratorMode(SplDoublyLinkedList::IT_MODE_FIFO);
    }

    public function isEmpty(): bool
    {
        return $this->queue->isEmpty();
    }

    public function size(): int
    {
        return $this->queue->count();
    }

    public function enqueue(int $val): void
    {
        $this->queue->push($val);
    }

    public function dequeue(): int
    {
        return $this->queue->shift();
    }

    public function peek(): int
    {
        return $this->queue->offsetGet(0);
    }
}
