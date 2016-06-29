public class Boiya {
    public static void main(String[] args) {
      int len1, len2, n, i;
      String pos;
      String s1 = "I love neko.";
      String s2 = "I love neko.";

      len1 = s1.length();
      len2 = s2.length();
      n = len1 - len2;

      for(i = 0; i <= n; i++) {
          if(s2.isEmpty()) {
             return;
          }if(s2.equals(s1.substring(i, i +len2))) {
             System.out.printf("%d\n", i + 1);
          }
      }
      return;
    }
}
