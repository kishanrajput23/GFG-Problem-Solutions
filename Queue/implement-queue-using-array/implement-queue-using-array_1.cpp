class myQueue {
    int *arr;
    int front;
    int rear;
    int size;
    int currsize;

  public:
    myQueue(int n) {
        // Define Data Structures
        size = n;
        arr = new int[n];
        front = -1;
        rear = -1;
        currsize = 0;
    }

    bool isEmpty() {
        // check if the queue is empty
         return currsize == 0;
    }

    bool isFull() {
        // check if the queue is full
        return currsize == size;
    }

    void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        if(isFull())
            return;

        if(isEmpty()) {
            front = rear = 0;
        }
        else {
            rear++;
        }

        arr[rear] = x;
        currsize++;
    }

    void dequeue() {
        // Removes the front element of the queue.
        if(isEmpty())
            return;

        if(front == rear) {
            front = rear = -1;
        }
        else {
            front++;
        }

        currsize--;
    }

    int getFront() {
        // Returns the front element of the queue.
        if(isEmpty())
            return -1;

        return arr[front];
    }

    int getRear() {
        // Return the last element of queue
        if(isEmpty())
            return -1;

        return arr[rear];
    }
};