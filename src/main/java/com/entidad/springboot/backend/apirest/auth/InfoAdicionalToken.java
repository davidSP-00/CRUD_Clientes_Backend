package com.entidad.springboot.backend.apirest.auth;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import com.entidad.springboot.backend.apirest.models.entity.Usuario;
import com.entidad.springboot.backend.apirest.models.services.IUsuarioService;


@Component
public class InfoAdicionalToken implements TokenEnhancer{
	@Autowired
	private IUsuarioService usuarioService;

	@Override
	public OAuth2AccessToken enhance(OAuth2AccessToken arg0, OAuth2Authentication arg1) {
		// TODO Auto-generated method stub
		Usuario usuario=usuarioService.findByUsername(arg1.getName());
		
		Map<String,Object>info=new HashMap<>();
		info.put("info_adicional", "Hola que tal!".concat(arg1.getName()));
		info.put("nombre", usuario.getNombre());
		info.put("apellido", usuario.getApellido());
		info.put("email", usuario.getEmail());
		((DefaultOAuth2AccessToken)arg0).setAdditionalInformation(info);
		return arg0;
	}

}
