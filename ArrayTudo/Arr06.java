package EvolucaoNoJava.ArrayTudo;

import java.util.Scanner;

public class Arr06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = new String[] {"Pedro", "Paula", "Lucas"};
        int index = 0;
        boolean foundFlag = false;
        String searchItem = scan.nextLine();
        for(int i = 0; i < names.length; i++) {
            if(searchItem.equals(names[i])) {
                index = i;
                foundFlag = true;
                break;
            }
        }

        if(foundFlag) {
            System.out.println("String " + searchItem +" is found index: "+ index);
        } else {
            System.out.println("String "+searchItem+" is not found.");
        }

        scan.close();
    }
}
