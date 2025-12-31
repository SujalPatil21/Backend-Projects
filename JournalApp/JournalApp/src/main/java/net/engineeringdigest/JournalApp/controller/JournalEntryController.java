package net.engineeringdigest.JournalApp.controller;
import net.engineeringdigest.JournalApp.JournalAppApplication;
import net.engineeringdigest.JournalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {



    private Map<Long, JournalEntry> journalEntry = new HashMap<>();


    @GetMapping
    public List<JournalEntry> getAll(){


        return new ArrayList<>(journalEntry.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){

        journalEntry.put(myEntry.getId(),myEntry);
        return true;

    }

    @GetMapping("/id/{myId}")
    public JournalEntry journalEntryById(@PathVariable Long myId){

       return journalEntry.get(myId);
    }

    @DeleteMapping("/id/{myId}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long myId){

        return journalEntry.remove(myId);
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long id,@RequestBody JournalEntry myEntry){

        return journalEntry.put(id,myEntry);
    }
}
