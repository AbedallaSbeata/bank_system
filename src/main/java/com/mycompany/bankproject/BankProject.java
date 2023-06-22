
package com.mycompany.bankproject;

import java.util.Scanner;


public class BankProject {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Enter count of accounts : ");
        int count = in.nextInt();
        String[] names = new String[count];
        int[] passwords = new int[count];
        int[] phones = new int[count];
        int[] ids = new int[count];
        int[] balances = new int[count];
        int temp = 0;
        for(int i = 0; i < ids.length; i++) {
            ids[i] = -1;
        } 
        while(true) {
            System.out.println("Login to the bank system: ");
            System.out.println("1- Login as Administrator ");
            System.out.println("2- Login a Customer ");
            System.out.println("3- Exit");
            int choose = in.nextInt();
             if(choose == 1) {
                 System.out.println("<><><><><><><><><><><><><><><><><><><><><> \n1- Login as Administrator");
                  System.out.println("Enter Username: ");
                  String userName = in.next();
                  System.out.println("Enter Password: ");
                  int password = in.nextInt();  
                  if(userName.equals("admin") && password == 123456) {
                       while(true){
                           System.out.println("Enter the type of operation : \n1- Create a new customer account\n2- Deposit an amount in the customer "
                          + "account\n3- Withdrow an amount from the customer account\n4- Modify the customer data\n5- Delete a customer account\n6- Search "
                          + "customer information within the bank\n7- View bank information for all customers\n8- Go back\n"
                          + "<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>");
                          int chooseType = in.nextInt();
                          if(chooseType==1) {
                            System.out.println("Create a new customer account");
                            for(int i=temp; i < ids.length; i++){
                                    System.out.println("Customer ID number: ");
                                    ids[i] = in.nextInt();
                                    System.out.println("Customer Name: ");
                                    names[i] = in.next();
                                    System.out.println("Customer Password: ");
                                    passwords[i] = in.nextInt();
                                    System.out.println("Customer phone number: ");
                                    phones[i] = in.nextInt();
                                    balances[i] =0;
                                    temp++;
                                    break;    
                            }       
                            System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><>");
                            System.out.println("Successfully add");                                              
                         }
                         else if(chooseType == 2) {
                            System.out.println("Deposit an amount in the customer account");
                            System.out.println("Customer ID number: ");
                            int index = -1;
                            int id = in.nextInt();
                            for(int i = 0 ; i < ids.length && ids[i] != -1; i++) {
                                if(ids[i] == id) 
                                    index = i;
                            }
                            System.out.println("How match do you want to add? ");
                            if(index != -1) {   
                                     balances[index] += in.nextInt();
                                     System.out.println("The operation has been successful");         
                            }  
                            else System.out.println("There is an error");
                         }
                         else if(chooseType == 3) {
                          System.out.println("Withdraw an amount from the customer account");
                          System.out.println("Customer ID number: ");
                           int index = -1;
                           int id = in.nextInt();
                           for(int i = 0 ; i < ids.length && ids[i] != -1; i++) {
                               if(ids[i] == id) 
                                   index = i;
                           }
                          System.out.println("How much you want to withdraw? ");
                          if(index != -1){
                                  balances[index] -= in.nextInt();
                                  System.out.println("The operation has been successful");
                          }   
                          else System.out.println("There is an error");    
                         }
                         else if(chooseType == 4) {
                          System.out.println("Modify the customer data");
                          System.out.println("1- Edit Password");
                          System.out.println("2- Edit Phone Number");
                          System.out.println("3- Go Back");
                          int chooseModify = in.nextInt();
                          if(chooseModify==1) {
                              System.out.println("Edit Password");
                              System.out.println("Enter Customer ID: ");
                                int index = -1;
                                int id = in.nextInt();
                                for(int i = 0 ; i < ids.length && ids[i] != -1; i++) {
                                    if(ids[i] == id) 
                                        index = i;
                                }
                                if(index != -1) {
                                     System.out.println("Enter New Password: ");                         
                                     passwords[index] = in.nextInt();
                                     System.out.println("The operation has been successful");
                                }  
                                else System.out.println("There is an error");
                             
                          } else if(chooseModify==2) {
                              System.out.println("Edit Phone Number");
                              System.out.println("Enter Customer ID: ");
                                int index = -1;
                                int id = in.nextInt();
                                for(int i = 0 ; i < ids.length && ids[i] != -1; i++) {
                                    if(ids[i] == id) 
                                        index = i;
                                }
                                if(index != -1) {
                                    System.out.println("Enter New Phone Number: ");
                                    phones[index] = in.nextInt();
                                    System.out.println("The operation has been successful");
                                }  
                                else System.out.println("There is an error");
                              
                          } else if(chooseModify==3) {
                              break;
                          }
                         } else if(chooseType==5) {
                                System.out.println("Delete a customer account");
                                System.out.println("Enter Customer ID: ");
                                int index = -1;
                                int id = in.nextInt();
                                for(int i = 0 ; i < ids.length && ids[i] != -1; i++) {
                                    if(ids[i] == id) 
                                        index = i;
                                }
                                if(index != -1) {
                                    ids[index] = 0;
                                    System.out.println("The operation has been successful");
                                }  
                                else System.out.println("There is an error");
                          
                         } else if(chooseType == 6) {
                                System.out.println("Search customer information within the bank");
                                System.out.println("Enter ID number: ");
                                int index = -1;
                                int id = in.nextInt();
                                for(int i = 0 ; i < ids.length && ids[i] != -1; i++) {
                                    if(ids[i] == id) 
                                        index = i;
                                }
                                if(index != -1) {
                                    System.out.println("ID: "+ids[index]+" | Name: "+names[index]+" | Password: "+passwords[index]+
                                    " | Phone: 0"+phones[index]+" | Balance: $"+balances[index]);
                                }                 
                         } else if(chooseType == 7) {
                           System.out.println("View bank information for all customers");
                          for(int i = 0; i < ids.length && ids[i] != -1 ; i++) {
                              if(ids[i] != 0) {
                                  System.out.println("ID: "+ids[i]+" | Name: "+names[i]+" | Password: "+passwords[i]+
                                    " | Phone: 0"+phones[i]+" | Balance: $"+balances[i]);
                              }                            
                          }
                        } else if(chooseType==8) {
                            break;
                        }
                       }
                  } else {
                       System.out.println("Error in username or password");
                      
                  }
             }
             else if(choose==2) {
                
                  System.out.println("Login as a Customer");
                   System.out.println("Enter ID Customer: ");
                   int idCustomer = in.nextInt();
                   System.out.println("Enter Password Customer");
                   int passCustomer = in.nextInt();
                   int indexId = -1;
                   int indexPass = -1;
                   for(int i =0; i < ids.length; i++) {
                       if(ids[i] == idCustomer)
                           indexId = i;
                   }
                   for(int i =0; i < passwords.length; i++) {
                       if(passwords[i] == passCustomer)
                           indexPass = i;
                   } 
                    if(indexId != -1 && indexPass!= -1 && indexId == indexPass) {
                 while(true) {      
                            System.out.println("<><><><><><><><<><><><><><><><><><><><><><><>");
                            System.out.println("1- View my bank account information\n2- Withdraw "
                            + "money from my account\n3- Exit");
                            int chooseCustomer = in.nextInt();
                            if(chooseCustomer==1){
                                System.out.println("View my bank account information");
                                System.out.println("ID: "+ids[indexId]+" | Name: "+names[indexId]+" | Password: "+passwords[indexId]+
                                         " | Phone: 0"+phones[indexId]+" | Balance: $"+balances[indexId]);
                            } else if(chooseCustomer==2){
                                System.out.println("Withdraw an amount from the account");
                                System.out.println("How much you want to withdraw");
                                balances[indexId] -= in.nextInt();
                                System.out.println("The operation has been successful");
                            } else if(chooseCustomer==3) {
                                break;
                                }
                               }
                              }else{
                        System.out.println("Error ID or password");
                        break;
                    }
                   }
                 
             
             
               else if(choose==3) {
                 System.exit(0);
               }
        }
    }   
}