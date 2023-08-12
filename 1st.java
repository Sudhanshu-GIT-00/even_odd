import java.io.*;
import java.lang.*;
class test
{
	public static void main(String args[])
	{
		//int x=2;
		//
		int n[]={1,2,3,4,5};
		for(int z:n)
			System.out.println(z);
		
	}
}
/*ID no.			 - 7959
Name.			 - Sudhanshu Ranjan
Course.			 - BCA
Session.		 - 2021-2024
Year.			 - 2023
Bank Account No. - 6705649510
IFSC Code 		 - IDIB000B104
Bank & Branch	 - Indian Bank Buxar,Bihar 802101*/


/*# AUTOBOXING AND UNBOXING features was added in java version 5 and later.this features
provide the faclites to convert autometically rapper class in data type and data type into 
rapper class.
when rapper class is going to be converted into datatype then term is said to be autoboxing,
when data type is going to be converted into rapper class then term is said to be unboxing
clss test
{
	p.s.v.main()
	{
		int x;			int x=12;
		
		integer p= 12;	integer p;
		x=p;//autoboxing	x=p;
		s.o.pln(x);
	}
}
# METHOD OVERLOADING
this is the concept under polymorphism. it is compile time or static binding polymorphism.
this feature provide the more faclity to define more then one methods whoes name is same but 
parameters are diffrent.(with respect two type or with respect to number). */
 

/*VARARGS:- (VARIABLE/varying ARGUMENTS)
	varying
	=>this concept is introduced in java version5 and latter.this creates a list of arguments in methods.
	=>the size of arguments depends upon how many number you are passing.
syntax:-
 public void fn(datatype...var)
 whare:-
 (...) => the three dot is known as elipceces
 var => list of arguments or array of arguments.*/
 
 
/* Array :- collection pf similar type values .it is homogenous list. if java array treated as object and can be declare like
			type array[]={val1,val2,.......}
			i.g int n[]={1,2,3,.....}
			
			type array[]=new type[size];
			i.g int n[]=new int[i];
				property:-
						length:return lengthor size of array
						i.g n.length->5
						class test
						{
							p.s.v.m()
							{
								int n[]={1,2,3,4,5};
								for(int i=0; i<n;i++)
									s.o.pln(n[i]);
							}
						}
static and dynamic declaration:-
static:-> size should be define at the time of declaration
			int n[] = new int[5];
						class test
						{
							p.s.v.m()
							{
							   scanner z=new scanner(system.in);
							   int n[]=new int[5];
							   s.o.pln("enter"+n.length+"values");
							   for(i=0; i<n.lenght;i++)
								  n[i]=z.newInt();
							  for(i=0; i<n.lenght;i++)
								  s.o.pln(n[i]);						  
							   
							}
						}
dynamic declaration :- size should be define after declaration.It means first we create empty array whoes memmory
								or refrence in null then after the define its size.
							
						class test
						{
							p.s.v.m()
							{
								int n[];
							   scanner z=new scanner(system.in);
							   int size,i;
							   s.o.pln("enter size of array");
							   size=z.nextInt();
							n=new int [size];
							s.o.pln("enter"+n.length+"values");
							   for(i=0; i<n.lenght;i++)
								  n[i]=z.newInt();
							  for(i=0; i<n.lenght;i++)
								  s.o.pln(n[i]);						  
							   
							}
						}
						
*/















