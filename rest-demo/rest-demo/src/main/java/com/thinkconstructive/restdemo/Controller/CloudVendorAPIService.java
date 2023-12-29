package com.thinkconstructive.restdemo.Controller;

import com.thinkconstructive.restdemo.model.CloudVendor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

    CloudVendor cloudVendor;
    @PostMapping
    public String saveCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Cloud Vendor Details Added Successfully";
    }
    @GetMapping("{vendorId}")
    public CloudVendor getVendorDetails(String vendorId){

        //return new CloudVendor("c1","Rahul","Noida","9955283785");
        return cloudVendor;
    }

    @PutMapping
    public String updateVendorDetails(@RequestBody CloudVendor cloudVendor){
        this.cloudVendor=cloudVendor;
        return "Vendor Details Updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteVendorDetails(String vendorId){
        this.cloudVendor=null;
        return "Vendor Details Deleted Successfully";
    }

}
