package com.dac.kafka.service.notification.records;

public record NotificationInfoEmail(String message, String subject) implements NotificationInfo {
}
