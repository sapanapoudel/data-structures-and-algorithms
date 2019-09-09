## Insertion Sort
Insertion sort algorithm is in-place algorithm, where it partitions the array into sorted and unsorted partitions. As we look for correct insertion order, sorted partition grows from left to right. It starts out as the element at index 0 is in sorted partition, and element at index 1 is in unsorted partition. On each iteration, we insert first unsorted value into sorted list. 

Unsorted Array: [14, 35, 27, 10, 19, 42, 44]
* firstUnsortedIndex = 1 (this is the first index of unsorted partition)
* i = 0 (index used to traverse the sorted partition from left to right)
* newElement = value at firstUnsortedIndex, which is 35 in this example
* Insertion sort compares 35 with value at sorted partition which is 14, it finds that 14 and 35 are already in acceding order, 35 is in sorted partition now. 
* firstUnsortedIndex moves to 27 now and compare with all the value at sorted partition and insert it.
* This process goes on until all the values at unsorted partition are in sorted partition and it breaks out of the loop. 

Sorted Array: [10, 14, 19, 27, 35, 42, 44]

#### Pseudocode 
 
```
InsertionSort(int[] arr)
    input <-- int[] arr
    output <-- int[] arr
    for firstUnsortedIndex = 1 to Array.length
        new Element = arr[firstUnsortedIndex]
        for i = firstUnsortedIndex, i > 0 && arr[i - 1] > new Element, i--
            arr[i] = arr[i - 1]
        arr[i] = new Element
```
#### Efficiency
* It is in-place algorithms 
* Time Complexity: O(n^2), quadratic  
* Stable algorithm 
#### Resources 
Read
* [TutorialsPoint](https://www.tutorialspoint.com/data_structures_algorithms/insertion_sort_algorithm.htm)
* [Khan Academy](https://www.khanacademy.org/computing/computer-science/algorithms/insertion-sort/a/insertion-sort)

Video
* [udemy](https://www.udemy.com/course/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435772?start=0#questions)
