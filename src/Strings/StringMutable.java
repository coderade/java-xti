package Strings;

public class StringMutable
{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
	
	StringBuffer s1 = new StringBuffer();
	StringBuilder s2 = new StringBuilder("Java");
	String test = new String();
	
	
	System.out.println(s2.length());
	System.out.println(s2.capacity());//Returns the current capacity.
	
	System.out.println(s2.reverse());
	
	s2.append(" Developer");
	System.out.println(s2);
	
	String h = "How" + "are" + "you";
	StringBuilder sb = new StringBuilder("How").append("are").append("you");
	
	String url = new StringBuilder("www.Oracle.com").delete(0, 4).toString();
	
	System.out.println(url);
	
	TesteStringB();
	
	}
	public static void TesteStringB() {
        int N = 77777777;
        long t;

        {
            StringBuffer sb = new StringBuffer();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }

        {
            StringBuilder sb = new StringBuilder();
            t = System.currentTimeMillis();
            for (int i = N; i --> 0 ;) {
                sb.append("");
            }
            System.out.println(System.currentTimeMillis() - t);
        }
}
	
}