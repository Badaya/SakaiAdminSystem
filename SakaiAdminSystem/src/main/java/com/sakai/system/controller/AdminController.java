package com.sakai.system.controller;

import java.beans.PropertyEditorSupport;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sakai.system.domain.Block;
import com.sakai.system.domain.Course;
import com.sakai.system.domain.Section;
import com.sakai.system.domain.Student;
import com.sakai.system.domain.Teacher;
import com.sakai.system.service.BlockService;
import com.sakai.system.service.CourseSectionService;
import com.sakai.system.service.CourseService;
import com.sakai.system.service.StudentService;
import com.sakai.system.service.TeacherService;
import com.sakai.system.service.UserCredService;


@Controller
@RequestMapping(value = "/admin")
public class AdminController {
	
	@Autowired
	private BlockService blockService;
	
	@Autowired
	private CourseService courseService;
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private TeacherService teacherService;
	
	@Autowired
	private CourseSectionService courseSectionService;
	
	@Autowired
	private UserCredService userCredService;
	
	
	@RequestMapping(value = "/")
	public String home() {

		return "admin/admin_home";
	}
	
	
	

	
	
	
///////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	

	
	
	
	
	// create a course
		@RequestMapping(value = "/courses/add", method = RequestMethod.POST)
		public String createCourse(Course course) {
			courseService.create(course);
			return "redirect:./";
		}
		
		
		//add a course
		@RequestMapping(value = "/courses/add", method = RequestMethod.GET)
		public String addCourse(Model model) {
			model.addAttribute("course", new Course());
			return "admin/addcourse";
		}
		
		//get a list of course
		@RequestMapping(value = "/courses", method = RequestMethod.GET)
		public String getCourseDetails( Model model,HttpServletRequest request) {
			List<Course> courses = courseService.findAll();
			model.addAttribute("courses", courses);
			return "admin/courselist";
		}
		
		
		// update a course
		@RequestMapping(value = "/courses/{id}", method = RequestMethod.POST)
		public String updateCourse(Course course, @PathVariable int id) {
			courseService.update(id, course);
			return "redirect:/admin/courses";
		}
	
		// update a course
				@RequestMapping(value = "/courses/{id}", method = RequestMethod.GET)
				public String getupdateCourse(Model model, @PathVariable int id) {
					Course course = courseService.read(id);
					model.addAttribute("course", course);
					
					return "admin/courseupdate";
				}
		
	
	
//////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	// Create Faculty
		@RequestMapping(value = "/faculties/add", method = RequestMethod.POST)
		public String createFaculty(@ModelAttribute Teacher teacher) {
			teacherService.create(teacher);
			return "redirect:./";
		}

		//add faculty
		@RequestMapping(value = "/faculties/add", method = RequestMethod.GET)
		public String addFaculty(Model model) {
			model.addAttribute("teacher", new Teacher());
			return "admin/admin_addfaculty";
		}

		// Get Faculty Details
		@RequestMapping(value = "/faculties/", method = RequestMethod.GET)
		public String getFacultyDetails( Model model) {
			model.addAttribute("faculties",teacherService.findAll());
			return "admin/admin_facultylist";
		}
	
///////////////////////////////////////////////////////////////////////////////////////////	
	
	// create block
		@RequestMapping(value = "/block/add", method = RequestMethod.POST)
		public String createBlock(@ModelAttribute Block block,BindingResult result) {
			blockService.create(block);
			System.out.println("hello");
			return "redirect:./";
		}

		  //addBlock
		@RequestMapping(value = "/block/add", method = RequestMethod.GET)
		public String addBlock(Model model) {
			model.addAttribute("block", new Block());
			return "admin/addBlock";
		}

		// Get Block Details
		@RequestMapping(value = "/block/", method = RequestMethod.GET)
		public String getBlockDetails( Model model) {
			model.addAttribute("blocks",blockService.findAll());
			return "admin/admin_blocklist";
		}
		
///////////////////////////////////////////////////////////////////////////////////////////	
		
		//create student
		@RequestMapping(value = "/student/add", method = RequestMethod.POST)
		public String createStudent(@ModelAttribute Student  student) {
			studentService.create(student);
			System.out.println("hello");
			return "redirect:./";
		}
   // add student
		@RequestMapping(value = "/student/add", method = RequestMethod.GET)
		public String addStudent(Model model) {
			model.addAttribute("student", new Student());
			return "admin/admin_addstudent";
		}

		// Get Student Details
		@RequestMapping(value = "/student/", method = RequestMethod.GET)
		public String getStudentDetails( Model model) {
			model.addAttribute("students",studentService.findAll());
			return "admin/admin_studentlist";
		}
		
		
		
///////////////////////////////////////////////////////////////////////////////////////////	
		
		// create section
	@RequestMapping(value = "/section/add", method = RequestMethod.POST)
	public String createSection(@ModelAttribute Section section,BindingResult result) {
		courseSectionService.create(section);
		return "redirect:./?block_id="+section.getBlock().getBlockId();
	}
   
	// add Section
	@RequestMapping(value = "/section/add", method = RequestMethod.GET)
	public String addSection(Model model,@RequestParam("block_id") String id) {
		model.addAttribute("block", blockService.read(Long.parseLong(id)));
		model.addAttribute("courses", courseService.findAll());
		model.addAttribute("faculties", teacherService.findAll());
		model.addAttribute("students", studentService.findAll());
		model.addAttribute("section", new Section());
		return "admin/addsection";
	}
		

	// Get CourseSection Details
	@RequestMapping(value = "/section/", method = RequestMethod.GET)
	public String getSectionDetails(Model model, @RequestParam("block_id") String id) {
		Block block  = blockService.read(Long.parseLong(id));
		model.addAttribute("sections", block.getListSection());
		model.addAttribute("block", block);
		return "admin/sectionlist";
	}
		
	@InitBinder
	protected void initBinder(WebDataBinder binder) {

		binder.registerCustomEditor(Integer.class, "numberOfStudents",
				new PropertyEditorSupport() {

					@Override
					public void setAsText(String text) {
						Integer totalSeat = Integer.parseInt(text);
						setValue(totalSeat);
					}
				});

		binder.registerCustomEditor(Long.class, "id",
				new PropertyEditorSupport() {

					@Override
					public void setAsText(String text) {
						Long id = Long.parseLong(text);
						setValue(id);
					}
				});

		
		binder.registerCustomEditor(Teacher.class, "faculty",
				new PropertyEditorSupport() {

					@Override
					public void setAsText(String id) {
						Teacher faculty = teacherService.read(Long.parseLong(id));
						setValue(faculty);
					}
				});

		binder.registerCustomEditor(Course.class, "course",
				new PropertyEditorSupport() {

					@Override
					public void setAsText(String id) {
						Course course = courseService.read(Long.parseLong(id));
						setValue(course);
					}
				});
	}

}
		

