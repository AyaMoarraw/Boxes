
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boxes;
import java.util.Scanner;
/**
 *
 * @author INFORMATEAM
 */
public class Boxes {
enum color {Red,White};
 //method to calculate probability draw a ball red
public static double probRed(int nB,int redB[],int totalB[]){
    double p_red=0;
for(int i=0;i<nB;i++){        
 p_red =p_red+((redB[i]/totalB[i])*(1/nB));
 
 }
return p_red;
}   
//method to calculate probability draw a ball white
public static double probWhite(int nB,int whiteB[],int totalB[])
{    
double p_white=0;
for(int i=0;i<nB;i++){        
 p_white =p_white+((whiteB[i]/totalB[i])*(1/nB));
 }
return p_white;
}
    
    public static void main(String[] args) {
 int box;
 int total=0;
 Scanner input=new Scanner(System.in);
 System.out.println("Enter the number of box:");
 box=input.nextInt();
 if(box<=0){
System.out.println("try again");
 box=input.nextInt();}
 
 int redBox[]=new int[100];
 int whiteBox[]=new int[100];
 int totalBox[]=new int[100];
 
for(int i=0;i<box;i++) 
{System.out.println("enter the number of red balls in box" +(i+1));
redBox[i]=input.nextInt();

if(redBox[i]<0){
System.out.println("try again");
redBox[i]=input.nextInt();}

System.out.println("enter the number of white balls in box" +(i+1));
whiteBox[i]=input.nextInt();

if(whiteBox[i]<0){
System.out.println("try again");
whiteBox[i]=input.nextInt();}

    
 total=redBox[i]+whiteBox[i];
 totalBox[i]=total;
        // TODO code application logic h   
}//end for
System.out.println("Red balls  White balls  total balls");
for(int i=0;i<box;i++)
{System.out.print(redBox[i]+"\t\t"+whiteBox[i]+"\t\t"+totalBox[i]);
System.out.println();}
System.out.println("Do you want calculation ptbability draw red balls or white balls?" +"/t Red for red balls/t White for white balls"+
                                "in the same case letter");

while(true){
String s=input.next();
color c=color.valueOf(s);
switch(c){
case Red: 
 System.out.println("from all boxes or specific box"+"/t A for all boxes /t S for specific box");
 char option=input.next().charAt(0);
 switch(option){
 case 'A':
 for(int i=0;i<box;i++)
 { double p_red =p_red+((redBox[i]/totalBox[i])*(1/box));
 System.out.println(p_red);
 break;
 case 'S':
 System.out.println("enter the number of box");
 int index=input.nextInt();
 double pr=Boxes.probRed(box,redBox,totalBox); //احتمال سحب كرة حمراء من جميع الصنادي
 double probabilityRed=((redBox[index]/totalBox[index])*(1/box))/pr;//احتمال سحب كرة حمراء من صندوق معين
 System.out.println("probabilitr draw a red ball from box"+index+"is"+probabilityRed);
 break;    
 }//end switch red
break;
case White:
System.out.println("from all boxes or specific box"+"/t A for all boxes /t S for specific box");
char option2=input.next().charAt(0);
switch(option2){
 case 'A':
 double p_white=Boxes.probWhite(box,whiteBox,totalBox);      
 System.out.println(p_white);
break;
 case 'S':
 System.out.println("enter the number of box");
 int index2=input.nextInt();
 double pw=Boxes.probWhite(box,whiteBox,totalBox);//احتمال سحب كرة بيضاء من جميع جميع الصناديق
 double probabilityWhite=((whiteBox[index2]/totalBox[index2])*(1/box))/pw;//احتمال سحب كرة بيضاء من صندوق معين
 break;
}//end switch white
break;
default:
System.out.println("try again");
 }
}

}
        // TODO code application logic here
    }
    

