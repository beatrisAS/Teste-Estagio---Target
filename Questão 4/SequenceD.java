public class SequenceD {
    public static void main(String[] args) {
        int[] sequence = { 4, 16, 36, 64 };
        int nextElement = (int) Math.pow(sequence.length + 2, 2);
        System.out.println("Next element: " + nextElement);
    }
}
