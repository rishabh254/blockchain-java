/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockchain;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ardroid
 */
public class Block {
    
    public String hash;

    public void setHash(String hash) {
        this.hash = hash;
    }

    public  void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
    public String previousHash;

    public String getHash() {
        return hash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public long getProof() {
        return proof;
    }
    public  ArrayList<Transaction> transactions ;
    private long timeStamp; //as number of milliseconds since 1/1/1970.
    public long proof;

    //Block Constructor.
    
    public void printBlock()
    {
     System.out.println(this.previousHash);
    System.out.println(this.getTimeStamp());
    System.out.println(this.getProof());
    System.out.println(this.getHash());
    
    }
    
    public Block(String previousHash , long proof) 
    {
	this.previousHash = previousHash;
	this.timeStamp = new Date().getTime();
        this.proof = proof;
        this.hash=BlockChain.hash(this); //default
        this.transactions = new ArrayList<Transaction>();
        //printBlock();
    }
    
    
     
}
