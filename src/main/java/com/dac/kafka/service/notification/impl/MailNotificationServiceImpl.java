package com.dac.kafka.service.notification.impl;

import com.dac.kafka.service.notification.records.NotificationInfoEmail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import software.amazon.awssdk.services.sns.model.PublishRequest;
import software.amazon.awssdk.services.sns.model.PublishResponse;

@Service
public class MailNotificationServiceImpl extends NotificationServiceImpl {

    @Value("${aws.sns.topic.arn-mail}")
    private String topic;

    public String publish(NotificationInfoEmail notificationInfo ) throws Exception {
        PublishRequest request = PublishRequest.builder()
                .topicArn(topic)
                .message(notificationInfo.message())
                .subject(notificationInfo.subject())
                .build();
        try {
            PublishResponse response = this.snsClient.publish(request);
            return response.messageId();
        } catch (Exception e) {
            throw new Exception(e.getCause());
        }
    }

}
