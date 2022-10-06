package com.example.kotlingradlespring.service

import com.example.kotlingradlespring.data.Message
import com.example.kotlingradlespring.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(val db: MessageRepository) {
    fun findMessages(): List<Message> = db.findMessages()

    fun post(message: Message){
        db.save(message)
    }

    fun delete(id : String){
        db.deleteById(id)
    }
}