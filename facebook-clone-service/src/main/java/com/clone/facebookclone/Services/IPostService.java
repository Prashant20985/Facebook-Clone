package com.clone.facebookclone.Services;

import com.clone.facebookclone.Model.PostModal;

import java.util.List;

public interface IPostService {
    PostModal addPost(PostModal postModal) throws Exception;

    List<PostModal> getPost();
}
