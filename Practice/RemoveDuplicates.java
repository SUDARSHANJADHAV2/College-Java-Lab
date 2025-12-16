import java.util.Scanner;

class RemoveDuplicates {
    public static int Duplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return ++j;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = Duplicates(arr);
        System.out.println("No of unique elements: " + k);
        System.out.println("Array :");
        for (int i = 0; i < k; i++) {
            System.out.println(arr[i]);
        }
        sc.close();

    }
}
