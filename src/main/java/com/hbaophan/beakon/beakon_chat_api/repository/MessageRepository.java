package com.hbaophan.beakon.beakon_chat_api.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hbaophan.beakon.beakon_chat_api.entity.Message;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    Optional<Message> findByPublicId(String publicId);
    List<Message> findByConversationIdOrderByTimestampDesc(Long conversationId);
}
