package com.s500076108;

public class ShiftCipher {

    public static void main(String [] args){
    String  plainText="Nesoacademy";
    int key=3;

        System.out.println("Encrypted Text "+Encrypt(plainText,key));
        String cipherText=Encrypt(plainText,key);
        System.out.println("Decrypted Text "+Decrypt(cipherText,key));

    }

    private static String Decrypt( String cipherText, int key) {
        String plainTextOld="";
        for(int  i=0;i<cipherText.length();i++){
            plainTextOld+=(char)((cipherText.charAt(i)-key+65)%26+65);

        }
        return plainTextOld.toLowerCase();
    }


    private static String Encrypt(String plainText, int key) {
        String cipher="";
        for(int  i=0;i<plainText.length();i++){
            cipher+=(char)((plainText.charAt(i)+key-97)%26+97);

        }
        return  cipher.toUpperCase();
    }
}
