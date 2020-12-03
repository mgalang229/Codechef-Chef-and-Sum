import java.io.*;
import java.util.*;

public class Main {
	static final Reader in = new Reader();
	static final PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) {
		int t=in.nextInt();
		for(int i=1; i<=t; ++i)
			new Solver();
		out.close();
	}
	
	static class Solver {
		Solver() {
			int n=in.nextInt(), k=in.nextInt();
			long a[] = new long[n];
			for(int i=0; i<n; ++i)
				a[i]=in.nextLong();
			Arrays.sort(a);
			int cnt=0, f=0, l=n-1;
			while(f<l) {
				if(a[f]+a[l]==k) {
					cnt=1;
					break;
				} else if(a[f]+a[l]>k)
					l--;
				else
					f++;
			}
			out.println(cnt!=0?"Yes":"No");
		}
	}
	
	static class Reader {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		String next() {
			while(st==null||!st.hasMoreTokens()) {
				try {
					st=new StringTokenizer(in.readLine());
				} catch(Exception e) {}
			}	
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
	}

}
