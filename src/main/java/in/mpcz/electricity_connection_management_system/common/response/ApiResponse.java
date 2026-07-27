package in.mpcz.electricity_connection_management_system.common.response;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse<T> {

    private boolean success;

    private int statusCode;

    private String message;

    private T data;

    private LocalDateTime timestamp;
    
    private String kuchBhi;
    
    private String oneMoreAdded;

}