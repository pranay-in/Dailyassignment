
public class employee {
	 private long empID;
	    private String name,address,phone;
	    private boolean salaryPaid;
		public long getEmpID() {
			return empID;
		}
		public void setEmpID(long empID) {
			this.empID = empID;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		@Override
		public String toString() {
			return "employee [empID=" + empID + ", name=" + name + ", address=" + address + ", phone=" + phone
					+ ", salaryPaid=" + salaryPaid + ", getEmpID()=" + getEmpID() + ", getName()=" + getName()
					+ ", getAddress()=" + getAddress() + ", getPhone()=" + getPhone() + ", isSalaryPaid()="
					+ isSalaryPaid() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public boolean isSalaryPaid() {
			return salaryPaid;
		}
		public void setSalaryPaid(boolean salaryPaid) {
			this.salaryPaid = salaryPaid;
		}
}
