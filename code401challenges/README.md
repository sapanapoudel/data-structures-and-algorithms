## 1. Reverse the Array
    
## Challenge
Write a function that takes an array as argument and return an array with elements in reverse order. 

## Approach & Efficiency
To get the reverse array, I took two approaches. First, I didn't create the new array, instead I reverse the original array by doing swapping. My element was swapped to last element and second element was swapped to second last. In my second solution, I created a new array and all the elements in given array were placed reversely in new array. The Big O for this approach is linear time complexity since more numbers of elements in array takes more steps to iterate through the array. 
O(n) = Linear time complexity
    
## Solution
[code](src/main/java/code401challenges/ArrayReverse.java)
![Array reversed white board image](assets/ReverseArray.jpg)

  
## 2. Insert and shift an array in middle at index
  
## Challenge
Write a function called insertShiftArray which takes two parameters arr and the valued to be added. 

## Source
Pair programmed with Merisha
  
## Approach & Efficiency 
To insert the value at the middle of the array, I find the mid point. If my index at new array is less than mid point, i copied same element from output array to new array. If the index at new array is midpoint, then I insert the value. If index is greater then midpoint, it copied element from input array at index - 1. Both time and space complexity is O(n). 

## Solution 
[code](src/main/java/code401challenges/ArrayShift.java)|[Test](src/test/java/code401challenges/ArrayShiftTest.java)
![Insert and shift an array whiteboard image](assets/insertShiftArray.jpg)