package com.jaehong;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
public class StudentServiceTest {

    @Mock
    StudentRepository studentRepository;

    @Test
    public void save() {
        Student student = new Student();

        when(studentRepository.save(student)).thenReturn(student);
        StudentService studentService = new StudentService(studentRepository);

        Student result = studentService.save(student);

        assertThat(student.getCreated()).isNotNull();
        assertThat(student.getStudentStatus()).isEqualTo(StudentStatus.DRAFT);
        assertThat(result).isNotNull();
    }
}