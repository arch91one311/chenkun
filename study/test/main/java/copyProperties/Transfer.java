package copyProperties;

import lombok.Data;

import java.io.Serializable;

@Data
public class Transfer implements Serializable {
    private Integer id;
    private String name;
}
