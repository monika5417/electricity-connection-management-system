package in.mpcz.electricity_connection_management_system.consumer.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ConsumerResponseDTO {
	private Long id;
	private String applicationNumber;
	private String consumerName;
	private String mobileNumber;
	private String status;
	private LocalDateTime createdAt;
}

