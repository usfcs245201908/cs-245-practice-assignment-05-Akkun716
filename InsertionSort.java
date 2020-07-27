public class InsertionSort implements SortingAlgorithm
{
    @Override
    public void sort(int[] a)
    {
        //Head marks the current index (Starts at 1 since an array with one element is already sorted)
        int temp, mark, head = 1;

        while(head < a.length)
        {
            //temp holding the current element
            temp = a[head];
            mark = head - 1;

            //Marks moves back through the array
            while(mark >= 0 && a[mark] > temp)
            {
                a[mark + 1] = a[mark];
                mark--;
            }

            //Sets the current mark index element to our head (note no change if while is not executed)
            a[mark + 1] = temp;
            head++;
        }
    }
}
