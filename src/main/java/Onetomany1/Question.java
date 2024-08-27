package Onetomany1;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Question {
	@Id
	@Column(name ="question_id")
	private int questionid;
	
	private String queston;
	@OneToMany
	private List<Answer> answers;
	
	public Question(int questionid, String queston, List<Answer> answers) {
		super();
		this.questionid = questionid;
		this.queston = queston;
		this.answers = answers;
		
	}
	public Question() {
		// TODO Auto-generated constructor stub
	}
	public int getQuestionid() {
		return questionid;
	}
	public void setQuestionid(int questionid) {
		this.questionid = questionid;
	}
	public String getQueston() {
		return queston;
	}
	public void setQueston(String queston) {
		this.queston = queston;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	
}
