import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.TreeMap;

public class MovieFestival {
    static class Reader {
        final private int BUFFER_SIZE = 1 << 16;
        private DataInputStream din;
        private byte[] buffer;
        private int bufferPointer, bytesRead;

        public Reader() {
            din = new DataInputStream(System.in);
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public Reader(String file_name) throws IOException {
            din = new DataInputStream(
                    new FileInputStream(file_name));
            buffer = new byte[BUFFER_SIZE];
            bufferPointer = bytesRead = 0;
        }

        public String readLine() throws IOException {
            byte[] buf = new byte[64]; // line length
            int cnt = 0, c;
            while ((c = read()) != -1) {
                if (c == '\n') {
                    if (cnt != 0) {
                        break;
                    } else {
                        continue;
                    }
                }
                buf[cnt++] = (byte) c;
            }
            return new String(buf, 0, cnt);
        }

        public int nextInt() throws IOException {
            int ret = 0;
            byte c = read();
            while (c <= ' ') {
                c = read();
            }
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (neg)
                return -ret;
            return ret;
        }

        public long nextLong() throws IOException {
            long ret = 0;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();
            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');
            if (neg)
                return -ret;
            return ret;
        }

        public double nextDouble() throws IOException {
            double ret = 0, div = 1;
            byte c = read();
            while (c <= ' ')
                c = read();
            boolean neg = (c == '-');
            if (neg)
                c = read();

            do {
                ret = ret * 10 + c - '0';
            } while ((c = read()) >= '0' && c <= '9');

            if (c == '.') {
                while ((c = read()) >= '0' && c <= '9') {
                    ret += (c - '0') / (div *= 10);
                }
            }

            if (neg)
                return -ret;
            return ret;
        }

        private void fillBuffer() throws IOException {
            bytesRead = din.read(buffer, bufferPointer = 0,
                    BUFFER_SIZE);
            if (bytesRead == -1)
                buffer[0] = -1;
        }

        private byte read() throws IOException {
            if (bufferPointer == bytesRead)
                fillBuffer();
            return buffer[bufferPointer++];
        }

        public void close() throws IOException {
            if (din == null)
                return;
            din.close();
        }
    }

    public static void main(String[] args) throws IOException{
        Reader br = new Reader();
        int n = br.nextInt();
        TreeMap<Integer, Integer> customer_map = new TreeMap<>();
        Integer temp1, temp2;
        for (int i = 0; i < n; i++) {
            temp1 = br.nextInt();
            temp2 = br.nextInt();
            // if (customer_map.containsKey(temp1) && customer_map.containsKey(temp2)) {
            //     customer_map.put(temp1, customer_map.get(temp1) + 1);
            //     customer_map.put(temp2, customer_map.get(temp2) - 1);
            // } else if (customer_map.containsKey(temp1) && !customer_map.containsKey(temp2)) {
            //     customer_map.put(temp1, customer_map.get(temp1) + 1);
            //     customer_map.put(temp2, -1);
            // } else if (!customer_map.containsKey(temp1) && customer_map.containsKey(temp2)) {
            //     customer_map.put(temp1, 1);
            //     customer_map.put(temp2, customer_map.get(temp2) - 1);
                
            // } else {
            //     customer_map.put(temp1, 1);
            //     customer_map.put(temp2, -1);
            // }
            if (customer_map.containsKey(temp2)) {
                if (Math.abs(customer_map.get(temp2)-temp2) > Math.abs(temp1-temp2) ) {
                    customer_map.put(temp2, temp1);
                }
                
            } else {
                customer_map.put(temp2, temp1);
                
            }
            
        }
        Integer count = 0;
        Integer curr = 0;
        for (Entry<Integer, Integer> entry : customer_map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value >= curr) {
                count++;
                curr = key;
            }
            // if ((value > 0) && !flag) {
            //     flag = true;
            // }else if (value <= 0 && flag) {
            //     flag = false;
            //     count++;
            // }


            

        }
        System.out.println(count);
    }
}
