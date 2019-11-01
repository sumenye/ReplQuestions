package Assignments;

public class Repl232 {
	

public class position_manger {
  
  public String[][] boardR;//board array

  private String[] shipTypes = new String[]{"ss","m","dddd","ccc"};
  
  public position_manger(String[][] br){
     boardR = br;
  
  }//end constructor
  
  public boolean placeShip(int row,int column,int dir,int shipT){
    if ((shipT>=0 && shipT<4) && (row==column) && (dir==0 ||dir==1))
    return true;
    else return false;
    
  }//end place_ship
  
  public boolean isValidPos(int row,int column,int dir,int len){
    if(len==0){
      if(row==column){
      if (row>=2){
        if(dir==0 ||dir==1)
          return true;
        }
      }
    }
        if(len==1){
      if(row==column){
      if (row>=1){
        if(dir==0 ||dir==1)
          return true;
        }
      }
    }
        if(len==2){
      if(row==column){
      if (row>=3){
        if(dir==0 ||dir==1)
          return true;
        }
      }
    }
    if(len==3){
      if(row==column){
      if (row>=4){
        if(dir==0 ||dir==1)
          return true;
        }
      }
    }
    
    
      
      return true;
  }//end isValidPos
  
  
}

}
