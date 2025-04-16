import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Input second string: ");
        String str2 = scanner.nextLine();

        System.out.println("\n--- String ---");
        processString(str1, str2);

        System.out.println("\n--- StringBuilder ---");
        processBuilder(new StringBuilder(str1), new StringBuilder(str2));

        scanner.close();
    }

    private static void processString(String s1, String s2) {
        // length
        System.out.println("Length1: " + s1.length());
        System.out.println("Length2: " + s2.length());

        // compare
        System.out.println("equals(): " + s1.equals(s2));
        System.out.println("compareTo(): " + s1.compareTo(s2));
        System.out.println("== : " + (s1 == s2));

        // concat
        System.out.println("Concat: " + s1 + s2);

        // variant 5: count + replace " o"
        System.out.println("Count ' o': " + countSpaceO(s1));
        System.out.println("Replace ' o': " + s1.replace(" o", "*"));

        // check second starts with 'a'
        System.out.println("Second starts with 'a': " + hasWordStartingA(s2));
    }

    private static void processBuilder(StringBuilder sb1, StringBuilder sb2) {
        // length
        System.out.println("Length1: " + sb1.length());
        System.out.println("Length2: " + sb2.length());

        // compare
        System.out.println("equals(): " + sb1.toString().equals(sb2.toString()));
        System.out.println("compareTo(): " + sb1.toString().compareTo(sb2.toString()));
        System.out.println("== : " + (sb1 == sb2));

        // concat (appends to sb1)
        System.out.println("Concat: " + sb1.append(sb2).toString());

        // variant 5: count + replace " o"
        String full1 = sb1.toString();
        System.out.println("Count ' o': " + countSpaceO(full1));
        System.out.println("Replace ' o': " + full1.replace(" o", "*"));

        // check second starts with 'a'
        System.out.println("Second starts with 'a': " + hasWordStartingA(sb2.toString()));
    }

    private static int countSpaceO(String s) {
        int c = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) == 'o') c++;
        }
        return c;
    }

    private static boolean hasWordStartingA(String s) {
        for (String w : s.split("\\s+")) {
            if (w.startsWith("a")) return true;
        }
        return false;
    }
}
