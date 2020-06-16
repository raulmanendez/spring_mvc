package muk.spring.mvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import muk.spring.mvc.beans.User;

@Controller
@RequestMapping("/user/")
public class UserController {

	 @Autowired
	 ServletContext servletContext;
	
    @ModelAttribute("roles")
    private Map<String, String> populateRoles() {
        Map<String, String> roleMap = new HashMap<String,String>();
        roleMap.put("Admin", "Admin");
        roleMap.put("DBA", "DBA");
        return roleMap;
    }

    @GetMapping("add")
    public String getUserForm(@ModelAttribute("newUser") User user, Model model) {
        return "userForm";
    }

    @PostMapping("add")
    public String saveUser(@Valid @ModelAttribute("newUser") User user, BindingResult result,RedirectAttributes redirectAttributes) {
        if (result.hasErrors()) {
            return "userForm";
        }
        
        MultipartFile multipartFile = user.getProfile_pic();
        if (multipartFile != null || !multipartFile.isEmpty()) {

            String fileName = servletContext.getRealPath("/") + "resources\\images\\" + multipartFile.getOriginalFilename();
            System.out.println("path is::"+fileName);
            try {
                multipartFile.transferTo(new File(fileName));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        
        
        //Save to DB
       redirectAttributes.addFlashAttribute("savedUser", user);
       return "redirect:userDetails";
    }

    @GetMapping("userDetails")
    public String success() {

        return "userSuccess";
    }

}
