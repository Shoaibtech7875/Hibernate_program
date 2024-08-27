 package manytomany;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Project {
	@Id
	@Column(name = "Project_Id")
	private int ProjectId;
	
	private  String Projectname;
	@ManyToMany(mappedBy = "projects")
	private List<Emplooye> emplooyes;
	
	public Project(int projectId, String projectname, List<Emplooye> emplooyes) {
		super();
		ProjectId = projectId;
		Projectname = projectname;
		this.emplooyes = emplooyes;
		
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getProjectId() {
		return ProjectId;
	}
	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}
	public String getProjectname() {
		return Projectname;
	}
	public void setProjectname(String projectname) {
		Projectname = projectname;
	}
	public List<Emplooye> getEmplooyes() {
		return emplooyes;
	}
	public void setEmplooyes(List<Emplooye> emplooyes) {
		this.emplooyes = emplooyes;
	}
	
}
