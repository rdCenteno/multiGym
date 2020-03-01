package multigym.gym.model;

import javax.persistence.*;

@Entity
public class Propuesta {

    private long id;
    private String actividad;
    private boolean dueñoOK;
    private boolean monitorOK;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public boolean isDueñoOK() {
        return dueñoOK;
    }

    public void setDueñoOK(boolean dueñoOK) {
        this.dueñoOK = dueñoOK;
    }

    public boolean isMonitorOK() {
        return monitorOK;
    }

    public void setMonitorOK(boolean monitorOK) {
		this.monitorOK = monitorOK;
	}