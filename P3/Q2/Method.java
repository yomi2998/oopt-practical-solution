package P3.Q2;

public class Method {
    public int smallestInt(int[] array) {
        int smallestValue = array[0];
        int smallestIndex = 0;

        for (int i = 0; i < array.length; ++i) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}
