package src;
import java.util.Scanner;
public class IntToEng {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		  Scanner sc = new Scanner(System.in);
	        int input = 99;
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
		if(length==2&&c[0]!='1'||length<2||length>2) {
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
		s[length-1]="";
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
return s;
}
}
