package com.dac.kafka.service.notification;

import com.dac.kafka.service.notification.records.NotificationInfo;

public interface INotificationService {

    public String publish(NotificationInfo notification) throws Exception;
}
