package com.example.domaci3.bootstrap;

import com.example.domaci3.model.Permission;
import com.example.domaci3.model.User;
import com.example.domaci3.repositories.PermissionRepository;
import com.example.domaci3.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class BootstrapData implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PermissionRepository permissionRepository;

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public BootstrapData(UserRepository userRepository,PermissionRepository permissionRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.permissionRepository = permissionRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {

        Permission p1= permissionRepository.save(new Permission(null,"can_read_users"));
        Permission p2= permissionRepository.save(new Permission(null,"can_create_users"));
        Permission p3= permissionRepository.save(new Permission(null,"can_update_users"));
        Permission p4= permissionRepository.save(new Permission(null,"can_delete_users"));

//        System.out.println(p1.getPermissionId().toString());
//        System.out.println(p1.getPermission().toString());


        userRepository.save(new User(null,"Pera","Peric","pperic@gmail.com",passwordEncoder.encode("123"),new ArrayList<Permission>(
                Arrays.asList(p1,p2,p3,p4))));
        userRepository.save(new User(null,"Mara","Maric","mmaric@gmail.com",passwordEncoder.encode("123"),new ArrayList<Permission>(
                Arrays.asList(p1,p2,p3,p4))));
        userRepository.save(new User(null,"Tara","Taric","ttaric@gmail.com",passwordEncoder.encode("123"),new ArrayList<Permission>(
                Arrays.asList(p1,p3))));
        userRepository.save(new User(null,"Normal","Normalic","nnormalic@gmail.com",passwordEncoder.encode("123"),new ArrayList<Permission>(
                Arrays.asList())));
//        System.out.println("Loading Data...");
//
//        String[] FIRST_NAME_LIST = {"John-James", "Justine", "Ahsan", "Leja", "Jad", "Vernon", "Cara", "Eddison", "Eira", "Emily"};
//        String[] LAST_NAME_LIST = {"Booker", "Summers", "Reyes", "Rahman", "Crane", "Cairns", "Hebert", "Bradshaw", "Shannon", "Phillips"};
//        String[] COURSE_LIST = {"Data Science BSc", "Data Science MSci", "Diagnostic Radiography and Imaging (Degree Apprenticeship) BSc (Hons)", "Digital and Technology Solutions degree apprenticeship", "Drama BA", "Drama and Film & Television Studies BA"};
//
//        Random random = new Random();
//
//        List<> teachers = new ArrayList<>();
//        for (int i = 0; i < 3; i++) {
//            Teacher teacher = new Teacher();
//            teacher.setFirstName(FIRST_NAME_LIST[random.nextInt(FIRST_NAME_LIST.length)]);
//            teacher.setLastName(LAST_NAME_LIST[random.nextInt(LAST_NAME_LIST.length)]);
//            teachers.add(teacher);
//        }
//        System.out.println(teacherRepository.saveAll(teachers));
//
//        List<Student> students = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//
//            Student student = new Student();
//            student.setFirstName(FIRST_NAME_LIST[random.nextInt(FIRST_NAME_LIST.length)]);
//            student.setLastName(LAST_NAME_LIST[random.nextInt(LAST_NAME_LIST.length)]);
//
//            Address address = new Address();
//            address.setStreet("Knez Mihajlova");
//            address.setNumber(String.valueOf(i + 1));
//            address.setCity("Belgrade");
//            student.setAddress(address);
//
//            students.add(student);
//            System.out.println(studentRepository.save(student));
//        }
//
//        for (int i = 0; i < COURSE_LIST.length; i++) {
//
//            Course course = new Course();
//            course.setTitle(COURSE_LIST[i]);
//
////            course.setTeacher(teacherRepository.findById((long) (random.nextInt(teachers.size()) + 1)).get());
//            course.setTeacher(teachers.get(random.nextInt(teachers.size())));
//            for (int j = 0; j < 5; j++) {
////                course.getStudents().add(studentRepository.findById((long) random.nextInt(students.size()) + 1).get());
//                course.getStudents().add(students.get(random.nextInt(students.size())));
//            }
//
//            CourseMaterial courseMaterial = new CourseMaterial();
//            courseMaterial.setUrl("/courses/" + COURSE_LIST[i].replaceAll(" ", "-"));
//            courseMaterial.setCourse(course);
//
//            course.setMaterial(courseMaterial);
//            courseRepository.save(course);
//        }
//
//        User user1 = new User();
//        user1.setUsername("user1");
//        user1.setPassword(this.passwordEncoder.encode("user1"));
//        this.userRepository.save(user1);
//
//
//
//        System.out.println("Data loaded!");
    }
}
