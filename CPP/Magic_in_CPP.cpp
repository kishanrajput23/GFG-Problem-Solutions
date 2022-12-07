// Function to swap A and B
// using pointers
void swap(int *A, int *B){
    
    // Your code here
    int temp;
    temp = *A;
    *A = *B;
    *B = temp;
}

// Function to swap A and B
// using reference
void swap(int &A, int &B){
  
    // Your code here
    int temp;
    temp = A;
    A = B;
    B = temp;
}
