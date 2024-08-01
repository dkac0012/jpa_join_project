package step03.onetoonejoin;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
@Entity
public class Dept {

	@Id
	@Column(name = "deptno")
	private long deptno;

	@Column(name = "dname", length = 20)
	private String dame;

	@Column(name = "loc", length = 20)
	private String loc;

	@OneToMany(mappedBy = "deptno") 
	public List<Emp> dept = new ArrayList<>();

}
