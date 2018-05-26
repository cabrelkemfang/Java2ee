package com.coursemanagementsystem.fet.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="course")
public class Course {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private Long courseid;

    @Column( name="course_code")
    private  int courseCode;

    @Column(name="course_title")
    private int courseTitle;

    @Column(name="courseValue")
    private int courseValue;

    @Column(name="course_status")
    private int courseStatus;

    @Column(name = "semester")
    private int semester;

    @Column(name = "level")
    private int level;

    @Column(name = "option")
    private String option;

    @Column(name = "course_master")
    private String courseMaster;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "course_content", joinColumns = @JoinColumn(name = "course_id"), inverseJoinColumns = @JoinColumn(name = "content_id"))
   // @JoinColumn(name = "content_id")
    private Set<Content> content;

    public Long getCourseid() {
        return courseid;
    }

    public void setCourseid(Long courseid) {
        this.courseid = courseid;
    }

    public int getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(int courseCode) {
        this.courseCode = courseCode;
    }

    public int getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(int courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCourseValue() {
        return courseValue;
    }

    public void setCourseValue(int courseValue) {
        this.courseValue = courseValue;
    }

    public int getCourseStatus() {
        return courseStatus;
    }

    public void setCourseStatus(int courseStatus) {
        this.courseStatus = courseStatus;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getCourseMaster() {
        return courseMaster;
    }

    public void setCourseMaster(String courseMaster) {
        this.courseMaster = courseMaster;
    }

    public Set<Content> getContent() {
        return content;
    }

    public void setContent(Set<Content> content) {
        this.content = content;
    }

    public Course(Long courseid, int courseCode, int courseTitle, int courseValue, int courseStatus, int semester, int level, String option, String courseMaster, Set<Content> content) {
        this.courseid = courseid;
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.courseValue = courseValue;
        this.courseStatus = courseStatus;
        this.semester = semester;
        this.level = level;
        this.option = option;
        this.courseMaster = courseMaster;
        this.content = content;
    }

    public Course() {
    }
}
