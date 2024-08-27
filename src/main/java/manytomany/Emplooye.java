package manytomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Emplooye {
	@Id
	@Column(name = "Emplooye_id")
	private int Emplooyeid;
	private String Emplooyename;
	@ManyToMany
	private List< Project> projects;
	
	public Emplooye(int emplooyeid, String emplooyename, List<Project> projects) {
		
		Emplooyeid = emplooyeid;
		Emplooyename = emplooyename;
		this.projects = projects;
		
	}
	public Emplooye() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmplooyeid() {
		return Emplooyeid;
	}
	public void setEmplooyeid(int emplooyeid) {
		Emplooyeid = emplooyeid;
	}
	public String getEmplooyename() {
		return Emplooyename;
	}
	public void setEmplooyename(String emplooyename) {
		Emplooyename = emplooyename;
	}
	public List<Project> getProjects() {
		return projects;
	}
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	
	
	
	

}
