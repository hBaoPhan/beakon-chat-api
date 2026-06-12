package com.hbaophan.beakon.beakon_chat_api.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hbaophan.beakon.beakon_chat_api.entity.ReadReceipt;

@Repository
public interface ReadReceiptRepository extends JpaRepository<ReadReceipt, Long> {
    List<ReadReceipt> findByMessageId(Long messageId);
    List<ReadReceipt> findByUserId(Long userId);
}
