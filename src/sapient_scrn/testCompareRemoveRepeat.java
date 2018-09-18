package sapient_scrn;

public class testCompareRemoveRepeat {

	public static void main(String[] args) {


		String s1 = "geek for geeks";
		String s2 = "mask";
		StringBuffer s3 =new StringBuffer();
		for(int i=0;i<s1.length();i++) {
			
			if(s2.indexOf(s1.charAt(i))<0) {
				s3=s3.append(s1.charAt(i));
			}
		}
		System.out.println(s3);

	}

}
