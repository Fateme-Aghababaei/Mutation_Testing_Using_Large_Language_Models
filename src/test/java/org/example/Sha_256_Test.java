package org.example;

import org.junit.Test;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import static org.junit.jupiter.api.Assertions.*;

public class Sha_256_Test {
    @Test
    public void testSha1() throws NoSuchAlgorithmException {
        String input = "test string";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "d5579c46dfcc7f18207013e65b44e4cb4e2c2298f4ac457ba8f82743f31e930b";
        assertEquals(expected, res);
    }

    @Test
    public void testSha2() throws NoSuchAlgorithmException {
        String input = "";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855";
        assertEquals(expected, res);
    }

    @Test
    public void testSha3() throws NoSuchAlgorithmException {
        // Testing with a long input string
        String input = "This is a very long input string to test the behavior of the algorithm with long inputs.";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "7d79585afac48d4aeae07c83823e7356c86db264b4dfbaab6ee0d1f52785be25";
        assertEquals(expected, res);
    }

    @Test
    public void testSha4() throws NoSuchAlgorithmException {
        // Testing with input containing special characters
        String input = "Special characters: !@#$%^&*()_+";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "d6cc2148131bfea1f4f0e496d3e616557f7085b3ab7a6058ace076b1ca360fef";
        assertEquals(expected, res);
    }

    @Test
    public void testSha5() throws NoSuchAlgorithmException {
        String input = "b2d44f65b54b822f6a8b47e60cf60360512c3c43b46adbb33e64ed91ec4541bf";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "8ee75085cb50906f5516cbfa10dad3bb3325bb506e2f6cb3fce59990591fe473";
        assertEquals(expected, res);
    }

    @Test
    public void testSha6() throws NoSuchAlgorithmException {
        String input = "This is not an empty string.";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "f830c4f247a962877065ef8b85aea3c85ce0360796c3fa985de54a44300c27ca";
        assertEquals(expected, res);
    }

    @Test
    public void testSha7() throws NoSuchAlgorithmException {
        // Testing with a long input string
        String input = "lorem ipsum dolor sit amet, consectetur adipiscing elit. sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "a4b09277caf9b1ccd2047b263c75a32d36b886e220047a7c25d244ff87d41c06";
        assertEquals(expected, res);
    }

    @Test
    public void testSha8() throws NoSuchAlgorithmException {
        // Testing with input containing special characters
        String input = "1234567890!@#$%^&*()_+";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "a7cff60022a7c17458e51dfe6920d98256c6a873a676e746ed820af7253d15b3";
        assertEquals(expected, res);
    }

    @Test
    public void testSha9() throws NoSuchAlgorithmException {
        // Testing with input containing special characters
        String input = "AaBbCc123!@#";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "d3f8f9935d4e166966ace34560052cc3f9f81ed4325af975c9b3f287f43864bb";
        assertEquals(expected, res);
    }

    @Test
    public void testSha10() throws NoSuchAlgorithmException {
        // Testing with input containing special characters
        String input = "!@#$%^&*()_+-={}[]:\\\";'<>?,./";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "1316e4cbbdfdc5a249e12b3d2341c095a9485d9b0c6dc052991a9f598999728b";
        assertEquals(expected, res);
    }

    @Test
    public void testSha11() throws NoSuchAlgorithmException {
        // Testing with input containing special characters
        String input = "日本語漢字\uD83D\uDE42\uD83D\uDE80\uD83C\uDF1F";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "ce95391f673ce61e33b5354f9bd61da8860fb0b7e73400bb7db53838a82cdb3b";
        assertEquals(expected, res);
    }

    @Test
    public void testSha12() throws NoSuchAlgorithmException {
        // Testing with input containing special characters
        String input = "   ";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "0aad7da77d2ed59c396c99a74e49f3a4524dcdbcb5163251b1433d640247aeb4";
        assertEquals(expected, res);
    }

    @Test
    public void testSha13() throws NoSuchAlgorithmException {
        // Testing with input containing special characters
        String input = "aB1@ \uD83D\uDE0A";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "efd17caf203b5b3046a5136c10f08223458bb967baaa9fa7ccfdb22207582a67";
        assertEquals(expected, res);
    }

    @Test
    public void testSha14() throws NoSuchAlgorithmException {
        // Testing with input containing special characters
        String input = "aBcDeFgHiJkLmNoPqRsTuVwXyZ0123456789";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "024c86280ffb560b1bf8d3758cdab680811e2bc839258bf41c533f0f2246caba";
        assertEquals(expected, res);
    }

    @Test
    public void testSha15() throws NoSuchAlgorithmException {
        // Testing with input containing special characters
        String input = "a1@B2#C3$dE4%F5^G6&H7*";
        String res = Sha_256_Algorithm.toHexString(Sha_256_Algorithm.getSHA(input));
        String expected = "1373801f14daa53604af0ce660aeb37542261a5bd92060eff5c2cf7cb16681b5";
        assertEquals(expected, res);
    }
}
