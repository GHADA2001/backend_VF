package com.fsb.eblood.dao.repositories;


import com.fsb.eblood.dao.entities.Event;
import com.fsb.eblood.dao.entities.Invitation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvitationRepository extends JpaRepository<Invitation, Integer> {
    void deleteByEvent(Event event);
}
