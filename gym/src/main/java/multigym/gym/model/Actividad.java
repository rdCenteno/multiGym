package multigym.gym.model;
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
    private String monitor;
    private Sala sala;
	
	
	private List<Message> messages = new ArrayList<Message>();
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
    @ManyToMany(targetEntity=Message.class, mappedBy="messages")
    public List<Messages> getMessages() {
		return message;
	}
	public void setMessages(List<Messages> message) {
		this.message = message;
	}
	
	@Override
	public String toString() {
		return "Actividad #" + id;
    }

	public String getMonitor() {
		return monitor;
	}

	public void setMonitor(String monitor) {
		this.monitor = monitor;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
    

}
