package com.ilidan.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author ilidan_Y
 * @Package com.ilidan.domain
 * @Description:
 * @date 2018/6/24
 * @Modified by:
 */
@Entity
@Table(name = "t_subject")
public class Subject implements Serializable {

    private static final long serialVersionUID = -1024309605703409028L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 11)
    private String subjectName;

    @Column(length = 11)
    private String teacherName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
}
