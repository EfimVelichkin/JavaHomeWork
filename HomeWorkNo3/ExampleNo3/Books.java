package ExampleNo3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    public String nameBook;
    public String SurnameAuthor;
    public Integer YearPublic;
    public Integer Price;
    public Integer NumOfPages;
}
