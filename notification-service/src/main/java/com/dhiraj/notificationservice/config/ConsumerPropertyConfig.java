package com.dhiraj.notificationservice.config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

import java.util.HashMap;
import java.util.Map;
public class ConsumerPropertyConfig{
//@Bean
//public ConsumerFactory<String, Object> consumerFactory() {
//    Map<String, Object> configProps = new HashMap<>();
//    configProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//    configProps.put(ConsumerConfig.GROUP_ID_CONFIG, "paymentGroup");
//    configProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
//    configProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//    configProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
//
//    // Set the trusted packages to allow deserialization of your classes
//    configProps.put(JsonDeserializer.TRUSTED_PACKAGES, "*");
//
//    // Optional: Define type mapping if needed
//    configProps.put(JsonDeserializer.TYPE_MAPPINGS,
//        "paymentConfirmation:com.dhiraj.notificationservice.kafka.payment.PaymentNotificationRequest," +
//        "orderConfirmation:com.dhiraj.notificationservice.kafka.order.OrderConfirmation");
//
//    return new DefaultKafkaConsumerFactory<>(configProps);
//}
//
//@Bean
//public ConcurrentKafkaListenerContainerFactory<String, Object> kafkaListenerContainerFactory() {
//    ConcurrentKafkaListenerContainerFactory<String, Object> factory =
//        new ConcurrentKafkaListenerContainerFactory<>();
//    factory.setConsumerFactory(consumerFactory());
//    return factory;
//}

}