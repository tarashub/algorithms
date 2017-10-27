package sorting;


public interface SortingAlgorithm {

    /**
     * Sort an integer array in place
     *
     * @param a unsorted array
     */
    void sort(int[] a);

    /**
     *
     * @return algorithm name
     */
    String getName();
}
