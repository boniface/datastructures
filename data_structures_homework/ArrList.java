package data_structures_homework;


import java.util.*;


public class ArrList {
    
    public static void main(String [] args){
    
        
        Account account1 = new Account();
        account1.setAccNum(1);
        account1.setAccBranch("NEDBANK");
        
         Account account2 = new Account();
        account2.setAccNum(2);
        account2.setAccBranch("STANDARD BANK");
        
        Account account3 = new Account();
        account3.setAccNum(3);
        account3.setAccBranch("FNB");
        
         Account account4 = new Account();
        account4.setAccNum(4);
        account4.setAccBranch("ABSA");
    
        List listAccounts = new ArrayList();
        listAccounts.add(account1);
        listAccounts.add(account2);
        listAccounts.add(account3);
        listAccounts.add(account4);
        
        System.out.println("The size of the list: " + listAccounts.size());
        
        Set hassh = new HashSet();
        hassh.add(account1);
        hassh.add(account2);
        hassh.add(account3);
        hassh.add(account4);
        
        System.out.println("The items in the hassh bag: " + hassh.size());
        
    }
    
}
