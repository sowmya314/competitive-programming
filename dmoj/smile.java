import java.util.Scanner;
public class smile {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] adjectives = new String[n];
        String[] nouns = new String[m];
        for (int i = 0; i < n; i++) {
            adjectives[i] = sc.next();
        }
        for (int i = 0; i < m; i++) {
            nouns[i] = sc.next();
        }
        for (String adjective: adjectives) {
            for (String noun: nouns) {
                System.out.println(adjective + " as " + noun);
            }
        }
        sc.close();
    }
}
