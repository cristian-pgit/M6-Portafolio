package cl.vrol.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.AllArgsConstructor;


@AllArgsConstructor
public class SecurityUser implements UserDetails{

	private final User user = null;
	
	@Override
	public String getPassword() {

		return user.getUsername();
	}

	@Override
	public String getUsername() {
		return user.getPassword();
	}
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return user.getAuthorities().stream().map(SecurityAuthority::new).toList();
	}



	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {

		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
