
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class userModel {
	
	private long id;
	private String userName;
	private String password;
	private String roles;
	private String enabled;
	
	private List<Sala> salas = new ArrayList<Sala>();
	private List<Message> messages = new ArrayList<Message>();
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	@ManyToMany(targetEntity=Sala.class, mappedBy="salas")
	public List<Sala> getSalas() {
		return sala;
	}
	public void setSalas(List<Sala> sala) {
		this.sala = sala;
    }
    @ManyToMany(targetEntity=Message.class, mappedBy="messages")
    public List<Messages> getMessages() {
		return message;
	}
	public void setMessages(List<Messages> message) {
		this.message = message;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setName(String userName) {
		this.userName = userName;
    }
    
	@Override
	public String toString() {
		return "User #" + id;
	}	
}