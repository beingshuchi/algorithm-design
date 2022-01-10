import java.io.*;
class B
{
    static class Reader 
    { 
        final private int BUFFER_SIZE = 1 << 16; 
        private DataInputStream din; 
        private byte[] buffer; 
        private int bufferPointer, bytesRead;
public Reader() 
        { 
            din = new DataInputStream(System.in); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        }
public Reader(String file_name) throws IOException 
        { 
            din = new DataInputStream(new FileInputStream(file_name)); 
            buffer = new byte[BUFFER_SIZE]; 
            bufferPointer = bytesRead = 0; 
        }
public String readLine() throws IOException 
        { 
            byte[] buf = new byte[64]; // line length 
            int cnt = 0, c; 
            while ((c = read()) != -1) 
            { 
                if (c == '\n') 
                    break; 
                buf[cnt++] = (byte) c; 
            } 
            return new String(buf, 0, cnt); 
        }
public int nextInt() throws IOException 
        { 
            int ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do
            { 
                ret = ret * 10 + c - '0'; 
            }  while ((c = read()) >= '0' && c <= '9');
if (neg) 
                return -ret; 
            return ret; 
        }
public long nextLong() throws IOException 
        { 
            long ret = 0; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read(); 
            do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9'); 
            if (neg) 
                return -ret; 
            return ret; 
        }
public double nextDouble() throws IOException 
        { 
            double ret = 0, div = 1; 
            byte c = read(); 
            while (c <= ' ') 
                c = read(); 
            boolean neg = (c == '-'); 
            if (neg) 
                c = read();
do { 
                ret = ret * 10 + c - '0'; 
            } 
            while ((c = read()) >= '0' && c <= '9');
if (c == '.') 
            { 
                while ((c = read()) >= '0' && c <= '9') 
                { 
                    ret += (c - '0') / (div *= 10); 
                } 
            }
if (neg) 
                return -ret; 
            return ret; 
        }
private void fillBuffer() throws IOException 
        { 
            bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE); 
            if (bytesRead == -1) 
                buffer[0] = -1; 
        }
private byte read() throws IOException 
        { 
            if (bufferPointer == bytesRead) 
                fillBuffer(); 
            return buffer[bufferPointer++]; 
        }
public void close() throws IOException 
        { 
            if (din == null) 
                return; 
            din.close(); 
        } 
    } 
    static Reader sc=new Reader();
    static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
     public static void main(String args[])throws IOException
    {
        /*
         * For integer input: int n=inputInt();
         * For long input: long n=inputLong();
         * For double input: double n=inputDouble();
         * For String input: String s=inputString();
         * Logic goes here
         * For printing without space: print(a+""); where a is a variable of any datatype
         * For printing with space: printSp(a+""); where a is a variable of any datatype
         * For printing with new line: println(a+""); where a is a variable of any datatype
         */
		 
		  int t = inputInt();
		 while(t>0){
			 /**
			  let comm diff be d.
			  1. d = b - a
			    if we can change value 'c'
				   this would mean it would have to be a multiple of :
				     c = b + d
					   = b + (b - a)
					   = 2 * b - a
					 "yes" if (2 * b - a) is positive and also divisble by 'c'
			  2. d = c - b
			     if we can change value 'a'
				   this would mean it would have to be a multiple of :
				     b = a + d
				     a = b - d
					   = b - (c - b)
					   = 2 * b - c
					 "yes" if (2 * b - c) is positive and also divisble by 'a'
			  3. c = a + 2 * d
			     d =  (c-a)/2
				 if we can change value 'b'
				   this would mean it would have to be a multiple of :
				     b = a + d
				       = a + (c - a)/2
					   = (a + c)/2
					 "yes" if (a + c)/2 is positive and not a fraction and also divisble by 'b'
			 */
			int a = inputInt();
			int b = inputInt();
			int c = inputInt();
			int g1 = 2*b-c;
			int g2 = 2*b-a;
			int g3 = a+c;
			if((a-b) ==  (b - c)  || (a == b && c==b) ){
			    System.out.println("YES");
			}else if( g1%a ==0 &&  g1 > 0){
			     System.out.println("YES");
			}else if( g2%c ==0 &&  g2 > 0){
			     System.out.println("YES");
			}else if(g3%2==0 && (g3/2)%b ==0 && (g3)>0){
			     System.out.println("YES");
			} else{
			     System.out.println("NO");
			}
		
			 t--;
		 }
    }
    public static int inputInt()throws IOException
    {
        return sc.nextInt();
    }
    public static long inputLong()throws IOException
    {
        return sc.nextLong();
    }
    public static double inputDouble()throws IOException
    {
        return sc.nextDouble();
    }
    public static String inputString()throws IOException
    {
        return sc.readLine();
    }
    public static void print(String a)throws IOException
    {
        bw.write(a);
    }
    public static void printSp(String a)throws IOException
    {
        bw.write(a+" ");
    }
    public static void println(String a)throws IOException
    {
        bw.write(a+"\n");
    }
}