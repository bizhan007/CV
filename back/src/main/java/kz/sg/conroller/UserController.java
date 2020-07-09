package kz.sg.conroller;

import kz.sg.model.Content;
import kz.sg.model.Project;
import kz.sg.model.Resume;
import kz.sg.model.User;
import kz.sg.service.ContentService;
import kz.sg.service.ProjectService;
import kz.sg.service.ResumeService;
import kz.sg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ContentService contentService;

    @Autowired
    private ProjectService projectService;

    @Autowired
    private ResumeService resumeService;

    @GetMapping("/getUsers")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/getContents")
    public List<Content> getContents(){
        return contentService.getContents();
    }

    @GetMapping("/getProjects")
    public List<Project> getProjects(){ return projectService.getProjects(); }

    @GetMapping("/getResumes")
    public List<Resume> getResumes(){
        return resumeService.getResumes();
    }

    @GetMapping("/getContentById")
    public List<Content> getContentByID(@RequestParam(name = "id", required = false) Integer id){
        System.out.println("great");
        return contentService.getContentByID(id);
    }

    @GetMapping("/getProjectById")
    public List<Project> getProjectByID(@RequestParam(name = "id", required = false) Integer id){
        return projectService.getProjectById(id);
    }

    @GetMapping("/getResumeById")
    public List<Resume> getResumeByID(@RequestParam(name = "id", required = false) Integer id){
        return resumeService.getResumeById(id);
    }
}
