using System.Linq;
using System.Collections.Generic;

namespace csharp_queue
{
    public class Queue
    {
        private readonly LinkedList<int> _queue = new LinkedList<int>();

        public int Size() => _queue.Count;

        public bool IsEmpty() => _queue.Any();

        public void Enqueue(int val) => _queue.AddLast(val);

        public int Dequeue()
        {
            var element = _queue.First();
            _queue.RemoveFirst();
            
            return element;
        }

        public int Peek() => _queue.ElementAt(0); 
    }
}