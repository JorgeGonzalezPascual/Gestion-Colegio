/**
 * Práctica 1
 * Gestión de actividades de un colegio
 *
 *
 * Autores:
 * Jorge González Pascual - 45694336Y
 * Pablo Nuñez
 * Marc Torres Torres
 *
 *
 * Ultima Modificación:
 * 20/12/2020
 */
package Main;

import Ventanas.VentanaAsignatura;
import Ventanas.VentanaCurso;
import Ventanas.VentanaEstudiante;
import Ventanas.VentanaInicioGestion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import Alumno.Alumno;
import Asignatura.Asignatura;
import Clases.Año;
import Clases.Bachiller;
import Clases.Especialidad;
import Clases.FP;
import Asignatura.Obligatoria;
import Asignatura.Optativa;
import Asignatura.Perfil;
import Lista.Lista_Alumnos;
import Lista.Lista_Asignaturas;
import Lista.Lista_Cursos;

public class Main {

    public static void main(String[] args) {
        try {
            //Cambiamos la interfaz a la del sistema con la siguente línea
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        Lista_Cursos listaCurso = new Lista_Cursos();
        Lista_Asignaturas listaAsignatura = new Lista_Asignaturas();
        Lista_Alumnos listaAlumnos = new Lista_Alumnos();

        VentanaCurso vCurso = new VentanaCurso();
        VentanaAsignatura vAsign = new VentanaAsignatura();
        VentanaEstudiante vEstud = new VentanaEstudiante();

        ////////////       PRUEBAS      //////////
       //relleno(listaCurso, listaAsignatura, listaAlumnos);
        //////////////////////////////////////////

        VentanaInicioGestion vInicio = new VentanaInicioGestion(vCurso, vAsign, vEstud, listaCurso, listaAsignatura, listaAlumnos);

        vCurso.setInicio(vInicio);
        vAsign.setInicio(vInicio);
        vEstud.setInicio(vInicio);

        vInicio.setVisible(true);
    }

    /**
     * Metodo para rellenar con algunos datos las listas
     *
     * @param listaCurso
     * @param listaAsignatura
     * @param listaAlumnos
     */
    public static void relleno(Lista_Cursos listaCurso, Lista_Asignaturas listaAsignatura, Lista_Alumnos listaAlumnos) {
        //CURSOS
        listaCurso.addObject(new FP(0025, "Mantenimiento", Especialidad.ELECTRÓNICA));       // 0
        listaCurso.addObject(new FP(0012, "Técnico informático", Especialidad.INFORMÁTICA)); // 1
        listaCurso.addObject(new FP(0055, "Mecánico", Especialidad.MECÁNICA));               // 2
        listaCurso.addObject(new Bachiller(0033, "Científico", Año.PRIMERO));                // 3
        listaCurso.addObject(new Bachiller(0014, "Social", Año.SEGUNDO));                    // 4
       

        //ASIGNATURAS
        Asignatura a0 = new Obligatoria(22, "Matemáticas", 9.00);
        listaAsignatura.addObject(a0);                // 1
        listaAsignatura.addObject(new Optativa(07, "Música", Perfil.PRACTICO));             // 2
        listaAsignatura.addObject(new Obligatoria(69, "Dibujo", 6.00));                     // 3
        listaAsignatura.addObject(new Optativa(13, "Física", Perfil.TEORICO));              // 4
        listaAsignatura.addObject(new Obligatoria(74, "TIC", 9.00));                        // 5
        listaAsignatura.addObject(new Optativa(13, "Inglés", Perfil.PRACTICO));             // 6
        listaAsignatura.addObject(new Obligatoria(74, "Cultura", 7.50));                    // 7
        listaAsignatura.addObject(new Optativa(13, "Catalán", Perfil.PRACTICO));            // 8

        listaAlumnos.addObject(new Alumno("Ana Bohueles Mucho", "12345678J"));
        listaAlumnos.addObject(new Alumno("Rosa Melano Martinez", "45694668Z"));

        listaCurso.getCurso(0).add(listaAsignatura.getAsignatura(0));
        listaAsignatura.getAsignatura(0).setCursoPerteneciente(listaCurso.getCurso(0).toString());

        listaAsignatura.getAsignatura(0).add(listaAlumnos.getAlumno(0));
        listaAlumnos.getAlumno(0).add(listaAsignatura.getAsignatura(0));

        listaAsignatura.getAsignatura(0).add(listaAlumnos.getAlumno(1));

        listaAlumnos.getAlumno(1).add(listaAsignatura.getAsignatura(0));

        listaCurso.getCurso(0).add(listaAsignatura.getAsignatura(1));
        listaAsignatura.getAsignatura(1).setCursoPerteneciente(listaCurso.getCurso(0).toString());

        listaCurso.getCurso(1).add(listaAsignatura.getAsignatura(2));
        listaAsignatura.getAsignatura(2).setCursoPerteneciente(listaCurso.getCurso(1).toString());

        listaCurso.getCurso(2).add(listaAsignatura.getAsignatura(3));
        listaAsignatura.getAsignatura(3).setCursoPerteneciente(listaCurso.getCurso(2).toString());

        listaCurso.getCurso(3).add(listaAsignatura.getAsignatura(4));
        listaAsignatura.getAsignatura(4).setCursoPerteneciente(listaCurso.getCurso(3).toString());

        listaCurso.getCurso(3).add(listaAsignatura.getAsignatura(5));
        listaAsignatura.getAsignatura(5).setCursoPerteneciente(listaCurso.getCurso(3).toString());

        listaCurso.getCurso(4).add(listaAsignatura.getAsignatura(6));
        listaAsignatura.getAsignatura(6).setCursoPerteneciente(listaCurso.getCurso(4).toString());
    }

}
