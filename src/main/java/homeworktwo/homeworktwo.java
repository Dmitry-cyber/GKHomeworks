package homeworktwo;

public class Main {
public static void main(String[] args) {
     int[] arr = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
     System.out.print("BEFORE: ");
    for (int i = 0; i < arr.length; i++) {
       System.out.print(arr[i] + " ");
       if (arr[i] == 0) arr[i] = 1;
       else arr[i] = 0;
    }
   System.out.print("\nAFTER:  ");
    for (int i : arr) {
        System.out.print(i + " ");
    }
   }
  public static void main (String[] args) {
      int[] arr = new int[8];
     for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
         arr[i] = j;
         System.out.print(arr[i] + " ");
    }
  }
      public static void main(String[] args)
      {
         int[] mas = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
         int maxMas = mas.length;
        for(int i = 0; i < maxMas; i++) {
            if (mas[i] < 6) mas[i] = mas[i] * 2;
        }
        for(int i = 0; i < maxMas; i++)
       {
           System.out.print (i + "-" + mas[i]+" ");
      }
     }
     public static void main(String[] args)
       int length = 5;
        int[][] arr = new int[length][length];
       for (int i = 0; i < length; i++); {
           for (int j = 0; j < length; j++); {
               if ((i == j) || (i == length - 1 - j)); {
                  arr[i][j] = 1;
             }
         }
      }
      for (int i = 0; i < length; i++){
      for (int j = 0; j < length; j++) {
        System.out.print(arr[i][j] + " ");
     }
     System.out.println();
 }
public static void main(String[] args) {
   int[] arr = {1, 5, 3, 2, 10, 4, 5, 2, 4, 8, 9, 1, -7};
   int min = arr[0];
   int max = arr[0];
   System.out.print("in array: ");
  for (int i : arr) {
       System.out.print(i + " ");
   }
        for (int i = 0; i < arr.length; i++) {
         min = (min < arr[i]) ? min : arr[i];
        max = (max > arr[i]) ? max : arr[i];
      }
      System.out.println("\nminimal element is: " + min + "\nmaximal element is: " + max);
   }

    public static void main(String[] args) {
           int leftSum = 0, rightSum = 0;
           int[][] arr = new int[][];
           for (int i = 0; i < arr.length + 1; i++) {
                leftSum = 0;
                rightSum = 0;
                for (int j = 0; j < i; j++) {
                    leftSum += arr[j];
                }
              for (int j = i; j < arr.length; j++) {
                    rightSum += arr[j];
    {
               if (leftSum == rightSum)
                   return true;
            }
            return false;
}
}
  public static void main (int[] arr, int n) {
        System.out.print("BEFORE: ");
        for (int i : arr) {
        System.out.print(i + " ");
        }
        System.out.print("(n = " + n + ")");
        if (n > 0) {
           for (int i = 0; i < n; i++) {
                // Right
               int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        } else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // Left
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }

        System.out.print("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}