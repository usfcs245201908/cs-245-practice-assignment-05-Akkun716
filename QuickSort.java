public class QuickSort implements SortingAlgorithm
{
    @Override
    public void sort(int[] a)
    { quickSort(a, 0, a.length - 1); }

    private void quickSort(int[] a, int l, int r)
    {
        if (l < r)
        {
            int pivotPos = partition(a, l, r);

            quickSort(a, l, pivotPos - 1);
            quickSort(a, pivotPos + 1, r);
        }
    }

    //Finds a pivot value to place in its proper place in the array
    private int partition(int[] a, int l, int r) {
        int pivot = a[r];

        //i will track the index of the last item less than the pivot to leave the next position for pivot
        int i = l - 1;

        for (int j = l; j < r; j++) {
            if (a[j] <= pivot) {
                i++;

                swap(a, i, j);
            }
        }

        swap(a, i + 1, r);
        // Return the pivot's final resting position
        return i + 1;
    }

    private void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
