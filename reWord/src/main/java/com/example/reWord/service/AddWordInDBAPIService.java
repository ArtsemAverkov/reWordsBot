package com.example.reWord.service;


import com.example.reWord.entity.Word;
import com.example.reWord.repository.AddWordDB;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.io.FileReader;
import java.util.Scanner;

@Service
@RequiredArgsConstructor
public class AddWordInDBAPIService implements AddWordInDB{
    private final AddWordDB addWordDB;

    @Override
    public void add(FileReader file) {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            Word word = word(scanner.nextLine());
            addWordDB.save(word);
        }
    }

    private Word word(String s){
        return Word.builder()
                .word(s)
                .build();
    }
}
