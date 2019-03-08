<?php

require_once('Queue.php');

class Program
{
    public static function main()
    {
        $queue = new Queue();

        $queue->enqueue(1);
        $queue->enqueue(2);
        $queue->enqueue(4);
        $queue->enqueue(3);

        $size = $queue->size();

        for($i = 0; $i < $size; $i++) {
            echo ("Item  {$i}: {$queue->dequeue()}\n");
        }
    }
}

Program::main();