public class Main {
  public static void main (String args[]) {
    int[] example = {1, 3, 5, 6, 9, 2};
    insertionSort(example);
  }

  public static void insertionSort (int[] nums) {
    // int leastValue = nums[0];
    // int leastPosition = 0;

    // int largestValue = findLargest(nums);
    
    // for (int i = 0; i < nums.length; i++) {
    //   if (nums[i] < leastValue) {
    //     nums[leastPosition] = nums[i];
    //     leastPosition = i;
    //     leastValue = nums[i];
    //   }

    //   else if (nums[i] < nums[i - 1]) {
    //     int largestDiff = largestValue - nums[i];
    //     for (int z = 0; z < nums.length; z++) {
    //       if ((nums[z] - nums[i]) < largestDiff && (nums[z] - nums[i]) > 0) {
    //         int startingPos = z + 1;
    //         int newLength = nums.length - startingPos;
            
    //         for (int g = 0; g < newLength; g++) {
    //           nums[newLength - g] = nums[(newLength - g) - 1];
    //         }
    //         nums[z] = nums[i];
    //       }
    //     }
    //   }
    // }

    // for (int x = 0; x < nums.length; x++) {
    //   System.out.print(nums[x] + ",");
    // }

    for (int i = 1; i < nums.length; i++) {
      int j = i;
      while (j > 0 && nums[j] < nums[j - 1]) {
        int temp = nums[j];
        nums[j] = nums[j-1];
        nums[j - 1] = temp;
   
        j--;
      }
    }
  }

  public static void selectionSort(int[] nums) {
    // for (int i = 0; i < nums.length - 1; i++) {
    //   int indexMin = i;
    //   for (int x = 0; x < x.lengt)
    // }
  }

  public static int findLargest (int[] arr) {
    int largest = arr[0];

    for (int i = 0; i < arr.length; i++) {
      if (largest > arr[i]) {
        largest = arr[i];
      }
    }

    return largest;
  }

  public static int[] deleteElement (int[] arr, int index) {
    int newArr[] = new int[arr.length - 1];

    for (int i = 0; i < arr.length; i++) {
      if (i == index) {
        i -= 1;
      }

      else {
        newArr[i] = arr[i];
      }
    }

    return newArr;
  }
}