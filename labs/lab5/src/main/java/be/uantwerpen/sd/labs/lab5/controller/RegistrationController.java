package be.uantwerpen.sd.labs.lab5.controller;

import be.uantwerpen.sd.labs.lab5.database.Database;
import be.uantwerpen.sd.labs.lab5.employee.Employee;
import be.uantwerpen.sd.labs.lab5.register_entry.RegisterEntry;

import javax.swing.*;
import java.time.LocalDateTime;

public class RegistrationController implements Controller {
    private final Database db;

    public RegistrationController(Database db) {
        this.db = db;
    }

    private static String norm(String s) {
        if (s == null) return null;
        String t = s.trim();
        return t.isEmpty() ? null : t;
    }

    @Override
    public void addPerson(String name, String function) {
        String cleanName = norm(name);
        String cleanFunction = norm(function);


        if(cleanName == null || cleanName.isEmpty() || cleanFunction == null || cleanFunction.isEmpty()){
            throw new IllegalArgumentException("Please provide both a name and a profession.");
        }
        Employee NewEmployee = new Employee(cleanName,cleanFunction);
        this.db.addEmployee(NewEmployee);

    }

    @Override
    public void updatePerson(Employee updated) {
        String cleanName = norm(updated.name());
        String cleanFunction = norm(updated.function());
        String id = updated.id();

        if(cleanName == null || cleanName.isEmpty() || cleanFunction == null || cleanFunction.isEmpty()){
            throw new IllegalArgumentException("Please provide both a name and a profession.");
        }

        Employee updateEmployee = new Employee(updated.id(),cleanName,cleanFunction);
        this.db.updateEmployee(updateEmployee);
    }

    @Override
    public void deletePerson(Employee e) {
        db.removeEmployee(e);
    }

    @Override
    public void checkIn(Employee e) {
        this.db.checkIn(e);
    }

    @Override
    public void checkOut(Employee e) {
        this.db.checkOut(e);
    }

    @Override
    public void updateEntry(String entryId, boolean checkIn, LocalDateTime timestamp) {
        if(timestamp.isAfter(LocalDateTime.now())){
            throw new IllegalArgumentException("Future timestamps are not allowed.");
        }
        RegisterEntry existing = find(entryId);
        if (existing == null) {
            throw new IllegalArgumentException("Entry not found: " + entryId);
        }

        RegisterEntry updatedEntry = new RegisterEntry(
                existing.id(),
                existing.employee(),
                checkIn,
                timestamp
        );
        this.db.updateEntry(updatedEntry);
    }

    @Override
    public void deleteEntry(String entryId) {
        this.db.removeEntry(entryId);
    }

    private RegisterEntry find(String id) {
        for (Employee e : db.getEmployees()) {
            for (RegisterEntry re : db.getEntriesFor(e)) {
                if (re.id().equals(id)) return re;
            }
        }
        throw new IllegalArgumentException("Entry not found: " + id);
    }
}
