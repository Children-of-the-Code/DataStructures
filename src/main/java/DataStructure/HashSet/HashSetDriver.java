package DataStructure.HashSet;

public class HashSetDriver {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>(10000);
        hashSet.add("hash?");
        System.out.println(hashSet.contains("hash?"));
        System.out.println(hashSet.contains("do I exist?"));

        java.util.HashSet<String> javaHash= new java.util.HashSet<String>();
        javaHash.add("abc");
    }
}