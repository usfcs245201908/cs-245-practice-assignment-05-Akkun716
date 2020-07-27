public class MergeSort implements SortingAlgorithm
{
    @Override
    public void sort(int[] a)
    {
        //copy[] will hold elements of a[]
        int[] copy = new int[a.length];

        for(int i = 0; i < a.length; i++)
        { copy[i] = a[i]; }

        mergeSort(copy, a, 0, a.length);
    }

    private void mergeSort(int[] b, int[] a, int l, int r)
    {
        //Implies there is only one element in array slice
        if(r - l <= 1)
        { return; }

        int m = (l + r) / 2;
        //Note the array arguments are switched, meaning each call flips the array being ordered,
        //allowing both arrays to be referenced off of each other
        mergeSort(a, b, l, m);
        mergeSort(a, b, m, r);

        //l/rHead are the heads of the "two" subarrays; one at the left bound and the other in the middle
        int lHead = l, rHead = m;
        for (int mark = l; mark < r; mark++)
        {
            if (lHead < m && (rHead >= r || b[lHead] <= b[rHead]))
            {
                a[mark] = b[lHead];
                lHead++;
            }
            else
            {
                a[mark] = b[rHead];
                rHead++;
            }
        }
    }
}