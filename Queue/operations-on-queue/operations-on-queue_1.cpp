class myQueue {
    // define your queue
    int front;
    int rear;
    int count;
    int value;
    int arr[10000];
    
  public:
    myQueue() {
        // initialize your queue
        front = -1;
        rear = -1;
        count = 0;
        value = 0;
    }
    
    void enqueue(int x) {
        // insert x into queue
        if (front == -1 && rear == -1) {
            front = rear = 0;

        }
        else {
            rear = rear + 1;

        }
        arr[rear] = x;
        count++;
    }

    void dequeue() {
        // remove front element from queue
        if (isEmpty()){
            return ;
        }
        
        if (front == 0 && rear == 0) {
            front = rear = -1;
        }
        else {
            for (int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            
            rear--;
        }
        
        count--;
    }

    int getFront() {
        // return the front element of the queue
        if (isEmpty()){
            return -1;
        }
        
        value = arr[front];
        
        return value;
    }

    int getRear() {
        // return the rear element of the queue
        if (isEmpty()) {
            return -1;
        }
        
        value = arr[rear];
        
        return value;
    }

    bool isEmpty() {
        // check whether queue is empty
        return count == 0;
    }

    int size() {
        // return size of the queue
        return count;
    }
};