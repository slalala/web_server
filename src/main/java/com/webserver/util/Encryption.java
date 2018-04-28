package com.webserver.util;

import org.apache.commons.lang.RandomStringUtils;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption {


    private String salt;

    public String getSalt() {
        return salt;
    }

    public Encryption() {
        int saltLength = Integer.parseInt(Math.round(Math.random() * 100) + "");
        String salt = RandomStringUtils.randomAlphanumeric(saltLength);
        this.salt = salt;
    }

    /**
     * 加密
     * @param userName
     * @param salt
     * @param pass
     * @return
     */
    public String getEncrypt(String userName,String salt, String pass) {

        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("md5");

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        String plainText = userName + salt + pass;
        byte[] cipherData = md5.digest(plainText.getBytes());
        StringBuilder builder = new StringBuilder();
        for (byte cipher : cipherData) {
            String toHexStr = Integer.toHexString(cipher & 0xff);
            builder.append(toHexStr.length() == 1 ? "0" + toHexStr : toHexStr);
        }

        return builder.toString();

    }
}
