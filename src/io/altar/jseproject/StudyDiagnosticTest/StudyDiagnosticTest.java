package io.altar.jseproject.StudyDiagnosticTest;

import java.util.Scanner;

public class StudyDiagnosticTest {

	public static void main(String[] args) {
		
		//oddNumbers();
		primeNumbers();

	}

//------------------------- oddNumbers ---------------------------------------
	
	public static void oddNumbers() {
		
		Scanner scanner = new Scanner(System.in);
		int numbers = 0;
		
		System.out.println("Introduza os números que pretende: ");
		
		while(numbers != -1) {
			
			numbers = scanner.nextInt();
			
			if(numbers % 2 != 0) {
				
				System.out.println(numbers);
			}
		}
	}
	
//----------------------------------------------------------------------------
	
//------------------------------- cookies ------------------------------------
	
	public static void cookies() {
		
		Scanner scanner = new Scanner(System.in);
		
	}
//----------------------------------------------------------------------------
	
//------------------------------- primeNumbers -------------------------------
	
		public static void primeNumbers() {
			
			Scanner scanner = new Scanner(System.in);
			int firstNumber;
			int secondNumber;
			int a = 0;
			int num = 0;
			String primeNumbers = "";
			
			firstNumber = scanner.nextInt();
			secondNumber = scanner.nextInt();
			
			for(firstNumber = firstNumber; firstNumber <= secondNumber; firstNumber++) {
				
				int counter = 0;
				for(num = firstNumber; num >= 1; num--) {
					
					if(firstNumber % num == 0) {
						
						counter = counter + 1;
					}
				} 
				if(counter == 2) {
					
					a += firstNumber;
					primeNumbers = primeNumbers + firstNumber + "";
				}
			}
			System.out.println(a);
		}
//----------------------------------------------------------------------------

//------------------------------- magicNumber --------------------------------
		
		public static void magicNumber() {
			
			Scanner scanner = new Scanner(System.in);
		    Integer number = scanner.nextInt();
		    
		    String numberIsMagic = number.toString();
		    String c = "";
		    
		    for (int i = numberIsMagic.length(); i > 0; i--){
		        
		        c += numberIsMagic.substring(i-1,i);
		    }
		    
		    if (c .equals(numberIsMagic)){
		        System.out.println("Magical");
		    } else {
		        System.out.println("Nonmagical");
		    }
		}
//----------------------------------------------------------------------------
}

------------------------ BICICLETA ------------------------
int c1=1;
int c2=1;
int c3=1;
int contador1=1;
int mudancas = 0;
String bicibleta = s.next();
char[] ch = bicibleta.toCharArray();
int i=0;
for(i=1;i<bicibleta.length(); i++){
if(mudancas>2){
break;
}else if(ch[i-1]==ch[i]){
contador1 += 1;
if(i==bicibleta.length()-1){
c3 = contador1;
break;
}
}else if(ch[i-1]!=ch[i] && mudancas==0){
c1 = contador1;
mudancas += 1;
contador1 = 1;
}else if(ch[i-1]!=ch[i] && mudancas==1){
c2 = contador1;
mudancas += 1;
contador1 = 1;
}else if(ch[i-1]!=ch[i] && mudancas==2){
c2 = contador1;
mudancas += 1;
contador1 = 1;
}
}
if(ch.length==3 && ch[0]==ch[1] && ch[1]==ch[2]){
System.out.println("Like");
}else if(c1 != c2 || c1!=c3 || c2 != c3 || mudancas > 2 || ch.length < 3){
System.out.println("Unlike");
}else if(c1 == c2 && c2 == c3 && mudancas <= 2 ){
System.out.println("Like");
}



------------------------ USBDEVICE ------------------------



for (int i = 1; i<21; i++) {
if ( (i % 3 == 0) && (i % 5 == 0)) {
System.out.println("usbdevice"); 
}
else if (i % 3 == 0) {
System.out.println("usb"); 
}
else if (i % 5 == 0) {
System.out.println("device");
}
else {
System.out.println(i);
}



------------------------ MAGIC NUMBER ------------------------


int n, reverse = 0;
 
 
     Scanner in = new Scanner(System.in);
     n = in.nextInt();
     int a = n;
 
     while( n != 0 )
     {
         reverse = reverse * 10;
         reverse = reverse + n%10;
         n = n/10;
     }
     
     if (reverse == a) {
     
     System.out.println("magical");
     
     }
     
     else {
     
     System.out.println("nonmagical");
     }







------------------------ PRIME NUMBERS ------------------------



 Scanner s = new Scanner(System.in);
  int a = 0;
  Scanner scanner = new Scanner(System.in);
     int i = scanner.nextInt();;
     int num =0;
     //Empty String
     String  primeNumbers = "";
     int n = scanner.nextInt();
     for (i = i; i <= n; i++)     
     {  
        int counter=0; 
        
        for(num =i; num>=1; num--)
        {
   if(i%num==0)
   {
    counter = counter + 1;
   }
        }
if (counter ==2)
{
   //Appended the Prime number to the String
   a += i;
   primeNumbers = primeNumbers + i + " ";
} 
     } 
     System.out.println(a);



------------------------ SUBIR ESCADAS ------------------------


Scanner ss = new Scanner(System.in);


int sobe = ss.nextInt();

int desce = ss.nextInt();

int total = ss.nextInt();


int resultado;

int subida = sobe-desce;


if((total%subida)==0){

resultado = total/subida;

}

else{

resultado = total/subida+1;

}


System.out.println(resultado); 
 
------------------------ BOLACHAS ------------------------



Scanner s = new Scanner(System.in);
int a = s.nextInt();
int result = 0;
 for (int i = a; i >= 1; i-- ) {
 
 
 result += i;
 
 
 }

 System.out.println(result);








------------------------ NUMEROS IMPARES ------------------------


Scanner sss = new Scanner(System.in);
int w = 0;
while(w != -1){
w = sss.nextInt();
if(w==-1){
break;
}else if(w%2!=0){
System.out.println(w);
}
}



	    

