public class SequenceE {
    public static void main(String[] args) {
        int[] sequence = { 1, 1, 2, 3, 5, 8 };
        int nextElement = sequence[sequence.length - 1] + sequence[sequence.length - 2];
        System.out.println("Next element: " + nextElement);
    }
}
