import java.util.Scanner;
class Result
{
public static void main(String args[])
{
String name, cname, rollno;
int i, Gtotal = 0,count=0;
String subject[] = {"DM","IOS","OOPS","FDS","DAA","Interpersonal skills"};
String subcode[] = {"DM-MA8351","IOS-D8301","OOPS-CS8392","FDSAD8302","DAA-AD8351","IPS-HS8381"};
int midmarks[]= new int[6];
int semmarks[]= new int[6];
Scanner s = new Scanner(System.in);
System.out.println("\t Enter your full name:");
name= s.nextLine();
System.out.println("\t Enter your College Name:");
cname = s.nextLine();
System.out.println("\t Enter your Roll number:");
rollno = s.nextLine();
for(i=0;i<6;i++)
{
System.out.println("\t Enter mid term marks for:"+subject[i]+":");
midmarks[i] = s.nextInt();
}
System.out.println("\n\t\t\t OK NOW!");
for(i=0;i<6;i++)
{
System.out.println("\t Enter final exam marks for:"+subject[i]+":");
semmarks[i] = s.nextInt();
}
System.out.println("\t\t\t\t\t YOUR RESULT\n");
System.out.println("\t\t college: \t"+cname);
System.out.println("\n\t\t Name: "+name);
System.out.println("\t\t Roll Number: \t"+rollno);
System.out.println("\n\t\t"+"subcode"+"\t marks1"+"\t marks2"+"\t Total");
for(i=0;i<6;i++)
{
if(((midmarks[i])+(semmarks[i]))>=40)
{
System.out.println("\t\t"+subcode[i]+"\t\t"+midmarks[i]+"\t\t"+semmarks[i]+"\t\t"+
((midmarks[i])+(semmarks[i])));
}
else
{
System.out.println("\t\t"+subcode[i]+"\t\t"+midmarks[i]+"\t\t"+semmarks[i]+"\t\t"+
((midmarks[i])+(semmarks[i]))+"*");
count++;
}
Gtotal = (Gtotal+((midmarks[i])+(semmarks[i])));
}
if(count>0)
{
System.out.println("\n\t\t Grand total:\t"+Gtotal+"\t Result:\t Fail");
}
else
{
System.out.println("\n\t\t Grand total:\t"+Gtotal+"\t Result:\t Pass");
}
}
}