package com.hendisantika.studentreact;

import com.hendisantika.studentreact.entity.Student;
import com.hendisantika.studentreact.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class StudentReactApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentReactApplication.class, args);
    }

    @Component
    public class DatabaseLoader implements CommandLineRunner {

        private final StudentRepository repository;

        @Autowired
        public DatabaseLoader(StudentRepository repository) {
            this.repository = repository;
        }

        @Override
        public void run(String... strings) {
            this.repository.save(new Student("Aokiji", "Kuzan", "aokiji_kuzan@onepiece.com"));
            this.repository.save(new Student("Akainu", "Sakazuki", "akainu_sakazuki@onepiece.com"));
            this.repository.save(new Student("Roronoa", "Zoro", "roronoa_zoro@onepiece.com"));
            this.repository.save(new Student("Franky", "Cyborg", "franky_cyborg@onepiece.com"));
            this.repository.save(new Student("Hendi", "Santika", "hendisantika@konohagakure.com"));
            this.repository.save(new Student("Uzumaki", "Naruto", "uzumaki_naruto@konohagakure.com"));
            this.repository.save(new Student("Hatake", "Kakashi", "kakahis_hatake@konohagakure.com"));
            this.repository.save(new Student("Sakura", "Haruno", "sakura_haruno@konohagakure.com"));
            this.repository.save(new Student("Sasuke", "Uchiha", "sasuke_uchiha@konohagakure.com"));
        }
    }
}
