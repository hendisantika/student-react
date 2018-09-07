package com.hendisantika.studentreact.repository;

import com.hendisantika.studentreact.entity.Student;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : student-react
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 08/09/18
 * Time: 05.56
 * To change this template use File | Settings | File Templates.
 */
public interface StudentRepository extends CrudRepository<Student, Long> {
}