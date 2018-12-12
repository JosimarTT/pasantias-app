package integrador.pasantias.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "careers", uniqueConstraints = { @UniqueConstraint(columnNames = { "code" }),
		@UniqueConstraint(columnNames = { "career" }), })

public class Career {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(max = 5)
	private String code;

	@NotBlank
	@Size(max = 100)
	private String career;

}
