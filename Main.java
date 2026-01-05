class Main {
    public static void main(String[] args) {

        // int[] arr = {1,2,2,3,3};

        // removeDb(arr);

    //     for(int a : arr){
    //   System.out.print(a);
    //     }

     String[] strs = {"flower","flow","flight"};

        System.out.print(longestCommonPrefix(strs));

    
    }

     static String longestCommonPrefix(String[] strs) {

    // Edge case
    if (strs == null || strs.length == 0) {
        return "";
    }

    // Take first string as reference
    String first = strs[0];

    // Compare characters index by index
    for (int i = 0; i < first.length(); i++) {

        char currentChar = first.charAt(i);

        // Compare with all other strings
        for (int j = 1; j < strs.length; j++) {

            // Stop if index exceeds length OR characters don't match
            if (i >= strs[j].length() || strs[j].charAt(i) != currentChar) {
                return first.substring(0, i);
            }
        }
    }

    // If all characters matched
    return first;
}

    static void removeDb(int[] arr){

    int index = 0;   
    for(int i = 0; i < arr.length; i++){
        if(i + 1 != arr.length){
            if(arr[i] != arr[i + 1]){
                arr[index] = arr[i];
                index++;
            }
        }
    }

    arr[index] = arr[arr.length - 1];
}

    static boolean isSorted(int[] arr){
        boolean isSorted = true;
        for(int i =0; i<arr.length;i++){
            if(i+1 != arr.length){
 if(arr[i] > arr[i+1]){
                   isSorted = false;
                   break;
                }
            }
           
        }
            return isSorted;
    }

    static void reversArrey(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        for(int i = start ;i<end;i++){
        swap(arr,start,end);
        end--;
        start++;
        }
      
    }

    static void swap (int[] arr ,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    
    static int MaxNumber(int[] arr){
        int maxVal = arr[0];
        for (int i = 0; i<arr.length;i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
              
        }
        return maxVal;
        
    }

    static int MinNumber(int[] arr){
        int minVal = arr[0];
        for (int i = 0; i<arr.length;i++){
            if(arr[i] < minVal){
                minVal = arr[i];
            }
             
        }
        return minVal;
        
    }
}