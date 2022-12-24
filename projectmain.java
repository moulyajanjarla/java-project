import java.util.Random;
import java.util.Scanner;


class loading
{
static void load()//STATIC METHOD
{
System.out.println("\t\t\t\t\tYOUR GAME IS LOADING.....\n");
}
}
class numberpredict
{
int c=0;
Boolean x=true;
int predictedvalue;
Scanner s=new Scanner(System.in);

void guess()
{
    Scanner s=new Scanner(System.in);
System.out.println("\t\t\t\t\tPLEASE ENTER YOUR NAME.....");
String name=s.nextLine();
String Name=name.toUpperCase();//APPLIED STRINGMETHOD LOWERCASE TO UPPERCASE CONVERSION
System.out.println("\t\t\t\t\t==> HEY "+Name+" GUESS A NUMBER BETWEEN BELOW RANGE");
System.out.println("\t\t\t\t\t==> 1 2 3 4 5 6 7 8 9 10");
System.out.println("\t\t\t\t\t==> @"+Name+" DONT REVEAL THE NUMBER!!!");
System.out.println("\t\t\t\t\t==> ADD 1 TO YOUR GUESSED NUMBER IF YOUR SUM IS NOT EQUAL TO 15 PRESS 1;IF ITS 15 THEN PRESS 0 :)");
while(x)
{
int k=s.nextInt();
if(k==1 && c<=15)
{
System.out.println("\t\t\t\t\t@"+Name+" IS YOU SUM IS 15.IF 15 PRESS 0 OR ELSE PRESS 1");
c=c+1;
}
else if(k==0)
{
x=false;
}
}
predictedvalue=15-c;
System.out.println("\t\t\t\t\tMR/MRS "+Name+" YOUR NUMBER IS="+predictedvalue);
}
}
class spaces
{
void spaceprint()
{
System.out.println(" ");
System.out.println(" ");
System.out.println(" ");
}
}

interface credit{
    void credit1print();
    void printing();
    void credit2print();
}
abstract class credit1 implements credit
{
public void credit1print()
{
System.out.println("\t\t\t\t\t\t\t<<<< CREDITS >>>>");
}
public void printing()
{
    System.out.println("\t\t\t\t\t\t\tMADE BY :)");
}
}
class credit2 extends credit1//INHERITING FROM PARENT CLASS CREDIT1
{
public void credit2print()
{
System.out.println("\t\t\t\t\t\t\tMOULYA AND SATHWIKA ");
}
public void printing()
{
    super.printing();  //super key
System.out.println("\t\t\t\t\t\t\t........");
}
}
final class level2
{
   public void promotion2()
   {
     Scanner s=new Scanner(System.in);
     System.out.println("\t\t\t\t\tCONGRATULATIONS YOU ARE ELIGIBLE TO LEVEL 2\n");
     System.out.println("\n\t\t\t\t\t<<<<WELCOME TO LEVEL 2 >>>>\n");
     System.out.println("\t\t\t\t\tIF YOU WANT TO CONTINUE PRESS 9 ELSE PRESS 0");
     int ver=s.nextInt();
     if(ver==9)
     {
      System.out.println("\t\t\t\t\tLOADING.......\n");
     }
     else if(ver==0)
     {
        System.out.println("\t\t\t\t\tWE ARE GLAD TO SEE YOU AGAIN");
        System.exit(0);
     }

   }
public class rule
{
public void display(int a)
{
int rand=a;
System.out.println("\t\t\t\t\t==>MULTIPLY YOUR CHOOSEN NUMBER WITH 2\n");
System.out.println("\t\t\t\t\t==>ADD THE PRODUCT WITH  "+rand+"\n");
System.out.println("\t\t\t\t\t==>DIVIDE THE SUM WITH 2\n");
System.out.println("\t\t\t\t\t==>SUBSTRACT THE CHOOSEN NUMBER FROM QUOTIENT\n");
System.out.println("\t\t\t\t\t==>REMEMBER YOUR ANSWER:\n");
}
}

