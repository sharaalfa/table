package sharafutdinov.artur.testsb.controllers;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import sharafutdinov.artur.testsb.data.FromXML;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by first on 14.04.17.
 */
@Controller
public class UserController {
    private final Logger logger = org.slf4j.LoggerFactory.getLogger(UserController.class);


    @RequestMapping(value = "/table", method = RequestMethod.GET)
    public String chartImage(Model model){
        model.addAttribute("assc");
        return "/table";
    }

    @RequestMapping(value = "/data.json", method = RequestMethod.GET)
    public String chartShow(Model model) {

        FromXML fromXML = new FromXML();



        model.addAttribute("number", fromXML.withXML("doc", "field1"));
        model.addAttribute("fio", fromXML.withXML("doc", "field2"));
        model.addAttribute("bithday", fromXML.withXML("doc", "field3"));
        model.addAttribute("height", fromXML.withXML("doc", "field4"));
        model.addAttribute("weight", fromXML.withXML("doc", "field5"));
        model.addAttribute("sex", fromXML.withXML("doc", "field6"));


        return "/data";


    }



}
