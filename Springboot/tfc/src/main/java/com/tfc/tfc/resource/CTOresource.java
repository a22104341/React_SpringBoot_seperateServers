package com.tfc.tfc.resource;

import com.tfc.tfc.domain.CTO;
import com.tfc.tfc.service.CTOservice;
import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/ctos")
@RequiredArgsConstructor
public class CTOresource {
    private final CTOservice ctoService;

    @PostMapping
    public ResponseEntity<CTO> createCto(@RequestBody CTO cto) {
        //return ResponseEntity.ok().body(contactService.createContact(contact));
        return ResponseEntity.created(URI.create("/cto/userUuid")).body(ctoService.createCTO(cto));
    }

    @GetMapping("/getCtos")
    public ResponseEntity<List<CTO>> getCtos() {
        return ResponseEntity.ok().body(ctoService.getAllCtos());
    }

    @GetMapping("/{uuid}")
    public ResponseEntity<CTO> getCto(@PathVariable(value = "uuid") String uuid) {
        return ResponseEntity.ok().body(ctoService.getCTO(uuid));
    }
/*
    @PutMapping("/photo")
    public ResponseEntity<String> uploadPhoto(@RequestParam("id") String id, @RequestParam("file")MultipartFile file) {
        return ResponseEntity.ok().body(contactService.uploadPhoto(id, file));
    }*/


    /*
    @GetMapping(path = "/image/{filename}", produces = { IMAGE_PNG_VALUE, IMAGE_JPEG_VALUE })
    public byte[] getPhoto(@PathVariable("filename") String filename) throws IOException {
        return Files.readAllBytes(Paths.get(PHOTO_DIRECTORY + filename));
    }*/
}
