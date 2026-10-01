package edu.iesam.superhero.feature.list.presentation

import edu.iesam.superhero.feature.list.data.StudentDataRepository
import edu.iesam.superhero.feature.list.domain.DeleteStudentUseCase
import edu.iesam.superhero.feature.list.domain.GetStudentUseCase
import edu.iesam.superhero.feature.list.domain.SaveStudentUseCase
import edu.iesam.superhero.feature.list.domain.Student

class StudentView {
    private val repository = StudentDataRepository();

    fun printStudent(){
        val getStudentUseCase = GetStudentUseCase(repository);
        val characterModels = getStudentUseCase.execute();
        println(characterModels);
    }

    fun saveStudent(){
        val saveStudent = SaveStudentUseCase(repository);
        val student1 = Student("001", "Maria", "Fernandez")
        printStudent();
        saveStudent.execute(student1);
        printStudent()
    }

    fun deleteStudent(){
        val deleteStudent = DeleteStudentUseCase(repository);

        printStudent();
        deleteStudent.execute("001");
        printStudent();
    }

}