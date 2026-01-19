package ex_17_StringBuilder_StringBuffer;
/*Disadvantage of using a **String Class - Immutable in nature. - By Default - Java -> **String Class (C)

- StringBuilder(C) and StringBuffer(C) are classes that provide mutable sequences of characters.
- They are designed for efficient **string manipulation operations, such as appending,
inserting, or deleting characters from a string.**
- The main difference between StringBuilder and StringBuffer is that
**StringBuilder is not thread-safe**, while _**StringBuffer is thread-safe.(slow).**_
- **StringBuilder is faster** and more efficient in single-threaded environments,
while **StringBuffer is safer to use in multi-threaded environments.**
*/
public class Lab_116_StringBuilder_StringBuffer { public static void main(String[] args) {


    String name = "Sonal";

    System.out.println(name.length());
    System.out.println(name.charAt(3));
//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException: Index 10 ou

    // 2. concat()
    System.out.println(name.concat(" Patel"));

    // 3. contains()
    System.out.println(name.contains("om"));

    // 4. equals()
    System.out.println(name.equals("Sonal"));

    // 5. equalsIgnoreCase()
    System.out.println(name.equalsIgnoreCase("sonal"));

    // 6. indexOf() //  sonal -> ? o
    System.out.println(name.indexOf('o'));

    String s1 = "madam";
    // Returns the index within this string of the
    // first occurrence of the specified substring.
    System.out.println(s1.indexOf("m"));

    // 7. length()
    System.out.println(name.length());

    // 8. replace( , )
    System.out.println(name.replace('n', 'N'));

    // 10. substring( , )
    System.out.println(name.substring(1, 3));

    // 11. toLowerCase()
    System.out.println("SONAL".toLowerCase());

    // 12. toUpperCase()
    System.out.println("sonal".toUpperCase());

    // 14. startsWith()
    System.out.println(name.startsWith("S"));

    // 15. endsWith()
    System.out.println(name.endsWith("a"));

    // 16. trim()
    String name3 = "    Sonal Harish     ";
    System.out.println(name3.trim());

    // 17. compareTo()
    System.out.println(name.compareTo("Sonal"));


    // --------------
    StringBuilder stringBuilder = new StringBuilder("Sonal");
    System.out.println(stringBuilder);

    stringBuilder.reverse();
    System.out.println(stringBuilder);

    StringBuilder sb = new StringBuilder("Hi");
    System.out.println(sb.toString());
}
}
