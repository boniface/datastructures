
package data_structures_homework;

import java.util.*;

public class Account {

private int accNum;
private String accBranch;

    public int getAccNum() {
        return accNum;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public String getAccBranch() {
        return accBranch;
    }

    public void setAccBranch(String accBranch) {
        this.accBranch = accBranch;
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
        final Account other = (Account) obj;
        if (this.accNum != other.accNum) {
            return false;
        }
        return true;
    }

  
@Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.accNum;
        return hash;
    }
    
    
    
    
}
