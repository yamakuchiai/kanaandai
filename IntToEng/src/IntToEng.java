package src;
import java.util.Scanner;
public class IntToEng {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		  Scanner sc = new Scanner(System.in);
	        int input = 1088;
	        System.out.println(translateEng(input));
	    }

	    // 数値を英訳する変換するメソッド
	    static String translateEng(int n) {
	        String number=String.valueOf(n);
	        char[] c = number.toCharArray();
	        String[] s=getEng(c.length,c);
	    	String eng="";
	    	for(int i=0;i<s.length;i++) {
	    		eng+=s[i];
	    	}
	        return eng;
	}
static String[] getEng(int length,char[] c) {
	String[] s=new String[length];
	if(length>0) {
		if(length==2&&c[length-2]!='1'||length<2||length>2) {
			if(c[length-1]=='1') {
				s[length-1]="one";
			}else if(c[length-1]=='2') {
				s[length-1]="two";
			}else if(c[length-1]=='3') {
				s[length-1]="three";
			}else if(c[length-1]=='4') {
				s[length-1]="four";
			}else if(c[length-1]=='5') {
				s[length-1]="five";
			}else if(c[length-1]=='6') {
				s[length-1]="six"; 
			}else if(c[length-1]=='7') {
				s[length-1]="seven";
			}else if(c[length-1]=='8') {
				s[length-1]="eight";
			}else if(c[length-1]=='9'){
				s[length-1]="nine";	
			}else {
				s[length-1]="";
			}
		}	
	}
	if(length>1) {
		if(c[length-2]=='1') {
			if(c[length-1]=='1') {
				s[length-2]="eleven";
			}else if(c[length-1]=='2') {
				s[length-2]="twelve";
			}else if(c[length-1]=='3') {
				s[length-2]="thirteen";
			}else if(c[length-1]=='4') {
				s[length-2]="fourteen";
			}else if(c[length-1]=='5') {
				s[length-2]="fifteen";
			}else if(c[length-1]=='6') {
				s[length-2]="sixteen";
			}else if(c[length-1]=='7') {
				s[length-2]="seventeen";
			}else if(c[length-1]=='8') {
				s[length-2]="eightteen";
			}else if(c[length-1]=='9') {
				s[length-2]="nineteen";
			}else{
				s[length-2]="ten";
			}
		s[length-1]=" ";
		}
		else if(c[length-2]=='2') {
			s[length-2]="twenty ";
		}else if(c[length-2]=='3') {
			s[length-2]="thirty ";
		}else if(c[length-2]=='4') {
			s[length-2]="fourty ";
		}else if(c[length-2]=='5') {
			s[length-2]="fifty ";
		}else if(c[length-2]=='6'){
			s[length-2]="sixty ";
		}else if(c[length-2]=='7') {
			s[length-2]="seventy ";
		}else if(c[length-2]=='8') {
			s[length-2]="eightty ";
		}else if(c[length-2]=='9') {
			s[length-2]="ninety ";
		}else {
			s[length-2]="";	
		}
	}
	if(length>2) {
		if(c[length-3]=='1') {
			s[length-3]="one";
		}if(c[length-3]=='1') {
			s[length-3]="one";
		}else if(c[length-3]=='2') {
			s[length-3]="two";
		}else if(c[length-3]=='3') {
			s[length-3]="three";
		}else if(c[length-3]=='4') {
			s[length-3]="four";
		}else if(c[length-3]=='5') {
			s[length-3]="five";
		}else if(c[length-3]=='6') {
			s[length-3]="six"; 
		}else if(c[length-3]=='7') {
			s[length-3]="seven";
		}else if(c[length-3]=='8') {
			s[length-3]="eight";
		}else if(c[length-3]=='9'){
			s[length-3]="nine";	
		}else {
			s[length-3]="";
		}
	if(c[length-3]!='0') s[length-3]+="hundred ";
	}
	if(length>3) {
		if(length>4&&c[length-4]!='1'||length==3) {
		if(c[length-4]=='1') {
			s[length-4]="one";
		}else if(c[length-4]=='2') {
			s[length-4]="two";
		}else if(c[length-4]=='3') {
			s[length-4]="three";
		}else if(c[length-4]=='4') {
			s[length-4]="four";
		}else if(c[length-4]=='5') {
			s[length-4]="five";
		}else if(c[length-4]=='6') {
			s[length-4]="six"; 
		}else if(c[length-4]=='7') {
			s[length-4]="seven";
		}else if(c[length-4]=='8') {
			s[length-4]="eight";
		}else if(c[length-4]=='9'){
			s[length-4]="nine";	
		}else {
			s[length-4]="";
		}
	if(length==4) s[length-4]+=" thousand ";
	}
		if(length==5) {
		if(c[length-5]=='1') {
			if(c[length-4]=='1') {
				s[length-5]="eleven";
			}else if(c[length-4]=='2') {
				s[length-5]="twelve";
			}else if(c[length-4]=='3') {
				s[length-5]="thirteen";
			}else if(c[length-4]=='4') {
				s[length-5]="fourteen";
			}else if(c[length-4]=='5') {
				s[length-5]="fifteen";
			}else if(c[length-4]=='6') {
				s[length-5]="sixteen";
			}else if(c[length-4]=='7') {
				s[length-5]="seventeen";
			}else if(c[length-4]=='8') {
				s[length-5]="eightteen";
			}else if(c[length-4]=='9') {
				s[length-5]="nineteen";
			}else{
				s[length-5]="ten";
			}
			
		s[length-5]+=" thousand ";
		}
		else if(c[length-5]=='2') {
			s[length-5]="twenty ";
		}else if(c[length-5]=='3') {
			s[length-5]="thirty ";
		}else if(c[length-5]=='4') {
			s[length-5]="fourty ";
		}else if(c[length-5]=='5') {
			s[length-5]="fifty ";
		}else if(c[length-5]=='6'){
			s[length-5]="sixty ";
		}else if(c[length-5]=='7') {
			s[length-5]="seventy ";
		}else if(c[length-5]=='8') {
			s[length-5]="eightty ";
		}else if(c[length-5]=='9') {
			s[length-5]="ninety ";
		}else {
			s[length-5]+=" thousand ";	
		}
	}
		
	}
return s;
}
}
