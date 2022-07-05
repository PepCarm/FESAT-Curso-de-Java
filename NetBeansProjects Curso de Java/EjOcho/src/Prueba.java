/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pepe
 */
public class Prueba {
    
    /**
     * @param args the command line arguments
     */  
    
    public static void main(String[] args) {
        
        Profesor nuevoProfesor = new Profesor(12,2405.72f,"Martin", "Maunas", 32108760);
        
        
        Alumno alumno1 =new Alumno();
        alumno1.setNombre("Hernan");
        alumno1.setApellido("Gonzalez");
        alumno1.setDni(32102745);
        alumno1.setAniodeIngreso(2020);
        
        Alumno alumno2 = new Alumno();
        alumno2.setNombre("Jorge");
        alumno2.setApellido("Diaz");
        alumno2.setDni(30753012);
        alumno2.setAniodeIngreso(2020);
        
        Alumno alumno3 = new Alumno();
        alumno2.setNombre("Macarena");
        alumno2.setApellido("Salcedo");
        alumno2.setDni(33465210);
        alumno2.setAniodeIngreso(2020);
        
        Alumno alumno4 = new Alumno();
        alumno4.setNombre("Daiana");
        alumno4.setApellido("Flores");
        alumno4.setDni(34555012);
        alumno4.setAniodeIngreso(2020);
        
        Alumno alumno5 = new Alumno();
        alumno5.setNombre("Julia");
        alumno5.setApellido("Martinez");
        alumno5.setDni(340893100);
        alumno5.setAniodeIngreso(2020);
        
        Curso nuevoCurso = new Curso("Algebra",5);
        
        nuevoProfesor.agregarCurso(nuevoCurso);
        alumno1.agregarMateria(nuevoCurso);
        alumno2.agregarMateria(nuevoCurso);
        alumno3.agregarMateria(nuevoCurso);
        alumno4.agregarMateria(nuevoCurso);
        alumno5.agregarMateria(nuevoCurso);
        
        System.out.println(nuevoCurso.agregarAlumno(alumno1));
        System.out.println(nuevoCurso.agregarAlumno(alumno2));
        System.out.println(nuevoCurso.agregarAlumno(alumno3));
        System.out.println(nuevoCurso.agregarAlumno(alumno4));
        System.out.println(nuevoCurso.agregarAlumno(alumno5));
        
        Alumno alumno6 = new Alumno();
        alumno6.setNombre("Damian");
        alumno6.setApellido("Perez");
        alumno6.setDni(34776954);
        alumno6.setAniodeIngreso(2020);
        
        System.out.println(nuevoCurso.agregarAlumno(alumno6));
    }       
}
