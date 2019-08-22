package code401challenges.arraylist;


public class BinarySearch {
    //Iterative Binary Search
    public static int binarySearch(int[] testArr, int searchKey){
        int lowerBound = 0;
        int upperBound = testArr.length;
        while(lowerBound < upperBound){
            int midPoint = (lowerBound + upperBound) / 2;
            if(testArr[midPoint] == searchKey){
                return  midPoint;
            } else if(testArr[midPoint] < searchKey){
                lowerBound = midPoint + 1;
            } else {
                upperBound = midPoint -1;
            }
        }
        
        return  -1;
    }

    //Recursive Binary Search
    public static int recursiveBinarySearch(int[] testArr, int searchKey, int lowerBound, int upperBound) {
        if (lowerBound >= upperBound){
            return  -1;
        }
        int midPoint = (lowerBound + upperBound) / 2;
        if(testArr[midPoint] == searchKey){
            return  midPoint;
        }
        else if(testArr[midPoint] < searchKey){
            return recursiveBinarySearch(testArr, searchKey, midPoint+1, upperBound);
        }
        else {
            return recursiveBinarySearch(testArr, searchKey, lowerBound, midPoint);
        }
    }


}
