package com.clone.facebookclone.Controller;

import com.clone.facebookclone.Model.PostModal;
import com.clone.facebookclone.Services.IPostService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin(value = "http://localhost:3000/")
@RestController
@RequestMapping("/api/v1/post")
public class PostController {

    private IPostService postService;

    public PostController(IPostService postService) {
        this.postService = postService;
    }

    @PostMapping
    public PostModal addPost(@RequestParam Map<String,String> requestParam) throws Exception {
        String strPost = requestParam.get("post");
        String email = requestParam.get("email");
        String name = requestParam.get("name");
        String file = requestParam.get("file");
        String profilePic = requestParam.get("profilePic");

        PostModal postModal = PostModal.builder()
                .file(file)
                .name(name)
                .email(email)
                .post(strPost)
                .profilePic(profilePic)
                .timeStamp(new Date().toString())
                .build();

        postModal = postService.addPost(postModal);
        return postModal;
    }

    @GetMapping
    public List<PostModal> getPost(){
        return  postService.getPost();
    }
}
