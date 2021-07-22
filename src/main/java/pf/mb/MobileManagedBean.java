package pf.mb;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name="index" )
public class MobileManagedBean {

	private String username = "";
	private String password = "";
	
	public MobileManagedBean() {
		
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login(){
		if(this.username != null && this.username.equals("admin") && 
				this.password != null && this.password.equals("admin")){
			return "pm:success";
		}
		return "pm:failure";
	}
	

}
