package org.example1;

import java.util.Collections;
import java.util.List;

/*
 * Los records están diseñados para simplificar la creación de clases que son principalmente una colección de
 * datos (también conocidas como "clases de datos" o "data classes").
 * Proporcionan una manera concisa de definir clases inmutables sin tener que escribir código repetitivo
 * como constructores, equals(), hashCode(), y toString().
 * */

/*
* La interfaz puede sobrar, pero aun asi decidí colocarla ahí.
* Esta clase debe ser completamente inmutable, si debe contener algún valor diferente en algunos de los atributos,
* entonces se debería de crear otro objeto de esta, además por eso en getPermission me aseguro de retornar una colección
* que no se puede modificar*/

/*En el patrón esta clase representa el estado intrínseco (información constante que no cambia)*/
public record UserRole(String roleName, List<String> permissions) implements Role {

    @Override
    public String getRoleName() {
        return roleName;
    }

    @Override
    public List<String> getPermissions() {
        return Collections.unmodifiableList(permissions);
    }
}
