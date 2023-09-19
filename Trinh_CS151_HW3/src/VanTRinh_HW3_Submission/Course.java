/**
 *  Exercise 1
 *  Course.java
 * This class contains the following fields:
 * course name, course description, department, time the course starts,
 * weekday the course is held on
 * This class should contain getters and setters for all its attributes.
 * This class has one constructor.
 * The class is able to undergo deep copy by implementing Cloneable interface
 * @author vuaivantrinhsjgmail.com
 *
 */
public class Course implements Cloneable {
	private String courseName, courseDescription, department,
					timeStart, weekDayHold ;
	
	/**
	 * @param courseName The course name
	 * @param courseDescription The course description
	 * @param department The department that course belong to
	 * @param timeStart The time the course starts 
	 * @param weekday The weekday the course is held.
	 */
	

	public Course(String courseName, String courseDescription, String department
				, String timeStart, String weekDayHold) {
		
		// TODO Auto-generated constructor stub
	}
	
	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(String timeStart) {
		this.timeStart = timeStart;
	}

	public String getWeekDayHold() {
		return weekDayHold;
	}

	public void setWeekDayHold(String weekDayHold) {
		this.weekDayHold = weekDayHold;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		Course course = (Course)super.clone();
		return course; 
		
	}

	
		// TODO Auto-generated method stub
		
	}

	


