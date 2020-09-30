package com.thinking.machines.utils;
import java.io.*;
public class Keyboard
{
private Keyboard()
{

}
private static BufferedReader bufferedReader;
static
{
InputStreamReader inputStreamReader;
inputStreamReader=new InputStreamReader(System.in);
bufferedReader=new BufferedReader(inputStreamReader);
}
public static char getCharacter()
{
char m=' ';
try
{
m=(char)bufferedReader.read();
while(bufferedReader.ready())bufferedReader.read();
}catch(IOException ioException)
{}
return m;
}
public static char getCharacter(String message)
{
System.out.print(message);
return getCharacter();
}
/*
public static char getCharacter()
{
String m=getString();
if(m.lenght()==0)return (char)0;
return m.charAt(0);
}
public static char getCharacter(String message)
{
System.out.print(message);
return getCharacter();
}

*/
public static byte getByte()
{ 
return Byte.parseByte(getString());
}
public static byte getByte(String message)
{
System.out.print(message);
return Byte.parseByte(getString());
}
public static short getShort()
{
return Short.parseShort(getString());
}
public static short getShort(String message)
{
System.out.print(message);
return Short.parseShort(getString());
}

public static int getInt()
{
return Integer.parseInt(getString());
}
public static int getInt(String message)
{
System.out.print(message);
return Integer.parseInt(getString());
}
public static long getLong()
{
return Long.parseLong(getString());
}
public static long getLong(String message)
{
System.out.print(message);
return Long.parseLong(getString());
}
public static float getFloat()
{
return Float.parseFloat(getString());
}
public static Float getFloat(String message)
{
System.out.print(message);
return Float.parseFloat(getString());
}
public static double getDouble()
{
return Double.parseDouble(getString());
}
public static double getDouble(String message)
{
System.out.print(message);
return Double.parseDouble(getString());
}
public static boolean getBoolean()
{
return Boolean.parseBoolean(getString());
}
public static boolean getBoolean(String message)
{
System.out.print(message);
return Boolean.parseBoolean(getString());
}

public static String getString()
{
String line="";
try
{
line=bufferedReader.readLine();
}catch(IOException ioException)
{
//nothing can be done 
System.out.println(ioException);//just for testing
}
return line;
}
public static String getString(String message)
{
System.out.print(message);
return getString();
}
}