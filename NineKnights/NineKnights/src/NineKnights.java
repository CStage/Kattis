import java.util.Scanner;

public class NineKnights {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] board = new String[5];
        int index = 0;
        boolean invalid = false;
        int numK = 0;
        for (int i=0; i<=4; i++) {
            board[i]=scan.next();
        }
        for (int i=0; i<=4; i++) {
            index = 0;
            for(int j = 0; j<=4; j++) {
                    index = j+1;
                if (board[i].substring(j,index).equals("k")) {
                    numK+=1;
                    if(i==0) {
                        if (index+2 <=4 && index-2 > 0)
                         if((board[i+1].substring(j+2,index+2).equals("k") || board[i+1].substring(j-2,index-2).equals("k"))){
                                invalid = true;
                        }
                        if (index+1 <=4 && index-2 > 0)
                         if((board[i+2].substring(j+1,index+1).equals("k") || board[i+2].substring(j-1,index-1).equals("k"))){
                                invalid = true;
                        }
                    }
                
                    
                    else if (i==1) {
                        if (index+2 <=4 && index-2 > 0)
                            if((board[i+1].substring(j+2,index+2).equals("k") || board[i+1].substring(j-2,index-2).equals("k"))){
                                invalid = true;
                        }
                        if (index+1 <=4 && index-1 > 0)
                            if((board[i+2].substring(j+1,index+1).equals("k") || board[i+2].substring(j-1,index-1).equals("k"))){
                                invalid = true;
                        }
                        if (index+2 <=4 && index-2 > 0)
                            if((board[i-1].substring(j+2,index+2).equals("k") || board[i-1].substring(j-2,index-2).equals("k"))){
                                invalid = true;
                        }
                    }
                    else if (i==2) {
                        ///Its because 3+2=5 > 4, which makes it out of bounds. Bite the bullet. Make a new if-condition.
                        if (index+2 <=4 && index-2 > 0)
                            if((board[i+1].substring(j+2,index+2).equals("k") || board[i+1].substring(j-2,index-2).equals("k"))){
                                invalid = true;
                        }
                        if (index+1 <=4 && index-1 > 0)
                            if((board[i+2].substring(j+1,index+1).equals("k") || board[i+2].substring(j-1,index-1).equals("k"))){
                                invalid = true;
                        }
                        if (index+2 <=4 && index-2 > 0)
                            if((board[i-1].substring(j+2,index+2).equals("k") || board[i-1].substring(j-2,index-2).equals("k"))){
                                invalid = true;
                        }
                        if (index+1 <=4 && index-1 > 0)
                            if ((board[i-2].substring(j+1,index+1).equals("k") || board[i-2].substring(j-1,index-1).equals("k"))){
                                invalid = true;
                        }
                    }
                    else if (i==3) {
                        if (index+2 <=4 && index-2 > 0)
                            if((board[i+1].substring(j+2,index+2).equals("k") || board[i+1].substring(j-2,index-2).equals("k"))){
                                invalid = true;
                        }
                        if (index+2 <=4 && index-2 > 0)
                            if((board[i-1].substring(j+2,index+2).equals("k") || board[i-1].substring(j-2,index-2).equals("k"))){
                                invalid = true;
                        }
                        if (index+1 <=4 && index-1 > 0)
                            if ((board[i-2].substring(j+1,index+1).equals("k") || board[i-2].substring(j-1,index-1).equals("k"))){
                                invalid = true;
                        }

                    }
                    else if (i==4) {
                        if (index+2 <=4 && index-2 > 0)
                            if((board[i-1].substring(j+2,index+2).equals("k") || board[i-1].substring(j-2,index-2).equals("k"))){
                                invalid = true;
                        }
                        if (index+1 <=4 && index-1 > 0)
                            if ((board[i-2].substring(j+1,index+1).equals("k") || board[i-2].substring(j-1,index-1).equals("k"))){
                                invalid = true;
                        }
                    }
                }
                }
                }
            
        if (invalid || numK != 9) {
            System.out.println("invalid");
        }
        else {
            System.out.println("valid");
        }
        scan.close();
}
}
