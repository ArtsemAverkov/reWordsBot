package com.example.reWord.service;


import java.io.FileNotFoundException;
import java.io.FileReader;


public interface AddWordInDB {
    void add (FileReader file) throws FileNotFoundException;
}
