package kz.sg.service;

import kz.sg.model.Content;

import java.util.List;

public interface ContentService {
    List<Content> getContents();
    List<Content> getContentByID(Integer id);
}
