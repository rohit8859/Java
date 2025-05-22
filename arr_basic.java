import java.util.*;

public class arr_basic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first array
        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            int num = sc.nextInt();
            arr1.add(num);
        }

        // Input second array
        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        ArrayList<Integer> arr2 = new ArrayList<>();
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            int num = sc.nextInt();
            arr2.add(num);
        }

        // Print arrays
        System.out.println("First array: " + arr1);
        System.out.println("Second array: " + arr2);

        // Find common elements
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n1; i++){
            for(int j = 0; j < n2; j++){
                if(arr1.get(i).equals(arr2.get(j)) && !arr.contains(arr1.get(i))){
                    arr.add(arr1.get(i));
                }
            }
        }
        System.out.println("Common elements in both the arrays are: " + arr);
    }
}
