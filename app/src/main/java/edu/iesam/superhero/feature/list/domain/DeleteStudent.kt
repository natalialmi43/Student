package edu.iesam.superhero.feature.list.domain

class DeleteStudent(private  val studentRepository: StudentRepository) {

    fun execute(student: Student){
        studentRepository.deleteStudent(student.id);
    }

}