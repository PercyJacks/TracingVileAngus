// This is a solution for the Bloomberg Code Challenge 2018 'Tracing Vile Angus'.
/* For this to work, the stdin inputs need to be static i.e. set before executing the code!
*  So you may need to use an online compile where you set the stdin input before execution.
*/ 
// Percy Jacks

import java.util.*;
import java.util.*;
public class Problem {
    private static List<String> information;
    private static List<String> opl;
    private static char[] message;
    private static int n;
    public static void main(String args[]) {
        getInputs();
        process();
    }
    
    private static void getInputs() {
        Scanner input = new Scanner(System.in);
        information = new ArrayList<String>();
        while (input.hasNext()) {
            information.add(input.nextLine());
        }
        input.close();
        
        System.out.println(information);
        
        message = getCharArray(0, message);
        //printArray(message);
        
        n = Integer.parseInt(information.get(1));
        //System.out.println(n);
        
    }
    
    private static void process() {
        String operation;
        String[] arr;
        int pos;
        char first;
        char second;
        
        // If n = 0, just print out the message because there is no encrypted text.
        if (n == 0) {
            printArray(message);
        } else {
            // Remove the first two lines from the information string, leaving only the operation there so that it is easier to work with.
            opl = new ArrayList<String>(information);
            opl.remove(0);
            opl.remove(0);
            System.out.println(opl);
            // Get the operation string and store them in their respective variables.
            // Perform the swaps
            for (int i=opl.size()-1; i>=0; i--) {
                operation = opl.get(i).toString();
                arr = operation.split(" ");
                printArray(arr);
                pos = Integer.parseInt(arr[0]);
                first = arr[1].charAt(0);
                second = arr[2].charAt(0);
                
                message = performSwap(pos, first, second);
                printArray(message);
            }
        }
    }
    
    private static char[] performSwap(int pos, char first, char second) {
        char[] newMessage;
        for (int i = pos; i<message.length; i++) {
            if (message[i] == first || message[i] == Character.toUpperCase(first)) {
                if (message[i] == Character.toUpperCase(first)) {
                    message[i] = Character.toUpperCase(second);
                } else {
                    message[i] = second;
                }
            }
            else if (message[i] == second || message[i] == Character.toUpperCase(second)) {
                if (message[i] == Character.toUpperCase(second)) {
                    message[i] = Character.toUpperCase(first);
                } else {
                    message[i] = first;
                }
            }
            
        }
        return newMessage = message;
    }
    
    private static char[] getCharArray(int itr, char[] arr) {
        return arr = information.get(itr).toCharArray();
    }
    
    private static void printArray(char[] arr) {
        System.out.print("[");
        for (int j=0; j<arr.length; j++) {
            System.out.print(arr[j]);
            
        }
        System.out.println("]");
    }
    
    private static void printArray(String[] arr) {
        System.out.print("[");
        for (int j=0; j<arr.length; j++) {
            System.out.print(arr[j]);
            
        }
        System.out.println("]");
    }
}

