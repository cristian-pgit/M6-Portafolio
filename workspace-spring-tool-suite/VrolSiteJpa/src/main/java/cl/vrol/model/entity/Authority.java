package cl.vrol.model.entity;

import cl.vrol.util.AuthorityName;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity(name="autorities")
public class Authority {
	
	public Authority(AuthorityName authorityName) {
		this.name = authorityName;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private AuthorityName name;

	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public AuthorityName getName() {
		return name;
	}


	public void setName(AuthorityName name) {
		this.name = name;
	}


	public Authority() {};
}
