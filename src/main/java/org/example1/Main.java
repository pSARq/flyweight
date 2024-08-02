package org.example1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*El patrón se encuentra en que estoy llamando el Role de estudiante y admin 2 veces. El rol de Estudiante lo uso
        * en el user1 y el user4. Más adelante hago el llamado del rol Admin en los user 1 y 3.
        * Pero en la clase RoleFactory solo se crea una única vez cada rol, por lo tanto, ahi es donde me ahorro el consumo de
        * memoria porque no tengo que crear tantos objetos que son similares.
        * Revisar documentación de guru al final dice el porqué este patron es diferente al singleton*/
        User user1 = new User("1", "Alice", RoleFactory.getRole("Estudiante", List.of("Ver cursos", "Enviar tareas")));
        User user2 = new User("2", "Bob", RoleFactory.getRole("Maestro", List.of("Crear cursos", "Calificar tareas")));
        User user3 = new User("3", "Charlie", RoleFactory.getRole("Admin", List.of("Administrar usuarios", "Ver reportes")));
        User user4 = new User("4", "Dave", RoleFactory.getRole("Estudiante", List.of("Ver cursos", "Enviar tareas")));

        /*Ejemplo de como la información con el estado extrínseco la puedo modificar*/
        user1.setUserName("Alicia");
        user1.setRole(RoleFactory.getRole("Admin", List.of("Administrar usuarios", "Ver reportes")));

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
        System.out.println("user3 = " + user3);
        System.out.println("user4 = " + user4);

    }
}