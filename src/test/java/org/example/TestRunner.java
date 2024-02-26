package org.example;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Objects;

public class TestRunner {
    private static int killedMutations = 0;
    private static int totalMutations = 0;
    private static String originalCode;
    private static final String ORIGINAL_CODE_FILE_PATH = "src/main/java/org/example/KMP_String_Matching_Algorithm.java";
    private static final String MUTATED_CODE_FOLDER = "src/test/resources/";

    public static void main(String[] args) throws IOException {
        originalCode = getCodeFromFile();

        File path = new File(MUTATED_CODE_FOLDER);
        File[] files = path.listFiles();
        if (files == null) {
            System.err.println("No files found in the specified folder: " + MUTATED_CODE_FOLDER);
            return;
        }

        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                System.out.println("Running Iteration " + i);

                String mutatedCode = new String(Files.readAllBytes(Paths.get(files[i].getPath())));
                saveMutatedCode(mutatedCode);

                System.out.println("Running tests for: " + KMP_String_Matching_Algorithm.class.getName());
                JUnitCore jUnitCore = new JUnitCore();
                Result result = jUnitCore.run(KMP_String_Matching_Test.class);

                System.out.println("  - Ran " + result.getRunCount() + " test" + (result.getRunCount() == 1 ? "" : "s"));
                System.out.println("  - Passed: " + result.wasSuccessful());

                if (!result.wasSuccessful()) {
                    killedMutations++;
                }
                totalMutations++;
            }
            // Restore original code before moving to the next mutation
            saveMutatedCode(originalCode);
        }
        double mutationScore = totalMutations == 0 ? 0 : (double) killedMutations / totalMutations;
        System.out.println("\nLive Mutations: " + (totalMutations - killedMutations));
        System.out.println("Killed Mutations: " + killedMutations);
        System.out.println("Total Mutations: " + totalMutations);
        System.out.println("Final Mutation Score: " + (mutationScore * 100) + "%");
    }

    private static String getCodeFromFile() {
        try {
            return new String(Files.readAllBytes(Paths.get(ORIGINAL_CODE_FILE_PATH)));
        } catch (IOException e) {
            throw new RuntimeException("Error reading original code file", e);
        }
    }

    private static void saveMutatedCode(String mutatedCode) {
        try {
            Files.write(Paths.get(ORIGINAL_CODE_FILE_PATH), mutatedCode.getBytes());
        } catch (IOException e) {
            throw new RuntimeException("Error Saving Mutated Code", e);
        }
    }
}
