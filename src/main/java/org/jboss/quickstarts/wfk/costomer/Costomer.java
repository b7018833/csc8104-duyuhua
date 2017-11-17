package org.jboss.quickstarts.wfk.costomer;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;


public class Costomer {
	    @NotNull // id
	    @Id
	    @GeneratedValue(strategy = GenerationType.TABLE) // zhu jian
	    private Long id;

	    @NotNull // name
	    @Length(min = 1, max = 50)
	    @Pattern(regexp = "[A-Za-z-']+", message = "Please use a name without numbers or specials")
	    @Column(name = "name")
	    private String Name;

	    @NotNull // email
	    @NotEmpty
	    @Email(message = "The email address must be in the format of name@domain.com")
	    private String email;

	    @NotNull // phonenumber
	    @Pattern(regexp = "^\\([0][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]$")
	    @Column(name = "phone_number")
	    private String phoneNumber;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			return super.equals(obj);
		}

		@Override
		protected Object clone() throws CloneNotSupportedException {
			// TODO Auto-generated method stub
			return super.clone();
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}

		@Override
		protected void finalize() throws Throwable {
			// TODO Auto-generated method stub
			super.finalize();
		}
	    
	    
	    
	    
	    
	    
}
