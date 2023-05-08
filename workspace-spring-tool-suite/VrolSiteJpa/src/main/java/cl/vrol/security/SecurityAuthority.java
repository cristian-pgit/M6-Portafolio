package cl.vrol.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import cl.vrol.model.entity.Authority;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {

	@Autowired
	private Authority authority;
	
	
	@Override
	public String getAuthority() {

		return authority.getName().toString();
	}

}
