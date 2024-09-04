public class SequenceC {
    public static void main(String[] args) {
        int[] sequence = { 0, 1, 4, 9, 16, 25, 36 };
        int nextElement = (int) Math.pow(sequence.length, 2);
        System.out.println("Next element: " + nextElement);
    }
}