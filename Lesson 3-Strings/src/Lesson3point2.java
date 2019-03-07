
public class Lesson3point2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("a\\b\\c\"d\"");		
		System.out.println("\\t is a tab,\\n is a new line,\\\"prints a \"quote\"");
		System.out.println("\"line one\"\n\\line\ttwo\\");
		System.out.println("\\\\denotes a single line comment\n\\*denotes a multiline comment*\\ ");
		System.out.println("\"\\\\\"\\\"\"\n\t\\\"\\\"\"\"\\\n\\\"\"\"\"\\");
		System.out.println("Bithday".toUpperCase());
		String Word2="it's my party";
		System.out.println(Word2.substring(0,4)+" "+ Word2.substring(9,10)+" "+"\""+Word2.substring(8,13).toUpperCase()+"\"");
		String Word3="whose a whats it";
		System.out.println(Word3.substring(0,6).toUpperCase()+"\n"+"is"+" "+ Word3.substring(8,12).toUpperCase());
		String Word4="Every Way The Wind Blows";
		System.out.println(Word4.substring(0,6).toLowerCase()+ Word4.substring(6,10).toUpperCase()+ Word4.substring(10,14).toLowerCase()+"\\"+ Word4.substring(14,18).toUpperCase()+"\\"+" "+ Word4.substring(18,24).toLowerCase() + " "+ 4 );
		String Word5= "Peter Piper Picked A Peck of Pickled Peppers";
		System.out.println(Word5.substring(19,20)+ " "+ Word5.substring(21,37).toLowerCase()+"\t"+ Word5.substring(37,44).toLowerCase()+" "+ Word5.substring(0,12)+ "\t"+ Word5.substring(12,18).toLowerCase()+ "\t");
		String Word6= "word has 4 letters";
		System.out.println("\""+Word6.substring(9,10)+"\""+" "+Word6.substring(11,18)+" "+Word6.substring(5,9)+"\""+9+"\""+" "+ Word6.substring(11,18));
		String Word7="if SUBSTRING is used";
		System.out.println(Word7.substring(3,13).toLowerCase()+Word7.substring(13,16)+9);
		String Word8="Jim, Jacky, Johnny, Jill";
		System.out.println(Word8.substring(0,3).toLowerCase() +"\\"+Word8.substring(0,3).length()+"\n"+Word8.substring(5,10).toUpperCase()+"\\"+Word8.substring(5,10).length()+"\n"+Word8.substring(12,18).toLowerCase()+"\\"+Word8.substring(12,18).length()+"\n"+ Word8.substring(20,24).toUpperCase()+"\\"+Word8.substring(20,24).length());
	 
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
