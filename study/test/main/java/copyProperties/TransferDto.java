package copyProperties;

import lombok.Data;

import java.io.Serializable;
@Data
public class TransferDto implements Serializable {
    private Integer id;
    private String name;
}
