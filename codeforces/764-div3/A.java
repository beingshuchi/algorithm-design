import java.io.*;
class A
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
			   [3|4|2|4|1|2]
			   [3|4|2|4|2|2]
			   [3|4|3|4|3|3]
			   [4|4|4|4|4|4]
			   
			   3 steps
			   
			   find minEl = 1
			   find maxEl = 4
			   min steps = maxEl - minEl that is number of steps to reach min ele to attain the value of max
			*/
			 int n = inputInt();
			 int arr[] = new int[n];
			 for(int i = 0; i<n; i++){
				 arr[i] = inputInt();
			 }
			 int minOp = minOperations(arr,n);
			 println(minOp);
			 t--;
		 }
        bw.flush();
        bw.close();
    }
	
	private int minOperations(int []arr, int n){
		 int min =  Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;
     for(int num : nums){
         if(num <  min ){
             min = num;
         }
     }
      for(int num : nums){
         if(num >  max ){
             max = num;
         }
     } 
       
        return max - min;
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