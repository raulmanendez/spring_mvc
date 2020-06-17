package muk.spring.mvc.beans;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;
import muk.spring.mvc.annotation.isMature;

import java.time.LocalDate;

public class User {

	    @Size(min=2, max=30, message = "{abc}")
	    private String name;

	    @Email(message = "Email must follow the formatter: ***@***")
	    @NotBlank(message = "Email must have a value")
	    private String email;

	    @isMature
	    private Integer age;

	    @NotNull(message = "birthday is a required field.")
	    @DateTimeFormat(pattern = "MM-dd-yyyy")
	    private LocalDate birthday;

	    @NotBlank(message = "Role must have a value")
	    private String role;
	    
	    private MultipartFile profile_pic;
	    
	    @Valid
	    private UserAddress addr;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		public LocalDate getBirthday() {
			return birthday;
		}

		public void setBirthday(LocalDate birthday) {
			this.birthday = birthday;
		}

		public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public MultipartFile getProfile_pic() {
			return profile_pic;
		}

		public void setProfile_pic(MultipartFile profile_pic) {
			this.profile_pic = profile_pic;
		}

		public UserAddress getAddr() {
			return addr;
		}

		public void setAddr(UserAddress addr) {
			this.addr = addr;
		}
	    
	    

}
