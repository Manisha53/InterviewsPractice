import java.util.*;

public class Login{
    
    private String userName;
    private String password;
    
    public boolean validate(){
        boolean flag=false;
        
        if(getUserName().equals("john") && getPassword().equals("123abc")) flag=true;
        
        return flag;
        
    }
    public Login(String userName,String password){
        this.userName=userName;
        this.password=password;
    } 
    
    public String getUserName(){
        return userName;
    }
    public String getPassword(){
        return password;
    }
    public void setUserName(String userName){
        this.userName=userName;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public static void main (String[] args) {
        Scanner in=new Scanner(System.in);
    
        System.out.println("Enter the username:");
        String un=in.next();
    
        System.out.println("Enter the password:");
        String pass=in.next();
        
        Login l= new Login(un,pass);
        if(l.validate()){
            System.out.println("Valid user");
        }
        else{
            System.out.println("Invalid user");
        }
    }
}
