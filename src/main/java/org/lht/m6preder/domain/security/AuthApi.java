package org.lht.m6preder.domain.security;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.lht.m6preder.domain.dto.AuthenticationRequest;
import org.lht.m6preder.domain.dto.AuthenticationResponse;
import org.lht.m6preder.domain.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "auth")
@RequiredArgsConstructor
public class AuthApi {

  private final AuthenticationManager manager;
  private final JWTUtil util;
  private final UserService service;

  @PostMapping("/authenticate")
  public ResponseEntity<AuthenticationResponse> createToken(@RequestBody AuthenticationRequest request){

    try{
      manager.authenticate(
              new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
      UserDetails userDetails = service.loadUserByUsername(request.getUsername());
      String jwt = util.generateToken(userDetails);
      return new ResponseEntity<>(new AuthenticationResponse(jwt), HttpStatus.OK);

    }catch (BadCredentialsException e){
      return new ResponseEntity<>(HttpStatus.FORBIDDEN);
    }


  }


}
