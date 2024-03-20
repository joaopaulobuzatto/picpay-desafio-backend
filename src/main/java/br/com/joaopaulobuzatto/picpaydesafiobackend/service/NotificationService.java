package br.com.joaopaulobuzatto.picpaydesafiobackend.service;

import org.springframework.stereotype.Service;

import br.com.joaopaulobuzatto.picpaydesafiobackend.model.Transaction;

@Service
public class NotificationService {

    private final NotificationProducer notificationProducer;

    public NotificationService(NotificationProducer notificationProducer) {
        this.notificationProducer = notificationProducer;
    }

    public void notify(Transaction transaction) {
        notificationProducer.sendNotification(transaction);
    }

}
