package education.cs.scu.service.impl;

import education.cs.scu.mapper.NotesMapper;
import education.cs.scu.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by gaoyuan on 17/7/17.
 */
public class NoteServiceImpl implements NoteService{
    @Autowired
    private NotesMapper notesMapper;

    public int doAddNotes() throws Exception {
        return notesMapper.doAddNotes();
    }
}
