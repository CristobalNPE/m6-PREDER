package org.lht.m6preder.persistence.mapper;

import org.lht.m6preder.domain.dto.User;
import org.lht.m6preder.persistence.entity.Usuario;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

  @Mappings({
          @Mapping(source = "idUsuario", target = "userId"),
          @Mapping(source = "nombre", target = "name"),
          @Mapping(source = "fechaNacimiento", target = "birthday"),
          @Mapping(source = "run", target = "dni"),
          @Mapping(source = "ultimaActualizacion", target = "updatedAt")
  })
  User toUser(Usuario usuario);
  List<User> toUsers(List<Usuario> usuarios);

  @InheritInverseConfiguration
  Usuario toUsuario(User user);

}
