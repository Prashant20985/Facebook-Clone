package com.clone.facebookclone.Model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostModal {

    private String id;
    private String post;
    private String name;
    private String email;
    private String image;
    private String profilePic;
    private String timeStamp;
    private String file;
}
