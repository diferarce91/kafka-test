package com.dac.kafka.service.notification.records;

public record NotificationInfoSms(String message, String subject, String phone) implements  NotificationInfo {
}
