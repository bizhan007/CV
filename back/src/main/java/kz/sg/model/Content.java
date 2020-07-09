package kz.sg.model;

import javax.persistence.*;

@Entity
@Table(name = "content")
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String aboutMe;
    private String education;
    private String aboutEducation;
    private Integer educationSkill;
    private String language;
    private Integer languageLvl;

    public Content() {
    }

    public Content(int id, String aboutMe, String education, String aboutEducation, Integer educationSkill, String language, Integer languageLvl) {
        this.id = id;
        this.aboutMe = aboutMe;
        this.education = education;
        this.aboutEducation = aboutEducation;
        this.educationSkill = educationSkill;
        this.language = language;
        this.languageLvl = languageLvl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getAboutEducation() {
        return aboutEducation;
    }

    public void setAboutEducation(String aboutEducation) {
        this.aboutEducation = aboutEducation;
    }

    public Integer getEducationSkill() {
        return educationSkill;
    }

    public void setEducationSkill(Integer educationSkill) {
        this.educationSkill = educationSkill;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Integer getLanguageLvl() {
        return languageLvl;
    }

    public void setLanguageLvl(Integer languageLvl) {
        this.languageLvl = languageLvl;
    }
}