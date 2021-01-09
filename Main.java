class Main {
  public static void main(String[] args) {
    int[] arr = {1, 5, 1, 10, 13, 9, 40, 33, 28, 15};
    
    System.out.print("Unsorted: ");
    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();

    insertionSort(arr);
    
    System.out.print("Sorted:   ");
    for (int n : arr) {
      System.out.print(n + " ");
    }
    System.out.println();

  }
  // On average O(n^2) time complexity, O(1) space complexity
  static void insertionSort(int[] arr) {
    int length = arr.length;
    
    for (int i = 1; i < length; ++i) {
      int current = arr[i];
      int prev = i - 1;

      while (prev >= 0 && arr[prev] > current) {
        arr[prev + 1]  = arr[prev];
        prev -= 1;
      }
      arr[prev + 1] = current;
    }

  }
}