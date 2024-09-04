public class SequenceB {
    public static void main(String[] args) {
        int[] sequence = { 2, 4, 8, 16, 32, 64 };
        int nextElement = sequence[sequence.length - 1] * 2;
        System.out.println("Next element: " + nextElement);
    }
}