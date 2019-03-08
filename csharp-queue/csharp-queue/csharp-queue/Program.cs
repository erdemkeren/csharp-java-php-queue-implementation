using System;

namespace csharp_queue
{
    class Program
    {
        public static void Main(string[] args)
        {
            var queue = new Queue();

            queue.Enqueue(1);
            queue.Enqueue(2);
            queue.Enqueue(4);
            queue.Enqueue(3);

            var size = queue.Size();

            for (var i = 0; i < size; i++)
            {
                Console.WriteLine(
                    $"{i}nth item of the queue is: {queue.Dequeue()}"
                );
                
            }
                
            Console.WriteLine("Hello World!");
        }
    }
}