import java.util.Scanner;

public class Q6_HeapSortJobApplicantsBySalary {
    public static void heapSort(int[] arr) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--) heapify(arr, n, i);

        // Extract elements from heap
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0]; arr[0] = arr[i]; arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i, l = 2 * i + 1, r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest]) largest = l;
        if (r < n && arr[r] > arr[largest]) largest = r;
        if (largest != i) {
            int swap = arr[i]; arr[i] = arr[largest]; arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of applicants: ");
        int n = sc.nextInt();
        int[] salary = new int[n];
        System.out.print("Enter expected salaries: ");
        for (int i = 0; i < n; i++) salary[i] = sc.nextInt();

        heapSort(salary);

        System.out.print("Sorted Salaries: ");
        for (int s : salary) System.out.print(s + " ");
    }
}
