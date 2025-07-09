package DemoProject;

import java.math.BigDecimal;

public class EmployeeClass implements Comparable<EmployeeClass>
{
    private int empId;
    private String empName;
    private String departmentName;
    private String jobId;
    private BigDecimal salary;
    
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String jobId) {
		this.jobId = jobId;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public EmployeeClass(int empId, String empName, String departmentName, String jobId, BigDecimal salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.departmentName = departmentName;
		this.jobId = jobId;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeClass [empId=" + empId + ", empName=" + empName + ", departmentName=" + departmentName
				+ ", jobId=" + jobId + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(EmployeeClass o) {
		// TODO Auto-generated method stub
		return o.salary.compareTo(this.salary);
	} 
    
    
}
