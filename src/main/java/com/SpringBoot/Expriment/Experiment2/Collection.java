package com.SpringBoot.Expriment.Experiment2;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(method = RequestMethod.GET,value = "/Collection")
public class Collection {
    public List<Students> Students= new ArrayList<>();
    Collection(){}

    @RequestMapping(method = RequestMethod.GET,value = "/add/{name_roll_number}")
    public ResponseEntity<String> add_students(@PathVariable String name_roll_number){

            String[] Splits = name_roll_number.split("_");
            if(Splits.length == 2){
            String name = Splits[0];
            String roll_number = Splits[1];
            Students.add(new Students(name, roll_number));
            return ResponseEntity.status(200).body("Students added");
            }

            else{
                return ResponseEntity.status(500).body("Input invalid :(");
            }
    }

    @RequestMapping(method = RequestMethod.GET,value = "/view_students")
    public List<Students> view_students(){

        List<Students> Students_Details = new ArrayList<>();
        for (Students Students_Det : Students) {
            Students_Details.add(Students_Det);
        }
        return Students_Details;
    }
}
