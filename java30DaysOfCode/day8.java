//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.util.Map;
import java.util.HashMap;

class day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            hmap.put(name, phone);

        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
             
            try{
                int key = hmap.get(s);

                System.out.println(s+"="+key);
            }
            catch(Exception e){
                System.out.println("Not found");
            }
        }
        in.close();
    }
}