package io.tam.taskmanager.db;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@DynamoDbBean //annotation for DynamoDb mappable entity.
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task {

    private Long id;
    private LocalDateTime date;
    private String text;
    private Boolean reminder;
}
