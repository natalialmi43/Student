package edu.iesam.superhero.feature.list.domain

class GetStudentUseCase (private val studentRepository: StudentRepository) {
    fun execute (): List <Student> = studentRepository.getStudent();
}