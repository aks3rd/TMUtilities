import com.thinking.machines.utils.*;
class test1
{
public static void main(String gg[]	)
{
System.out.print("Enter a character :");
char m=Keyboard.readCharacter();
System.out.println(m);
char n=Keyboard.readCharacter("Enter a character :");
System.out.println(n);
byte p=Keyboard.readByte("Enter a number :");
System.out.println(p);
short q=Keyboard.readShort("Enter a number :");
System.out.println(q);
int r=Keyboard.readInt("Enter a number :");
System.out.println(r);
long s=Keyboard.readLong("Enter a number :");
System.out.println(s);
float t=Keyboard.readFloat("Enter a number :");
System.out.println(t);
double u=Keyboard.readDouble("Enter a number :");
System.out.println(u);

boolean e=Keyboard.readBoolean("Enter boolean : ");
System.out.println(e);




System.out.print("Enter a string :");
String a=Keyboard.getString();
System.out.println(a);
System.out.print("Enter another string :");
String b=Keyboard.getString();
System.out.println(b);
String c=a+" "+b;
System.out.println(c);
}
}