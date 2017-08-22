package com.platzi.hibernate;

import java.util.List;

import com.platzi.hibernate.dao.TeacherDaoImpl;
import com.platzi.hibernate.model.Teacher;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
       /** //Crear session con Hibernate
        SessionFactory sessionFactory;
        Configuration configuration = new Configuration();
        configuration.configure();
        sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        //Interactua con la Session e inserta datos
        Teacher teacher = new Teacher("Anahi Salgado", "Avatar");
        //Course course = new Course("Java Avanzado", "Tema 1", "Rest API");
        session.beginTransaction();
        session.save(teacher);
        session.getTransaction().commit();**/
        
        
        Teacher teacher = new Teacher("Kevin", "Avatar");
        TeacherDaoImpl teacherDaoImpl = new TeacherDaoImpl();
        teacherDaoImpl.saveTeacher(teacher);
        
        List<Teacher> teachers = teacherDaoImpl.findAllTeachers();
        
        for (Teacher t : teachers) {
			System.out.println("Nombre: "+ t.getName());
		}
        
    }
}
