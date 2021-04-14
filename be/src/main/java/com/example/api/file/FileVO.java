package com.example.api.file;

import javax.persistence.*;

@Entity
@Table(name="files")
public class FileVO {

    @Id
    @GeneratedValue
    @Column(name="file_id") private long fileId;

    @Column(name="saved_file_name") private String savedFileName;

    @Column(name="original_file_name") private String originalFileName;

    @Column(name="file_size") private long fileSize;
}
