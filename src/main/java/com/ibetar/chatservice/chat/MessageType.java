package com.ibetar.chatservice.chat;

import lombok.Getter;

@Getter
public enum MessageType {
    CHAT, JOIN, LEAVE, NOT_AVAILABLE, TYPING
}