import java.util.Scanner;
class BoxPattern
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the size: ");
int size=sc.nextInt();
System.out.println("(a)");
for (int row = 1; row <=size; row++)
{ 
for (int col = 1; col <=size; col++)
{
if (row == 1 || row == size || col == 1 || col == size){
System.out.print('#'+" ");}
else 
System.out.print(" "+" ");
}
System.out.println();
}
System.out.println("(b)");
for (int row = 1; row <=size; row++)
{ 
for (int col = 1; col <=size; col++)
{
if (row == 1 || row == size || row == col){
System.out.print('#'+" ");}
else 
System.out.print(" "+" ");
}
System.out.println();
}
System.out.println("(c)");
for (int row = 1; row <=size; row++)
{ 
for (int col = 1; col <=size; col++)
{
if (row == 1 || row == size || row + col == size + 1){
System.out.print('#'+" ");}
else 
System.out.print(" "+" ");
}
System.out.println();
}
System.out.println("(d)");
for (int row = 1; row <=size; row++)
{ 
for (int col = 1; col <=size; col++)
{
if (row == 1 || row == size || row == col || row + col == size + 1){
System.out.print('#'+" ");}
else 
System.out.print(" "+" ");
}
System.out.println();
}
System.out.println("(e)");
for (int row = 1; row <=size; row++)
{ 
for (int col = 1; col <=size; col++)
{
if (row == 1 || row == size || col == 1 || col == size || row == col || row + col == size + 1){
System.out.print('#'+" ");}
else 
System.out.print(" "+" ");
}
System.out.println();
}
}
}
