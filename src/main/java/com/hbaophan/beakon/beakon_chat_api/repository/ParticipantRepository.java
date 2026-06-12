package com.hbaophan.beakon.beakon_chat_api.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hbaophan.beakon.beakon_chat_api.entity.Participant;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
    List<Participant> findByConversationId(Long conversationId);
    List<Participant> findByUserId(Long userId);
}
