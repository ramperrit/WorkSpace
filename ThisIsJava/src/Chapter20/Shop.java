package Chapter20;

import java.sql.Date;
import lombok.*;

@Data
public class Shop {
	private String userID;
	private String name;
	private int birthYear;
	private String addr;
	private String mobile1;
	private String mobile2;
	private int height;
	private Date mDate;
}
