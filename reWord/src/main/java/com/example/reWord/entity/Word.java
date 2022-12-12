package com.example.reWord.entity;

import com.example.reWord.constant.StatusWord;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Word {
    @Id
    Long id;
    String word;
    String status = String.valueOf(StatusWord.NEW);

}
