import java.io.*;
public class Sorting_names {
	public static void main(String[] args)throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String name[]=new String[35];
		long tel_ph[]=new long[35];
		int i,j=0;
		System.out.println("Enter the names of 35 students along with their respective telephones number");
		for(i=1;i<35;i++) {
			name[i]=br.readLine();
			tel_ph[i]=Long.parseLong(br.readLine());//input completed
		}
		int p=0;
		for(i=0;i<35-1;i++) {
			String s=name[i];
			p=i;
			for(j=i+1;j<35;j++) {
				if(s.compareTo(name[j])<0) {
					s=name[j];
					p=j;
				}
			}
			String tmp=name[i];
			name[i]=name[p];
			name[p]=tmp;
			long a=tel_ph[i];
			tel_ph[i]=a;
		}
		System.out.println("Name of the first 10 students along with their telephone numbers are stated below: ");
		for(i=0;i<10;i++) {
			System.out.println(name[i]+"\t"+tel_ph[i]);
		}
	}
}
