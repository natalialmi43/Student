package edu.iesam.superhero.feature.list.domain

interface StudentRepository {

    fun getStudent(): List<Student>;
    fun saveStudent (characterModel: Student);
    fun deleteStudent (idCharacterModel: String);

}