### 1. Reverse the Array
    
#### Challenge
Write a function that takes an array as argument and return an array with elements in reverse order. 

#### Approach & Efficiency
To get the reverse array, I took two approaches. First, I didn't create the new array, instead I reverse the original array by doing swapping. My element was swapped to last element and second element was swapped to second last. In my second solution, I created a new array and all the elements in given array were placed reversely in new array. The Big O for this approach is linear time complexity since more numbers of elements in array takes more steps to iterate through the array. 
O(n) = Linear time complexity
    
#### Solution
[code](src/main/java/code401challenges/ArrayReverse.java)
![Array reversed white board image](assets/ReverseArray.jpg)

  
### 2. Insert and shift an array in middle at index
  
#### Challenge
Write a function called insertShiftArray which takes two parameters arr and the valued to be added. 

#### Source
Pair programmed with Merisha
  
#### Approach & Efficiency 
To insert the value at the middle of the array, I find the mid point. If my index at new array is less than mid point, i copied same element from output array to new array. If the index at new array is midpoint, then I insert the value. If index is greater then midpoint, it copied element from input array at index - 1. Both time and space complexity is O(n). 

#### Solution
[code](src/main/java/code401challenges/ArrayShift.java)|[Test](src/test/java/code401challenges/ArrayShiftTest.java)
![Insert and shift an array whiteboard image](assets/insertShiftArray.jpg)


### 3. Binary Search 
  
#### Challenge
Write a method called BinarySearch which takes two parameters sorted array and search key and return the index of the key of found. Return -1 when  not found.

#### Source
https://www.udemy.com/data-structures-and-algorithms-deep-dive-using-java/learn/lecture/8435910#content
#### Approach & Efficiency
1. Array must be sorted
2. Find the mid point of the array and compares it against search key
3. If element at mid index is equal to search key, return mid index
4. If the element is greater than search key, search the left half of the array
5. If the element is less than the search key, search the right half of the array
6. If not found return -1

#### Solution
[code](src/main/java/code401challenges/BinarySearch.java)
[Test](src/test/java/code401challenges/BinarySearchTest.java)
![Binary Search whiteboard image](assets/Binary_Search.jpg)