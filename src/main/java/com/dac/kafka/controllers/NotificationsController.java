package com.dac.kafka.controllers;

import com.dac.kafka.service.notification.impl.MailNotificationServiceImpl;
import com.dac.kafka.service.notification.records.NotificationInfo;
import com.dac.kafka.service.notification.records.NotificationInfoEmail;
import com.dac.kafka.service.notification.records.NotificationInfoSms;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController()
public class NotificationsController {

    @Autowired
    MailNotificationServiceImpl mailNotificationService;

    @PostMapping("/smsnotification")
    public ResponseEntity smsNotification(@RequestBody NotificationInfoSms notificationInfo) throws Exception {
        String response = mailNotificationService.publish(notificationInfo);
        return ResponseEntity.ok(response);
    }

    @PostMapping("/mailnotification")
    public ResponseEntity mailNotification(@RequestBody NotificationInfoEmail notificationInfo) throws Exception {
        String response = mailNotificationService.publish(notificationInfo);
        return ResponseEntity.ok(response);
    }
}
