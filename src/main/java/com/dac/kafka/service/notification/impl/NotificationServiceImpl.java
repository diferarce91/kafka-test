package com.dac.kafka.service.notification.impl;

import com.dac.kafka.service.notification.INotificationService;
import com.dac.kafka.service.notification.records.NotificationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.sns.SnsClient;

@Service
public class NotificationServiceImpl implements INotificationService {

    @Autowired
    protected SnsClient snsClient;

    /**
     * @param notification
     * @return
     */
    @Override
    public String publish(NotificationInfo notification) throws Exception {
        return "";
    }
}
