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
public class ServerResponse {
    String result;
    String description;

    public ServerResponse(String result, String description) {
        this.result = result;
        this.description = description;
    }

    public ServerResponse() {
    }

    public String getDescription() {
        return description;
    }

    public String getResult() {
        return result;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setResult(String result) {
        this.result = result;
    }
    
    
}