   public void level2alg()
   {
    Random random=new Random();
    int rand=0;
    while(true)
   {
   rand=random.nextInt(11);
   if(rand!=0)
   break;
   }
   System.out.println("\n\t\t\t\t\tFOLLOW THE STEPS MENTIONED BELOW");
   System.out.println("\t\t\t\t\t---------------------------------------------------");
   System.out.println("\t\t\t\t\tCHOOSE ANY INTEGER NUMBER (SINGLE DIGIT)\n");
   Scanner s=new Scanner(System.in);			
   rule r=new rule(); 
   double total=0;
   Boolean g=true;
   double e=3;
   while(g)
   {
r.display(rand);
System.out.println("\t\t\t\t\t==>IF YOU CLEARED ABOVE STEPS PRESS 1");
double j=s.nextInt();
if(j==1)
{
total=((((e*2)+rand)/2)-e);
System.out.println("\t\t\t\t\tYOUR ANSWER IS = "+total);
g=false;
}
}
System.out.println("\t\t\t\t\tIF YOUR ANSWER IS" +total+ " THEN PRESS 1 IF NOT PRESS 0");
int f=s.nextInt();
if(f==1)
{
System.out.println("\t\t\t\t\tTHANK YOU :)");
}
else
{
System.out.println("\t\t\t\t\tENTER CHOOSEN NUMBER:");
double d=s.nextInt();
System.out.println("\t\t\t\t\t"+d+" * 2 = "+(d*2));
System.out.println("\t\t\t\t\t"+(d*2)+" + "+rand+" = "+((d*2)+rand));
System.out.println("\t\t\t\t\t"+((d*2)+rand)+ " DIVIDE BY 2 = " +(((d*2)+rand)/2));
System.out.println("\t\t\t\t\tSUBTRACT " +(((d*2)+rand)/2)+ " - "+ d);
System.out.println("\t\t\t\t\tYOUR ANSWER  =  "+((((d*2)+rand)/2)-d));
if(total==((((d*2)+rand)/2)-d));
{
System.out.println("\t\t\t\t\tYOUR FINAL ANSWER IS MATCHED WITH PREDICTED VALUE\n");
System.out.println("\n\t\t\t\tYOU HAVE CLEARED ALL LEVELS :) \n");
System.out.println("\n\t\t\t\t\tTHANK YOU :)");
}
}
}
}
 class rules
{
public void print()
{
System.out.println("\t\t\t\t\t................................................................");
System.out.println("\t\t\t\t\tSTEPS NEED TO FOLLOW!!!");
System.out.println("\t\t\t\t\tFIRST YOU SHOULD CHOOSE YOUR NUMBER BETWEEN 1...10");
System.out.println("\t\t\t\t\tEVERY TIME WE ASK YOU ,YOU SHOULD ADD +1 TO YOUR NUMBER");
System.out.println("\t\t\t\t\tAFTER GETTING RESULT 15 YOU SHOULD STOP");
System.out.println("\t\t\t\t\t................................................................");
}
}
 class greet
{
public void display()
{
System.out.println("\t\t\t\t\t<<<< HEY USER WELCOME TO NUMBER PREDICTION GAME >>>>");
}
}

class projectmain
{
public static void main(String args[])
{
    Scanner s=new Scanner(System.in);
    Random objGenerator = new Random();
    int randomNumber = objGenerator.nextInt(100);
    System.out.println("\t\t\t\t\t---------------------------------------------------");
    System.out.println("\t\t\t\t\t| WE NEED TO VERIFY YOU WHETHER HUMAN OR NOT      |");
    System.out.println("\t\t\t\t\t| ENTER THE NUMBER "+randomNumber+"\t\t\t          |");
    System.out.println("\t\t\t\t\t---------------------------------------------------");
    int verify = s.nextInt();
    try
    {
    if(verify==randomNumber)
    {
    System.out.println("\t\t\t\t\tACCESS GRANTED\t\t\t\t");
    }
    else
    {
        System.out.println("\t\t\t\t\tACCESS DENIED\t\t\t\t");
        System.exit(0);
    }
    }
    catch(Exception e)
    {
    System.out.println("ENTER VALID INTEGER TYPE VALUE");
    }
spaces sp=new spaces();
sp.spaceprint();
loading l=new loading();
l.load();
sp.spaceprint();
greet g=new greet();
g.display();	
sp.spaceprint();
System.out.println("\t\t\t\t\tREAD THE STEPS CAREFULLY");
rules r=new rules();
r.print();
sp.spaceprint();
numberpredict n=new numberpredict();
n.guess();
sp.spaceprint();
level2 lev=new level2();
lev.promotion2();
lev.level2alg();
credit2 o=new credit2();
sp.spaceprint();
sp.spaceprint();
o.credit1print();
o.printing();
o.credit2print();
}
}