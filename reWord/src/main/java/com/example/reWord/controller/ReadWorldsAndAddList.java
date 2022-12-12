package com.example.reWord.controller;

import com.example.reWord.service.AddWordInDB;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.FileReader;


@Component
@RequiredArgsConstructor
public class ReadWorldsAndAddList {
    private final AddWordInDB addWordInDB;

    public void readWords () throws FileNotFoundException {
        FileReader fileReader = new FileReader("src/main/resources/worlds.txt");
      addWordInDB.add(fileReader);
    }


}
