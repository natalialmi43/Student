package edu.iesam.superhero.feature.list.domain

class DeleteStudentUseCase(private  val studentRepository: StudentRepository) {

    fun execute(student: String){
        studentRepository.deleteStudent(student.id);
    }

}