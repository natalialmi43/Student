package edu.iesam.superhero.feature.list.data

import edu.iesam.superhero.feature.list.domain.Student
import edu.iesam.superhero.feature.list.domain.StudentRepository

class StudentDataRepository : StudentRepository{
    override fun getStudent(): List<Student> {
        TODO("Not yet implemented")
    }

    override fun saveStudent(characterModel: Student) {
        TODO("Not yet implemented")
    }

    override fun deleteStudent(idCharacterModel: String) {
        TODO("Not yet implemented")
    }
}