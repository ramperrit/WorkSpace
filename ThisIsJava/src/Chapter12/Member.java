package Chapter12;

import lombok.*;


@Getter
@Setter
@RequiredArgsConstructor                 //final, notnull > 자동으로 생성자 만들어줌
@EqualsAndHashCode                       
@ToString                                
public class Member {

	//lombok getter/setter 자동으로 만들어줌
	
	private final String id;
	private final String name;
	private final int age;
}
