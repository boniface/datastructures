import java.util.*;


public class Company {
 
private String compName;
private int compNum;
private String compLocation;  

    public String getCompName() {
        return compName;
    }

    public int getCompNum() {
        return compNum;
    }

    public String getCompLocation() {
        return compLocation;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.compNum;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Company other = (Company) obj;
        if (this.compNum != other.compNum) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
    
    
 //Constructor that initializes the class   
public Company(Builder builder){

compName=builder.compName;
compNum=builder.compNum;    
compLocation=builder.compLocation;

}

public static class Builder{

private String compName;
private int compNum;
private String compLocation;  

    public Builder compName(String val){
            
           this.compName = val; 
           return this;
     }
    
    public Builder compNum(int val){
            
           this.compNum = val; 
           return this;
     }

    public Builder compLocation(String val){
            
           this.compLocation = val; 
           return this;
     }

    public Company build(){
    
        return new Company(this);
    
    }
    
    
    
}   


    
    
    
}
