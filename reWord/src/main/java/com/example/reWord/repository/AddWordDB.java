package com.example.reWord.repository;


import com.example.reWord.entity.Word;
import org.springframework.data.repository.CrudRepository;

public interface AddWordDB extends CrudRepository<Word, Long> {
}
