/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mn.unitel.dummy.services;

/**
 *
 * @author baasankhuu.d@corp.unitel.mn
 */
public class Counter {

    String phoneno;
    String description;
    long amount;
    String type = "negj";

    public Counter(String phoneno, String description, long amount) {
        this.phoneno = phoneno;
        this.description = description;
        this.amount = amount;
    }

    public Counter(String phoneno, String description, long amount, String type) {
        this.phoneno = phoneno;
        this.description = description;
        this.amount = amount;
    }

    public Counter() {
    }

    public String getDescription() {
        return description;
    }

    public long getAmount() {
        return amount;
    }

    public String getPhoneno() {
        return phoneno;
    }

    public String getType() {
        return type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno;
    }

    public void setType(String type) {
        this.type = type;
    }

}
