import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/vendordetails")
public class vendordetailsController {
        vendordetails det;
        @GetMapping("{vendor_id}")
        public vendordetails getdetails(String vendor_id){
           //return new vendordetails("1","Bobby");
           return det;
        }

        @PostMapping
        public String createvendordetails(@RequestBody vendordetails det){
          this.det=det;
          return "created successfully";
        }

        @PutMapping
        public String updatevendordetails(@RequestBody vendordetails det){
          this.det=det;
          return "updated successfully";
        }

        @DeleteMapping("{id}")
        public String deletevendordetails(String vendor_id){
                //this.det=det;
                return "deleted successfully";
        }
    }
