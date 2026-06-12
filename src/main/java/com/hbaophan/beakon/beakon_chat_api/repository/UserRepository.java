package com.hbaophan.beakon.beakon_chat_api.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hbaophan.beakon.beakon_chat_api.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByPublicId(String publicId);
    Optional<User> findByEmail(String email);
}
