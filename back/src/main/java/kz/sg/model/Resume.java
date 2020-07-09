package kz.sg.model;

import javax.persistence.*;

@Entity
@Table(name = "resume")
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String languageResume;
    private String resumeURL;

    public Resume() {
    }

    public Resume(int id, String languageResume, String resumeURL) {
        this.id = id;
        this.languageResume = languageResume;
        this.resumeURL = resumeURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLanguageResume() {
        return languageResume;
    }

    public void setLanguageResume(String languageResume) {
        this.languageResume = languageResume;
    }

    public String getResumeURL() {
        return resumeURL;
    }

    public void setResumeURL(String resumeURL) {
        this.resumeURL = resumeURL;
    }
}
