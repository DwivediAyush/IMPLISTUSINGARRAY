import java.util.*;

public class codechef {public static String compare(String s1, String s2)
{
    HashSet<Character> h1 = new HashSet<Character>(), h2 = new HashSet<Character>();
    //	String s1="abcaa";
    //	String s2="bcddd";
    for(int i = 0; i < s1.length(); i++)
    {
        h1.add(s1.charAt(i));
    }
    for(int i = 0; i < s2.length(); i++)
    {
        h2.add(s2.charAt(i));
    }
    h1.retainAll(h2);
    Character[] res = h1.toArray(new Character[0]);
    String a=Arrays.toString(res);
/*for(int i=0;i<res.length;i++)
{
    System.out.print(res[i]);
}*/
   return a;

}
    public static void main (String[] args) {
        // System.out.println(newdist("abcaa"));
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        s.nextLine();
        while(t-->0)
        {  int l=0;
            int[] f=new int[26];
            int n=s.nextInt();
            s.nextLine();
            String[] st=new String[n];
            for(int i=0;i<n;i++)
                st[i]=s.nextLine();
            String a=st[0];
            for(int i=1;i<st.length;i++)
            {
                a=compare(a,st[i]);
            }

            System.out.println(a.length());
        }
    }
}
