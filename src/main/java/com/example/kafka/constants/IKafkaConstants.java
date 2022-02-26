package com.example.kafka.constants;

public interface IKafkaConstants {
	public static String KAFKA_BROKERS = "31.130..:9092";
	
	public static Integer MESSAGE_COUNT=100;
	
	public static String CLIENT_ID="client1";
	
	public static String TOPIC_NAME="registration2";
	
	public static String GROUP_ID_CONFIG="consumerGroup10";
	
	public static Integer MAX_NO_MESSAGE_FOUND_COUNT=100;
	
	public static String OFFSET_RESET_LATEST="latest";
	
	public static String OFFSET_RESET_EARLIER="earliest";
	
	public static Integer MAX_POLL_RECORDS=1;
}
