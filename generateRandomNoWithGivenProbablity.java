import java.util.Arrays;

public class generateRandomNoWithGivenProbablity {
    
    // given a random nu generator r that produces a particular value between 0 and 1 , how would u generate one of the n numbers according to the specified probalities.
    public static void main(String[] args) {
        int[] values = {3,5,7,11};
        double[] probalities = {0.25,0.5,0,0.25};
        double[] pinterval = new double[probalities.length];
        double temp = 0.0;
        double key = Math.random();
        for(int i=0; i<probalities.length; i++) {
            pinterval[i] = temp + probalities[i];
            temp = pinterval[i];
        }
            
        int pos = Arrays.binarySearch(pinterval, key);

        if(pos<0) pos = Math.abs(pos) - 1;
        System.out.println(Arrays.toString(values));
        System.out.println(Arrays.toString(pinterval));
        System.out.println(key);
        System.out.println(values[pos]);
    }
}

// create a multidimensional arraylist of size of 2x2 and traverse the elements of the arraylist3.