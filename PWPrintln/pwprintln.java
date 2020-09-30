import java.io.*;
import java.awt.datatransfer.*;
import java.awt.*;
class PWPrintln
{
public static void main(String data[])
{
try
{
File file=new File(data[0]);
if(file.exists()==false)
{
System.out.println("File does not exists : "+data[0]);
return;
}
RandomAccessFile raf=new RandomAccessFile(file,"rw");
String line;
StringBuilder sb=new StringBuilder();
while(raf.getFilePointer()<raf.length())
{
line=raf.readLine();
if(line.trim().length()==0) continue;
line=line.trim().replaceAll("\"","\\\\\"");
sb.append("pw.println(\"");
sb.append(line);
sb.append("\");\r\n");
}
raf.close();
Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
Transferable transferable=new StringSelection(sb.toString());
clipboard.setContents(transferable, null);
}catch(Exception e)
{
System.out.println(e);
}
}
}
