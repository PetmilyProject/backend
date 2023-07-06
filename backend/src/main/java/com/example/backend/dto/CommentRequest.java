package com.example.backend.dto;

import com.example.backend.entity.SharedPet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "of")
@NoArgsConstructor
public class CommentRequest {
    private Long commentId;
    private SharedPet sharedPet;
    private String userName;
    private String commentInfo;
}