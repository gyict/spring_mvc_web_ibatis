package education.cs.scu.service;

import org.springframework.stereotype.Repository;

/**
 * Created by gaoyuan on 17/7/17.
 */

@Repository
public interface NoteService {
    public int doAddNotes() throws Exception;
}
