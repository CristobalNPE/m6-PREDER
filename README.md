# Sprint Final Módulo 6 [JAVA-EE con Framework SpringBoot]

#### Desarrollado por Los Huasos TECH:

- [Natalia Ponce](https://github.com/Natalia1428),
- [Diego Saavedra](https://github.com/dleonDesarrollo),
- [Cristóbal Pulgar](https://github.com/CristobalNPE).

## Módelo de Datos

![image](https://user-images.githubusercontent.com/60191320/184059256-c2f7e3cf-3c94-4de6-ad05-8121257dc4c0.png)

## Contexto

Preder, Empresa de Asesorías en Prevención de Riesgos,
busca implementar una solución tecnológica que de respuesta
a la necesidad de sistematizar y organizar eficientemente
todos los procesos e información tanto internos, como de sus clientes.

## Solución

Se ha desarrollado un sistema informático que cubre los procesos de negocio
requeridos por la Empresa,
que ofrece una mejora en la gestión, el control y disponibilidad
de los datos necesarios para su funcionamiento óptimo.

De acuerdo a los requerimientos de la empresa, se ha realizado
algunas implementaciones al sistema, para garantizar el apropiado funcionamiento de este.


- Se definen diversas clases 'entity' con sus propiedades representando a cada
  entidad que conforma el programa y que estructuran las tablas de la base de datos.
- Se utiliza API JPA para interactuar con la base de dato y garantizar la persistencia de los objetos en el programa.
- Conexión a base de datos. Se utilizó una BD local mediante MySQL, en la cual se crean las tablas para
  almacenar la información.
- Creacion de Mapper para el mapeo entre entity y dto.
- Se crean Controladores para la interacción con las vistas.
- Se utilizó Spring security en conjunto con JWT para implementar seguridad básica en el sistema y permitir el ingreso
  de usuarios de distinto perfil.
- Se agrega estilos y responsividad declarados en un archivo independiente.
- Se implementa validaciones para los datos requeridos en los formularios.
- Se consideran todos los enlaces en el sitios para una navegabilidad correcta.

1.- Login de Acceso al Sistema.

	Función que permite el acceso a un usuario al portal
    - Se registró distintos tipos de usuario (Cliente, Administrador, Profesional) para hacer uso de la aplicación.
	- A través de un usuario "diego" y contraseña "diego" con perfil "Administrador".
    - A través de un usuario "natalia" y contraseña "natalia" con perfil "Profesional".
	- A través de un usuario "cristobal" y contraseña "cristobal" con perfil "Cliente".



2.- Gestión de Usuarios de la plataforma.

	- Se crea formulario que permitará agregar un nuevo usuario al sistema dependiendo de su perfil y editarlo en caso de 
    ser requerido. 
    - Perfil "Administrador" tiene acceso a este módulo


3.- Gestión de Capacitaciones

	- Despliega el listado de capacitaciones y formulario para añadir una nueva.
    - Perfil "Cliente" interactua con este módulo

4.- Gestión de Pago

    - Lista de pagos y formulario para ingresar uno nuevo al sistema.
    - Perfil "Administrador" tiene permiso para este item

5.- Gestión de Visitas en Terreno

    - Listado de visitas y formulario para registra un nueva visita en el sistema
    - Perfil "Profesional" gestiona las visitas.


6.- Gestión de Revisiones

    - Listado de revisiones y formulario para registra y editar una revisión en el sistema
    - Perfil "Profesional" y "Admintrativo" interactuan con revisiones.




## Herramientas

- Java 15
- Tomcat 9
- MySQL
- SpringBoot
- DataTables
