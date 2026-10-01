package edu.iesam.superhero.feature.list.domain

class SaveStudentUseCase(private val studentRepository: StudentRepository) {
    fun execute(student: Student){
        studentRepository.saveStudent(student)
    }
}