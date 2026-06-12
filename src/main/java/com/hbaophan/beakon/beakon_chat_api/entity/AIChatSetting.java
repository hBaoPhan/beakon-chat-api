package com.hbaophan.beakon.beakon_chat_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "ai_chat_settings")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AIChatSetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String aiModel;

    private String systemPrompt;

    private boolean isEnabled;

    @OneToOne(mappedBy = "aiSetting")
    private Conversation conversation;
}
