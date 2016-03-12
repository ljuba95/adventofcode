package four;

import java.security.MessageDigest;

public class Hashing {
	public static String bytesToHexString(byte[] b) throws Exception {
        String result = "";
        for (int i=0; i < b.length; i++) {
            result +=
                Integer.toString( ( b[i] & 0xff ) + 0x100, 16).substring( 1 );
        }
        return result;
    }

    public static void main(String [] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        long index = 0;
        
        while (true) {
            String key = String.format("%s%d", args[0], index++);
            byte [] digest = md.digest(key.getBytes());
            if (bytesToHexString(digest).startsWith("00000"))
                break;
        }
        System.out.println(String.format("%d", index-1));
    }

}
