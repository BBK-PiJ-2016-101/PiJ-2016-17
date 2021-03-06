package ex04;

class BinarySearchTest {
    public static void main(String[] args) {
        int[] a =
                {2, 8, 12, 14, 16, 19, 24, 28, 31, 33,// 0-9
                        39, 40, 45, 49, 51, 53, 54, 56, 57, 60,// 10-19
                        63, 69, 77, 82, 88, 89, 94, 96, 97};  // 20-28

        BinarySearchRecursive bsr = new BinarySearchRecursive();
        System.out.println();
        System.out.print(bsr.binarySearch(a, 1) + " ");
        System.out.print(bsr.binarySearch(a, 26) + " ");
        System.out.print(bsr.binarySearch(a, 77) + " ");
        System.out.print(bsr.binarySearch(a, 94) + " ");
        System.out.println();
    }
}
