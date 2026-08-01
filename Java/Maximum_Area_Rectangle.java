class maxArea {
    
    static int calculate_Area(Rectangle arr[]){
        
        // Your code here
        int max = 0;
        for (int i=0; i<arr.length; i++) {
            int temp = arr[i].length * arr[i].breadth;
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}
