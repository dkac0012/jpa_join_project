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
@ToString

@Entity
public class Dept {

	@Id
	@Column(name = "deptno")
	private long deptno;

	@Column(name = "dname", length = 20)
	private String dame;

	@Column(name = "loc", length = 20)
	private String loc;

	// join을 위해서 entity에만 구현하는 변수
	@OneToMany(mappedBy = "deptno") // Member4에서 Team에 조인된 변수명 매핑, 자식의 참조키
	public List<Dept> members = new ArrayList<>();

}
