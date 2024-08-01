package step03.onetoonejoin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

@SequenceGenerator(name = "emp_seq", sequenceName = "emp_seq_id", 
				   allocationSize = 50, initialValue = 1)
@Entity
public class Emp {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "emp_seq")
	@Column(name="empno", nullable = false )
	private long empno;
	
	@Column(name = "ename",length = 20) //컬럼 사이즈 20byte
	private String ename;
	
	@Column(name = "job",length = 20)
	private String job;
	
	@Column(name = "mgr",nullable=true)
	private long mgr;
	
	@Column(name = "hiredate")
//	@Temporal(TemporalType.DATE)
	private String hiredate;
	
	@Column(name = "sal")
	private long sal;
	
	@Column(name = "comm", nullable=true)
	private long comm;
	
    
	@ManyToOne
	@JoinColumn(name="deptno")  //Team3의 pk 변수에 선언된 매핑된 컬럼명
	private Dept deptno;
	
}
