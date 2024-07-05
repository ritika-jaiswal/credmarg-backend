package com.credmarg.backend.controller;

import com.credmarg.backend.model.Vendor;
import com.credmarg.backend.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendors")
@CrossOrigin(origins = "http://localhost:3000")
public class VendorController {

    @Autowired
    private VendorRepository vendorRepository;

    @PostMapping
    public ResponseEntity<Vendor> createVendor(@RequestBody Vendor vendor) {
        if (vendor == null || vendor.getEmail() == null || vendor.getName() == null || vendor.getUpi() == null) {
            return ResponseEntity.badRequest().build();
        }

        Vendor savedVendor = vendorRepository.save(vendor);
        return ResponseEntity.ok(savedVendor);
    }

    @GetMapping
    public Iterable<Vendor> getAllVendors() {
        return vendorRepository.findAll();
    }
}
