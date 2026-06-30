package com.vinilcode.projects.lovable_clone.controller;

import com.vinilcode.projects.lovable_clone.dto.project.FileContentResponse;
import com.vinilcode.projects.lovable_clone.dto.project.FileNode;
import com.vinilcode.projects.lovable_clone.service.FileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/projects/{projectId}/files")
public class FileController {

    private final FileService fileService;

    @GetMapping
    public ResponseEntity<List<FileNode>> getFileTree(@PathVariable Long projectId){
        Long userId = 1L;
        return ResponseEntity.ok(fileService.getFileTree(projectId,userId));
    }

    @GetMapping("/*path*") // /src/hooks/get-user-hooks.jsx  <- example
    public ResponseEntity<FileContentResponse> getFile(@PathVariable Long projectId, @PathVariable String path) {
        Long userId = 1L;
        //Resource file = fileService.getFile(projectId, userId);
        return ResponseEntity.ok(fileService.getFileContent(projectId,path,userId));
    }

//    @GetMapping("/download-zip")
//    public ResponseEntity<Resource> downloadZip(@PathVariable Long projectId) {
//        Long userId = 1L;
//        Resource zip = fileService.downloadZip(projectId, userId);
//        return ResponseEntity.ok()
//                .contentType(MediaType.APPLICATION_OCTET_STREAM)
//                .header(HttpHeaders.CONTENT_DISPOSITION,
//                        "attachment; filename=\"project-" + projectId + ".zip\"")
//                .body(zip);
//    }

}
