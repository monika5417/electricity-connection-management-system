package in.mpcz.electricity_connection_management_system.consumer.dto;

import java.math.BigDecimal;

import in.mpcz.electricity_connection_management_system.common.enums.ConnectionType;
import in.mpcz.electricity_connection_management_system.common.enums.LoadUnit;
import lombok.Data;

@Data
public class ConsumerRequestDTO {
	private String consumerName;
	private String fatherName;
	private String mobileNumber;
	private String email;
	private String address;
	private String city;
	private String district;
	private String state;
	private String pincode;
	private BigDecimal loadRequired;
	private LoadUnit loadUnit;
	private ConnectionType connectionType;
}

