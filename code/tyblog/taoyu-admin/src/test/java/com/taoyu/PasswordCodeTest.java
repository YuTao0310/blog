package com.taoyu;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordCodeTest {
   public static void main(String[] args) {
        PasswordEncoder encoder = new BCryptPasswordEncoder();
        String original = "1234";
        System.out.println(original + "\n" + encoder.encode(original));
   } 
}
