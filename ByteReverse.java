public class ByteReverse {


    public static void reverseBytes(byte[] bytes) {

        StringBuilder originalBits = new StringBuilder();
        for (byte b : bytes) {
            originalBits.append(String.format("%8s", Integer.toBinaryString(b)).replaceAll(" ", "0"));
        }

        System.out.println("original Bits :: " + originalBits);

        StringBuilder reversedBits = new StringBuilder();

        for (int i = originalBits.length() - 1; i >= 0; i--) {
            reversedBits.append(originalBits.charAt(i));
        }

        System.out.println("reversed Bits :: " + reversedBits);

        for (int i = 0, bytePosition = 0; i < reversedBits.length(); i += 8) {
            String aByte = reversedBits.substring(i, i + 7);
            bytes[bytePosition] = (byte) Integer.parseInt(aByte);
        }
    }

    public static void main(String[] args) {
        byte[] bytes = "bbb".getBytes();
        reverseBytes(bytes);
        System.out.println(new String(bytes));
    }
}