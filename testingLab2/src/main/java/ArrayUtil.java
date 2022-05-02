public class ArrayUtil {
    // empty array
    // array with one element
    // array full with the same number
    // maximum is the last element
    // max is the first element
    // max is randomly placed
    // min is the last element
    // min is randomly placed
    // min is the first element
    // all negative numbers
    // all positive numbers
    // all zeros

    public Integer max(Integer[] arr){
        if(arr == null || arr.length <= 0){
            return null;
        }
        Integer maximum = arr[0];
        for (Integer v : arr) {
            if (v > maximum) {
                maximum = v;
            }
        }
        return maximum;
    }
    public Integer min(Integer[] arr){
        if(arr == null || arr.length <= 0){
            return null;
        }
        Integer minimum = arr[0];
        for(Integer v: arr){
            if(v < minimum){
                minimum = v;
            }
        }
        return minimum;
    }

}
