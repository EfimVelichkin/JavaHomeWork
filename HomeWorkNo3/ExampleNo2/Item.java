package ExampleNo2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    public String name;
    public String country;
    public Double weight;
    public Integer price;
    public Integer variety;
}
