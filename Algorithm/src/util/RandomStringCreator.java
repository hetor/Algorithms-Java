package util;

import java.util.Random;

public class RandomStringCreator {
    
    public static char[] alphabets = 
        {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
        'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
    public String createIgnoreCase(int length) {
        return create(length, alphabets.length);
    }
    
    public String createLowerCase(int length) {
        return create(length, 26);
    }
    
    public String createUpperCase(int length) {
        return createLowerCase(length).toUpperCase();
    }
    
    private String create(int length, int module) {
        char[] cs = new char[length];
        Random random = new Random();
        for(int i=0; i<cs.length; i++) {
            cs[i] = alphabets[random.nextInt(module)];
        }
        return String.valueOf(cs);
    }
}
