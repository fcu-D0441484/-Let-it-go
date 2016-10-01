
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String lyrics=("Let it go!Let it go!Connot hold it back anymore");
		lyrics=lyrics.replaceAll("it", "\"Her\"");
		System.out.println(lyrics.replaceAll("Connot", "Can't"));
	}
}
