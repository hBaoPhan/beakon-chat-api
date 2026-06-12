package com.hbaophan.beakon.beakon_chat_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.hbaophan.beakon.beakon_chat_api.entity.FriendShip;

@Repository
public interface FriendShipRepository extends JpaRepository<FriendShip, Long> {
}
