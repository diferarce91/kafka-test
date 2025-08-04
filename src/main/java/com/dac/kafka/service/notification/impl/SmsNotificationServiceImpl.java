package com.dac.kafka.service.notification.impl;

import com.dac.kafka.service.notification.records.NotificationInfoSms;
import org.springframework.beans.factory.annotation.Value;
import software.amazon.awssdk.services.sns.model.PublishRequest;
import software.amazon.awssdk.services.sns.model.PublishResponse;

public class SmsNotificationServiceImpl extends NotificationServiceImpl {

    @Value("${aws.sns.topic.arn-sns}")
    private String topic;

    public String publish(NotificationInfoSms notificationInfo ) throws Exception {
        PublishRequest request = PublishRequest.builder()
                .topicArn(topic)
                .message(notificationInfo.message())
                .subject(notificationInfo.subject())
                .phoneNumber(notificationInfo.phone())
                .build();
        try {
            PublishResponse response = this.snsClient.publish(request);
            return response.messageId();
        } catch (Exception e) {
            throw new Exception(e.getCause());
        }
    }
}
