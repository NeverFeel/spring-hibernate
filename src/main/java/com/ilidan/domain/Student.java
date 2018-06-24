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
@Table(name = "t_student")
public class Student implements Serializable {

    private static final long serialVersionUID = -8248425454978102767L;

    @Id
    @GeneratedValue//默认AUTO会生成额外的hibernate_sequence表
    private Long id;

    @Column(length = 11)
    private String studentName;

    @Column()
    private Double score;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }
}
