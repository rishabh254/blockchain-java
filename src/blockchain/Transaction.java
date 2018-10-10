/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

/**
 *
 * @author ardroid
 */
public class Transaction {
    
    public String sender;
    public String recipient;
    int amount;
    
    public Transaction(String sender, String recipient, int amount)
    {
      this.sender=sender;
      this.recipient=recipient;
      this.amount = amount;
    
    }
    
}
